package com.finallion.graveyard.item;


import com.finallion.graveyard.config.GraveyardConfig;
import com.finallion.graveyard.init.TGItems;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;

public class DaggerItem extends SwordItem {

   public DaggerItem(Tiers material, Item.Properties settings) {
      super(material, settings);
   }

   @Override
   public boolean isValidRepairItem(ItemStack stack, ItemStack material) {
      return material.is(Items.BONE);
   }

   @Override
   public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
      if (target.isDeadOrDying() && GraveyardConfig.COMMON.isBloodCollectableEntity.get().contains(target.getType().toString()) && attacker instanceof Player playerEntity) {
         ItemStack stackOffhand = attacker.getOffhandItem();
         if (stackOffhand.is(TGItems.VIAL_OF_BLOOD.get())) {
            float blood = VialOfBlood.getBlood(stackOffhand);
            VialOfBlood.setBlood(stackOffhand, blood + 0.1F);
         } else if (stackOffhand.is(Items.GLASS_BOTTLE)) {
            ItemStack resultStack = ItemUtils.createFilledResult(stackOffhand, playerEntity, TGItems.VIAL_OF_BLOOD.get().getDefaultInstance());
            playerEntity.setItemInHand(InteractionHand.OFF_HAND, resultStack);
         }
      }
      return super.hurtEnemy(stack, target, attacker);
   }

}
