package com.ddf.fakeplayer.main.cli;

import com.ddf.fakeplayer.client.Client;
import com.ddf.fakeplayer.main.I18N;
import com.ddf.fakeplayer.main.config.Config;
import com.ddf.fakeplayer.main.Main;
import com.ddf.fakeplayer.main.config.PlayerData;
import com.ddf.fakeplayer.util.Logger;
import com.ddf.fakeplayer.main.Util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;

public class CLIMain extends Main {
    private boolean stopped = false;
    private final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    private CLIMain(Config config) throws IOException {
        super(config);
        logger.log(I18N.get("log.configFileLoaded") + " ", config.getConfigPath().toRealPath().toString());
    }

    @Override
    public void initLogger() {
        Logger.init(new Logger() {
            @Override
            public synchronized void log(Object... log) {
                StringBuilder stringBuilder = new StringBuilder();
                for (Object obj : log) {
                    if (config.isDebug() && obj instanceof Throwable) {
                        stringBuilder.append(Util.getStackTrace((Throwable) obj));
                        continue;
                    }
                    stringBuilder.append(obj);
                }
                System.out.println(LocalDateTime.now().format(Logger.FORMATTER) + stringBuilder.toString());
            }
        });
    }

    public void start() throws IOException {
        if (!config.isConfigured()) {
            logger.log("请输入服务器地址，默认localhost，按回车键结束输入: ");
            String address = readLine();
            if (address == null) {
                return;
            } else if (!address.isEmpty()) {
                config.setServerAddress(address);
            }
            logger.log("请输入服务器端口，默认19132，按回车键结束输入: ");
            String port = readLine();
            if (port == null) {
                return;
            } else if (!port.isEmpty()) {
                config.setServerPort(Integer.parseInt(port));
            }

            logger.log("配置完成");
            logger.log("请将以下配置添加到BDS的server.properties中并重启BDS: ");
            System.out.println("trusted-key=" + config.getServerPublicKey());
            config.setConfigured(true);
            config.save();
        }
        setWebSocketEnabled(config.isWebSocketEnabled());

        config.getPlayerDataList().forEach(this::addClient);
        clients.forEach(client -> {
            // 如果上一次退出前是在线状态，则connect
            // 否则不自动连接
            //if(config.getPlayerData(client.getPlayerName()).getOnlineStatus())
            client.connect(config.getServerAddress(), config.getServerPort());
        });

        logger.log("启动完成，输入help或?可查看帮助");

        while (!isStopped()) {
            String line = readLine();
            if (line == null) {
                return;
            }
            String[] string = line.split(" ");
            if (string.length <= 0) {
                continue;
            }
            switch (string[0]) {
                case "？":
                case "?":
                case "help":
                    logger.log("add 假人名称 - 添加一个假人");
                    logger.log("connect 假人名称 - 上线一个假人");
                    logger.log("disconnect 假人名称 - 下线一个假人");
                    logger.log("remove 假人名称 - 移除一个假人");
                    logger.log("list - 列出所有假人");
                    logger.log("stop - 断开所有连接并停止运行");
                    logger.log("enableWebSocket - 启用WebSocket");
                    logger.log("disableWebSocket - 禁用WebSocket");
                    logger.log("publicKey - 显示当前使用的公钥");
                    logger.log("help - 显示此帮助信息");
                    break;
                case "add":
                    if (string.length >= 2) {
                        String playerName = string[1];
                        PlayerData playerData = new PlayerData(playerName, "steve");
                        addPlayer(playerData);
                    }
                    break;
                case "remove":
                    if (string.length >= 2) {
                        String playerName = string[1];
                        removePlayer(playerName);
                    }
                    break;
                case "connect":
                    if(string.length >= 2){
                        String playerName = string[1];
                        Client client = getClient(playerName);
                        if (client == null)
                            logger.log(playerName + " 未找到");
                        else if (client.isConnected())
                            logger.log(playerName + " 已在线");
                        else {
                            client.connect(getConfig().getServerAddress(), getConfig().getServerPort());
                            logger.log(playerName + " 上线成功");
                        }
                    }
                    break;
                case "disconnect":
                    if(string.length >= 2) {
                        String playerName = string[1];
                        Client client = getClient(playerName);
                        if (client == null)
                            logger.log(playerName + " 未找到");
                        else if (!client.isConnected())
                            logger.log(playerName + " 已离线");
                        else {
                            client.stop();
                            logger.log(playerName + " 下线成功");
                        }
                    }
                    break;
                case "list":
                    logger.log("目前共有 ", clients.size(), " 个假人: ");
                    clients.forEach(client -> logger.log(client.getPlayerName() + " - " + (client.isConnected() ? "在线" : "离线")));
                    break;
                case "publicKey":
                    logger.log(config.getServerPublicKey());
                    break;
                case "stop":
                    logger.log("正在停止...");
                    stop();
                    break;
                case "enableWebSocket":
                    setWebSocketEnabled(true);
                    break;
                case "disableWebSocket":
                    setWebSocketEnabled(false);
                    break;
            }
        }
        logger.log("已停止");
    }

    private String readLine() throws IOException {
        return reader.readLine();
    }

    public void stop() {
        clients.forEach(client -> client.setStop(true));
        clients.forEach(Client::close);
        stopWebSocket();
        stopped = true;
    }

    public boolean isStopped() {
        return stopped;
    }

    public static void main(Config config) throws IOException {
        CLIMain cliMain = new CLIMain(config);
        cliMain.start();
        config.save();
    }
}
