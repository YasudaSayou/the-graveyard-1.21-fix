package com.finallion.graveyard.init;

import com.finallion.graveyard.TheGraveyard;
import com.finallion.graveyard.item.*;
import net.minecraft.world.item.*;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class TGItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TheGraveyard.MOD_ID);

    public static final DeferredItem<Item> INCARNATED_EVIL_MUSIC_DISC = ITEMS.register("incarnated_evil_music_disc", () -> new Item(new Item.Properties().jukeboxPlayable(TGSounds.LICH_THEME_01_KEY).rarity(Rarity.RARE).stacksTo(1)));

    public static final DeferredItem<Item> SKELETON_CREEPER_SPAWN_EGG = ITEMS.register("skeleton_creeper_spawn_egg", () -> new DeferredSpawnEggItem(TGEntities.SKELETON_CREEPER, 7960171, 15263976, (new Item.Properties())));
    public static final DeferredItem<Item> ACOLYTE_SPAWN_EGG = ITEMS.register("acolyte_spawn_egg", () -> new DeferredSpawnEggItem(TGEntities.ACOLYTE, 2688830, 5898240, (new Item.Properties())));
    public static final DeferredItem<Item> GHOUL_SPAWN_EGG = ITEMS.register("ghoul_spawn_egg", () -> new DeferredSpawnEggItem(TGEntities.GHOUL, 6239802, 16487198, (new Item.Properties())));
    public static final DeferredItem<Item> REAPER_SPAWN_EGG = ITEMS.register("reaper_spawn_egg", () -> new DeferredSpawnEggItem(TGEntities.REAPER, 1381653, 7456477, (new Item.Properties())));
    public static final DeferredItem<Item> REVENANT_SPAWN_EGG = ITEMS.register("revenant_spawn_egg", () -> new DeferredSpawnEggItem(TGEntities.REVENANT, 12965589, 9765908, (new Item.Properties())));
    public static final DeferredItem<Item> NIGHTMARE_SPAWN_EGG = ITEMS.register("nightmare_spawn_egg", () -> new DeferredSpawnEggItem(TGEntities.NIGHTMARE, 592137, 4718849, (new Item.Properties())));
    public static final DeferredItem<Item> LICH_SPAWN_EGG = ITEMS.register("lich_spawn_egg", () -> new DeferredSpawnEggItem(TGEntities.LICH, 13750223, 4144959, (new Item.Properties())));
    public static final DeferredItem<Item> NAMELESS_HANGED_SPAWN_EGG = ITEMS.register("nameless_hanged_spawn_egg", () -> new DeferredSpawnEggItem(TGEntities.NAMELESS_HANGED, 5389367, 9803156, (new Item.Properties())));
    public static final DeferredItem<Item> WRAITH_SPAWN_EGG = ITEMS.register("wraith_spawn_egg", () -> new DeferredSpawnEggItem(TGEntities.WRAITH, 1644568, 16777215, (new Item.Properties())));
    public static final DeferredItem<Item> CORRUPTED_PILLAGER_SPAWN_EGG = ITEMS.register("corrupted_pillager_spawn_egg", () -> new DeferredSpawnEggItem(TGEntities.CORRUPTED_PILLAGER, 7567737, 4924973, (new Item.Properties())));
    public static final DeferredItem<Item> CORRUPTED_VINDICATOR_SPAWN_EGG = ITEMS.register("corrupted_vindicator_spawn_egg", () -> new DeferredSpawnEggItem(TGEntities.CORRUPTED_VINDICATOR, 7567737, 2380632, (new Item.Properties())));

    public static final DeferredItem<Item> BONE_DAGGER = ITEMS.register("bone_dagger", () -> new DaggerItem(Tiers.STONE, new Item.Properties().attributes(DaggerItem.createAttributes(Tiers.STONE, 3, -2.0F))));
    public static final DeferredItem<Item> DARK_IRON_INGOT = ITEMS.register("dark_iron_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CORRUPTION = ITEMS.register("corruption", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> SARCOPHAGUS_LID = ITEMS.register("sarcophagus_lid", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SARCOPHAGUS_BASE = ITEMS.register("sarcophagus_base", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DARK_OAK_COFFIN_LID = ITEMS.register("dark_oak_coffin_lid", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DARK_OAK_COFFIN_BASE = ITEMS.register("dark_oak_coffin_base", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> OAK_COFFIN_LID = ITEMS.register("oak_coffin_lid", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> OAK_COFFIN_BASE = ITEMS.register("oak_coffin_base", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BIRCH_COFFIN_LID = ITEMS.register("birch_coffin_lid", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BIRCH_COFFIN_BASE = ITEMS.register("birch_coffin_base", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> JUNGLE_COFFIN_LID = ITEMS.register("jungle_coffin_lid", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> JUNGLE_COFFIN_BASE = ITEMS.register("jungle_coffin_base", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ACACIA_COFFIN_LID = ITEMS.register("acacia_coffin_lid", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ACACIA_COFFIN_BASE = ITEMS.register("acacia_coffin_base", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SPRUCE_COFFIN_LID = ITEMS.register("spruce_coffin_lid", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SPRUCE_COFFIN_BASE = ITEMS.register("spruce_coffin_base", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> WARPED_COFFIN_LID = ITEMS.register("warped_coffin_lid", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> WARPED_COFFIN_BASE = ITEMS.register("warped_coffin_base", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CRIMSON_COFFIN_LID = ITEMS.register("crimson_coffin_lid", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CRIMSON_COFFIN_BASE = ITEMS.register("crimson_coffin_base", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MANGROVE_COFFIN_LID = ITEMS.register("mangrove_coffin_lid", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MANGROVE_COFFIN_BASE = ITEMS.register("mangrove_coffin_base", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BAMBOO_COFFIN_LID = ITEMS.register("bamboo_coffin_lid", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BAMBOO_COFFIN_BASE = ITEMS.register("bamboo_coffin_base", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CHERRY_COFFIN_LID = ITEMS.register("cherry_coffin_lid", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CHERRY_COFFIN_BASE = ITEMS.register("cherry_coffin_base", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> VIAL_OF_BLOOD = ITEMS.register("vial_of_blood", VialOfBlood::new);

    public static final DeferredItem<Item> WHITE_BONE_STAFF = ITEMS.register("white_bone_staff", () -> new BoneStaffItem((byte) 1));
    public static final DeferredItem<Item> BLACK_BONE_STAFF = ITEMS.register("black_bone_staff", () -> new BoneStaffItem((byte) 2));
    public static final DeferredItem<Item> RED_BONE_STAFF = ITEMS.register("red_bone_staff", () -> new BoneStaffItem((byte) 3));
    public static final DeferredItem<Item> CYAN_BONE_STAFF = ITEMS.register("cyan_bone_staff", () -> new BoneStaffItem((byte) 4));
    public static final DeferredItem<Item> PURPLE_BONE_STAFF = ITEMS.register("purple_bone_staff", () -> new BoneStaffItem((byte) 5));
}
