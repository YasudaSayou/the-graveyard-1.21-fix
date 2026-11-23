package com.finallion.graveyard.init;

import com.finallion.graveyard.TheGraveyard;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class TGCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TheGraveyard.MOD_ID);

    public static final Supplier<CreativeModeTab> ITEMS_TAB = CREATIVE_MODE_TAB.register("items_tab", () -> CreativeModeTab.builder()
        .icon(() -> new ItemStack(Items.SKELETON_SKULL))
        .title(Component.translatable("itemGroup.graveyard_group"))
        .displayItems((featureFlags, output) -> {
            output.accept(TGItems.INCARNATED_EVIL_MUSIC_DISC);

            output.accept(TGItems.CORRUPTION);
            output.accept(TGBlocks.DARK_IRON_BLOCK);
            output.accept(TGItems.DARK_IRON_INGOT);
            output.accept(TGBlocks.DARK_IRON_DOOR);
            output.accept(TGBlocks.DARK_IRON_TRAPDOOR);
            output.accept(TGBlocks.DARK_IRON_BARS);
            output.accept(TGBlocks.SOUL_FIRE_BRAZIER);
            output.accept(TGBlocks.FIRE_BRAZIER);
            output.accept(TGBlocks.PEDESTAL);
            output.accept(TGBlocks.CANDLE_HOLDER);
            output.accept(TGBlocks.GRAVESTONE);
            output.accept(TGBlocks.COBBLESTONE_GRAVESTONE);
            output.accept(TGBlocks.MOSSY_COBBLESTONE_GRAVESTONE);
            output.accept(TGBlocks.DEEPSLATE_GRAVESTONE);
            output.accept(TGBlocks.BLACKSTONE_GRAVESTONE);
            output.accept(TGBlocks.GILDED_BLACKSTONE_GRAVESTONE);
            output.accept(TGBlocks.CRACKED_BLACKSTONE_GRAVESTONE);
            output.accept(TGBlocks.STONE_BRICKS_GRAVESTONE);
            output.accept(TGBlocks.MOSSY_STONE_BRICKS_GRAVESTONE);
            output.accept(TGBlocks.BRICKS_GRAVESTONE);
            output.accept(TGBlocks.QUARTZ_BRICKS_GRAVESTONE);
            output.accept(TGBlocks.RED_SANDSTONE_GRAVESTONE);
            output.accept(TGBlocks.SANDSTONE_GRAVESTONE);

            output.accept(TGBlocks.SKULL_WITH_RIB_CAGE);
            output.accept(TGBlocks.LEANING_SKELETON);
            output.accept(TGBlocks.SKULL_PILE);
            output.accept(TGBlocks.LYING_SKELETON);
            output.accept(TGBlocks.WITHER_SKULL_WITH_RIB_CAGE);
            output.accept(TGBlocks.LEANING_WITHER_SKELETON);
            output.accept(TGBlocks.WITHER_SKULL_PILE);
            output.accept(TGBlocks.LYING_WITHER_SKELETON);
            output.accept(TGBlocks.CREEPER_SKELETON);
            output.accept(TGBlocks.SKELETON_HAND);
            output.accept(TGBlocks.WITHER_SKELETON_HAND);
            output.accept(TGBlocks.TORSO_PILE);
            output.accept(TGBlocks.WITHER_TORSO_PILE);
            output.accept(TGBlocks.SKULL_ON_PIKE);
            output.accept(TGBlocks.WITHER_SKULL_ON_PIKE);
            output.accept(TGBlocks.BONE_REMAINS);
            output.accept(TGBlocks.WITHER_BONE_REMAINS);
            output.accept(TGBlocks.LATERALLY_LYING_SKELETON);
            output.accept(TGBlocks.LATERALLY_LYING_WITHER_SKELETON);
            output.accept(TGBlocks.HANGED_SKELETON);
            output.accept(TGBlocks.HANGED_WITHER_SKELETON);

            output.accept(TGBlocks.OSSUARY);

            output.accept(TGBlocks.BLACK_URN);
            output.accept(TGBlocks.GRAY_URN);
            output.accept(TGBlocks.LIGHT_GRAY_URN);
            output.accept(TGBlocks.WHITE_URN);
            output.accept(TGBlocks.LIGHT_BLUE_URN);
            output.accept(TGBlocks.BLUE_URN);
            output.accept(TGBlocks.CYAN_URN);
            output.accept(TGBlocks.GREEN_URN);
            output.accept(TGBlocks.LIME_URN);
            output.accept(TGBlocks.PINK_URN);
            output.accept(TGBlocks.MAGENTA_URN);
            output.accept(TGBlocks.PURPLE_URN);
            output.accept(TGBlocks.RED_URN);
            output.accept(TGBlocks.ORANGE_URN);
            output.accept(TGBlocks.YELLOW_URN);
            output.accept(TGBlocks.BROWN_URN);

            output.accept(TGBlocks.SMALL_BLACK_URN);
            output.accept(TGBlocks.SMALL_GRAY_URN);
            output.accept(TGBlocks.SMALL_LIGHT_GRAY_URN);
            output.accept(TGBlocks.SMALL_WHITE_URN);
            output.accept(TGBlocks.SMALL_LIGHT_BLUE_URN);
            output.accept(TGBlocks.SMALL_BLUE_URN);
            output.accept(TGBlocks.SMALL_CYAN_URN);
            output.accept(TGBlocks.SMALL_GREEN_URN);
            output.accept(TGBlocks.SMALL_LIME_URN);
            output.accept(TGBlocks.SMALL_PINK_URN);
            output.accept(TGBlocks.SMALL_MAGENTA_URN);
            output.accept(TGBlocks.SMALL_PURPLE_URN);
            output.accept(TGBlocks.SMALL_RED_URN);
            output.accept(TGBlocks.SMALL_ORANGE_URN);
            output.accept(TGBlocks.SMALL_YELLOW_URN);
            output.accept(TGBlocks.SMALL_BROWN_URN);

            output.accept(TGBlocks.VASE_BLOCK);

            output.accept(TGBlocks.SARCOPHAGUS);
            output.accept(TGBlocks.OAK_COFFIN);
            output.accept(TGBlocks.DARK_OAK_COFFIN);
            output.accept(TGBlocks.SPRUCE_COFFIN);
            output.accept(TGBlocks.BIRCH_COFFIN);
            output.accept(TGBlocks.JUNGLE_COFFIN);
            output.accept(TGBlocks.ACACIA_COFFIN);
            output.accept(TGBlocks.WARPED_COFFIN);
            output.accept(TGBlocks.CRIMSON_COFFIN);
            output.accept(TGBlocks.MANGROVE_COFFIN);
            output.accept(TGBlocks.BAMBOO_COFFIN);
            output.accept(TGBlocks.CHERRY_COFFIN);

            output.accept(TGItems.SKELETON_CREEPER_SPAWN_EGG);
            output.accept(TGItems.ACOLYTE_SPAWN_EGG);
            output.accept(TGItems.GHOUL_SPAWN_EGG);
            output.accept(TGItems.REAPER_SPAWN_EGG);
            output.accept(TGItems.REVENANT_SPAWN_EGG);
            output.accept(TGItems.NIGHTMARE_SPAWN_EGG);
            output.accept(TGItems.CORRUPTED_VINDICATOR_SPAWN_EGG);
            output.accept(TGItems.CORRUPTED_PILLAGER_SPAWN_EGG);
            output.accept(TGItems.WRAITH_SPAWN_EGG);
            output.accept(TGItems.LICH_SPAWN_EGG);
            output.accept(TGItems.NAMELESS_HANGED_SPAWN_EGG);

            output.accept(TGItems.BONE_DAGGER);
            output.accept(TGItems.WHITE_BONE_STAFF);
            output.accept(TGItems.BLACK_BONE_STAFF);
            output.accept(TGItems.RED_BONE_STAFF);
            output.accept(TGItems.CYAN_BONE_STAFF);
            output.accept(TGItems.PURPLE_BONE_STAFF);

            output.accept(TGBlocks.ALTAR);
            output.accept(TGBlocks.ALTAR_SIDE);
            output.accept(TGBlocks.ALTAR_CORNER);
            output.accept(TGBlocks.ALTAR_CENTER);
            output.accept(TGBlocks.UPPER_BONE_STAFF);
            output.accept(TGBlocks.MIDDLE_BONE_STAFF);
            output.accept(TGBlocks.LOWER_BONE_STAFF);
            output.accept(TGItems.VIAL_OF_BLOOD);
        }).build()
    );
}
