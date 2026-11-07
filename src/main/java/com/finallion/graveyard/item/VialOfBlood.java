package com.finallion.graveyard.item;

import net.minecraft.ChatFormatting;
import net.minecraft.core.component.DataComponentPatch;
import net.minecraft.core.component.DataComponents;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class VialOfBlood extends Item {
    private static final String BlOOD_KEY = "Blood";

    public VialOfBlood() {
        super(new Item.Properties().stacksTo(1));
    }

    public static float getBlood(ItemStack stack) {
        CustomData customData = stack.getComponents().get(DataComponents.CUSTOM_DATA);
        CompoundTag nbtCompound = customData == null ? null : customData.copyTag();
        if (nbtCompound == null) {
            return 0.1F;
        } else {
            return nbtCompound.getFloat(BlOOD_KEY);
        }
    }

    public static void setBlood(ItemStack stack, float blood) {
        CustomData customData = stack.getComponents().get(DataComponents.CUSTOM_DATA);
        CompoundTag tag = customData == null ? new CompoundTag() : customData.copyTag();
        if(blood < 0.9F) {
            tag.putFloat(BlOOD_KEY, blood);
        }
        stack.applyComponents(DataComponentPatch.builder().set(DataComponents.CUSTOM_DATA, CustomData.of(tag)).build());
    }


    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltip, TooltipFlag flag) {
        float blood = 0;
        CustomData customData = stack.getComponents().get(DataComponents.CUSTOM_DATA);
        if (customData != null && !customData.isEmpty()) {
            blood = customData.copyTag().getFloat(BlOOD_KEY);
        }

        if (blood > 0.8F && blood < 0.9F) {
            tooltip.add(Component.translatable("item.graveyard.vial_of_blood.level_full").withStyle(ChatFormatting.GRAY));
        } else {
            tooltip.add(Component.translatable("item.graveyard.vial_of_blood.level", Math.max(1, (int) (blood * 10))).withStyle(ChatFormatting.GRAY));
        }
        tooltip.add(Component.translatable("item.graveyard.vial_of_blood.lore").withStyle(ChatFormatting.DARK_GRAY, ChatFormatting.ITALIC));
        tooltip.add(Component.translatable("item.graveyard.vial_of_blood.hint").withStyle(ChatFormatting.DARK_GRAY));
    }
}
