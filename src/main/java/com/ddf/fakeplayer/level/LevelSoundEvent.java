package com.ddf.fakeplayer.level;

public enum LevelSoundEvent {
    ItemUseOn(0x0),
    Hit(0x1),
    Step(0x2),
    Fly(0x3),
    Jump(0x4),
    Break(0x5),
    Place(0x6),
    HeavyStep(0x7),
    Gallop(0x8),
    Fall(0x9),
    Ambient_0(0xA),
    AmbientBaby(0xB),
    AmbientInWater(0xC),
    Breathe(0xD),
    Death(0xE),
    DeathInWater(0xF),
    DeathToZombie(0x10),
    Hurt(0x11),
    HurtInWater(0x12),
    Mad(0x13),
    Boost(0x14),
    Bow_0(0x15),
    SquishBig(0x16),
    SquishSmall(0x17),
    FallBig(0x18),
    FallSmall(0x19),
    Splash(0x1A),
    Fizz(0x1B),
    Flap(0x1C),
    Swim(0x1D),
    Drink_0(0x1E),
    Eat_0(0x1F),
    Takeoff(0x20),
    Shake(0x21),
    Plop(0x22),
    Land(0x23),
    Saddle(0x24),
    Armor(0x25),
    ArmorPlace(0x26),
    AddChest(0x27),
    Throw(0x28),
    Attack(0x29),
    AttackNoDamage(0x2A),
    AttackStrong(0x2B),
    Warn(0x2C),
    Shear(0x2D),
    Milk(0x2E),
    Thunder(0x2F),
    Explode_0(0x30),
    Fire(0x31),
    Ignite(0x32),
    Fuse(0x33),
    Stare(0x34),
    Spawn(0x35),
    Shoot(0x36),
    BreakBlock(0x37),
    Launch(0x38),
    Blast(0x39),
    LargeBlast(0x3A),
    Twinkle(0x3B),
    Remedy(0x3C),
    Unfect(0x3D),
    LevelUp(0x3E),
    BowHit(0x3F),
    BulletHit(0x40),
    ExtinguishFire(0x41),
    ItemFizz(0x42),
    ChestOpen(0x43),
    ChestClosed(0x44),
    ShulkerBoxOpen(0x45),
    ShulkerBoxClosed(0x46),
    EnderChestOpen(0x47),
    EnderChestClosed(0x48),
    PowerOn(0x49),
    PowerOff(0x4A),
    Attach(0x4B),
    Detach(0x4C),
    Deny(0x4D),
    Tripod(0x4E),
    Pop(0x4F),
    DropSlot(0x50),
    Note_0(0x51),
    Thorns(0x52),
    PistonIn(0x53),
    PistonOut(0x54),
    Portal_0(0x55),
    Water(0x56),
    LavaPop(0x57),
    Lava_0(0x58),
    Burp(0x59),
    BucketFillWater(0x5A),
    BucketFillLava(0x5B),
    BucketEmptyWater(0x5C),
    BucketEmptyLava(0x5D),
    EquipChain(0x5E),
    EquipDiamond(0x5F),
    EquipGeneric(0x60),
    EquipGold(0x61),
    EquipIron(0x62),
    EquipLeather(0x63),
    EquipElytra(0x64),
    Record13(0x65),
    RecordCat(0x66),
    RecordBlocks(0x67),
    RecordChirp(0x68),
    RecordFar(0x69),
    RecordMall(0x6A),
    RecordMellohi(0x6B),
    RecordStal(0x6C),
    RecordStrad(0x6D),
    RecordWard(0x6E),
    Record11(0x6F),
    RecordWait(0x70),
    RecordNull(0x71),
    Flop(0x72),
    GuardianCurse(0x73),
    MobWarning(0x74),
    MobWarningBaby(0x75),
    Teleport_0(0x76),
    ShulkerOpen(0x77),
    ShulkerClose(0x78),
    Haggle(0x79),
    HaggleYes(0x7A),
    HaggleNo(0x7B),
    HaggleIdle(0x7C),
    ChorusGrow(0x7D),
    ChorusDeath(0x7E),
    Glass(0x7F),
    PotionBrewed(0x80),
    CastSpell(0x81),
    PrepareAttackSpell(0x82),
    PrepareSummon(0x83),
    PrepareWololo(0x84),
    Fang(0x85),
    Charge(0x86),
    TakePicture(0x87),
    PlaceLeashKnot(0x88),
    BreakLeashKnot(0x89),
    AmbientGrowl(0x8A),
    AmbientWhine(0x8B),
    AmbientPant(0x8C),
    AmbientPurr(0x8D),
    AmbientPurreow(0x8E),
    DeathMinVolume(0x8F),
    DeathMidVolume(0x90),
    ImitateBlaze(0x91),
    ImitateCaveSpider(0x92),
    ImitateCreeper(0x93),
    ImitateElderGuardian(0x94),
    ImitateEnderDragon(0x95),
    ImitateEnderman(0x96),
    ImitateEndermite(0x97),
    ImitateEvocationIllager(0x98),
    ImitateGhast(0x99),
    ImitateHusk(0x9A),
    ImitateIllusionIllager(0x9B),
    ImitateMagmaCube(0x9C),
    ImitatePolarBear(0x9D),
    ImitateShulker(0x9E),
    ImitateSilverfish(0x9F),
    ImitateSkeleton(0xA0),
    ImitateSlime(0xA1),
    ImitateSpider(0xA2),
    ImitateStray(0xA3),
    ImitateVex(0xA4),
    ImitateVindicationIllager(0xA5),
    ImitateWitch(0xA6),
    ImitateWither(0xA7),
    ImitateWitherSkeleton(0xA8),
    ImitateWolf(0xA9),
    ImitateZombie(0xAA),
    ImitateZombiePigman(0xAB),
    ImitateZombieVillager(0xAC),
    EnderEyePlaced(0xAD),
    EndPortalCreated(0xAE),
    AnvilUse(0xAF),
    BottleDragonBreath(0xB0),
    PortalTravel(0xB1),
    TridentHit(0xB2),
    TridentReturn(0xB3),
    TridentRiptide_1(0xB4),
    TridentRiptide_2(0xB5),
    TridentRiptide_3(0xB6),
    TridentThrow(0xB7),
    TridentThunder(0xB8),
    TridentHitGround(0xB9),
    Default_4(0xBA),
    FletchingTableUse(0xBB),
    ElemConstructOpen(0xBC),
    IceBombHit(0xBD),
    BalloonPop(0xBE),
    LTReactionIceBomb(0xBF),
    LTReactionBleach(0xC0),
    LTReactionElephantToothpaste(0xC1),
    LTReactionElephantToothpaste2(0xC2),
    LTReactionGlowStick(0xC3),
    LTReactionGlowStick2(0xC4),
    LTReactionLuminol(0xC5),
    LTReactionSalt(0xC6),
    LTReactionFertilizer(0xC7),
    LTReactionFireball(0xC8),
    LTReactionMagnesiumSalt(0xC9),
    LTReactionMiscFire(0xCA),
    LTReactionFire(0xCB),
    LTReactionMiscExplosion(0xCC),
    LTReactionMiscMystical(0xCD),
    LTReactionMiscMystical2(0xCE),
    LTReactionProduct(0xCF),
    SparklerUse(0xD0),
    GlowStickUse(0xD1),
    SparklerActive(0xD2),
    ConvertToDrowned(0xD3),
    BucketFillFish(0xD4),
    BucketEmptyFish(0xD5),
    BubbleColumnUpwards(0xD6),
    BubbleColumnDownwards(0xD7),
    BubblePop(0xD8),
    BubbleUpInside(0xD9),
    BubbleDownInside(0xDA),
    HurtBaby(0xDB),
    DeathBaby(0xDC),
    StepBaby(0xDD),
    SpawnBaby(0xDE),
    Born(0xDF),
    TurtleEggBreak(0xE0),
    TurtleEggCrack(0xE1),
    TurtleEggHatched(0xE2),
    LayEgg(0xE3),
    TurtleEggAttacked(0xE4),
    BeaconActivate(0xE5),
    BeaconAmbient(0xE6),
    BeaconDeactivate(0xE7),
    BeaconPower(0xE8),
    ConduitActivate(0xE9),
    ConduitAmbient(0xEA),
    ConduitAttack(0xEB),
    ConduitDeactivate(0xEC),
    ConduitShort(0xED),
    Swoop(0xEE),
    BambooSaplingPlace(0xEF),
    PreSneeze(0xF0),
    Sneeze_0(0xF1),
    AmbientTame(0xF2),
    Scared(0xF3),
    ScaffoldingClimb(0xF4),
    CrossbowLoadingStart(0xF5),
    CrossbowLoadingMiddle(0xF6),
    CrossbowLoadingEnd(0xF7),
    CrossbowShoot(0xF8),
    CrossbowQuickChargeStart(0xF9),
    CrossbowQuickChargeMiddle(0xFA),
    CrossbowQuickChargeEnd(0xFB),
    AmbientAggressive(0xFC),
    AmbientWorried(0xFD),
    CantBreed(0xFE),
    ShieldBlock(0xFF),
    LecternBookPlace(0x100),
    GrindstoneUse(0x101),
    Bell(0x102),
    CampfireCrackle(0x103),
    SweetBerryBushHurt(0x106),
    SweetBerryBushPick(0x107),
    Roar(0x104),
    Stun(0x105),
    CartographyTableUse(0x108),
    StonecutterUse(0x109),
    ComposterEmpty(0x10A),
    ComposterFill(0x10B),
    ComposterFillLayer(0x10C),
    ComposterReady(0x10D),
    BarrelOpen(0x10E),
    BarrelClose(0x10F),
    RaidHorn(0x110),
    LoomUse(0x111),
    AmbientInRaid(0x112),
    UICartographyTableUse(0x113),
    UIStonecutterUse(0x114),
    UILoomUse(0x115),
    SmokerUse(0x116),
    BlastFurnaceUse(0x117),
    SmithingTableUse(0x118),
    Screech(0x119),
    Sleep(0x11A),
    FurnaceUse(0x11B),
    MooshroomConvert(0x11C),
    MilkSuspiciously(0x11D),
    Celebrate(0x11E),
    JumpPrevent(0x11F),
    AmbientPollinate(0x120),
    BeehiveDrip(0x121),
    BeehiveEnter(0x122),
    BeehiveExit(0x123),
    BeehiveWork(0x124),
    BeehiveShear(0x125),
    HoneybottleDrink(0x126),
    Undefined_5(0x127);

    private final int value;

    LevelSoundEvent(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static LevelSoundEvent getByValue(int value) {
        for (LevelSoundEvent levelSoundEvent : values()) {
            if (levelSoundEvent.getValue() == value) {
                return levelSoundEvent;
            }
        }
        return null;
    }
}
