package com.finallion.graveyard.recipe;

import com.finallion.graveyard.init.TGRecipeTypes;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.Level;

public class OssuaryCarvingRecipe extends SingleItemRecipe {
    public OssuaryCarvingRecipe(String group, Ingredient ingredient, ItemStack result) {
        super(TGRecipeTypes.OSSUARY_CARVING.get(), TGRecipeTypes.OSSUARY_CARVING_SERIALIZER.get(), group, ingredient, result);
    }

    @Override
    public boolean matches(SingleRecipeInput input, Level level) {
        return this.ingredient.test(input.item());
    }

    @Override
    public boolean isSpecial() {
        return true;
    }

    public static class Serializer extends SingleItemRecipe.Serializer<OssuaryCarvingRecipe> {
        public Serializer() {
            super(OssuaryCarvingRecipe::new);
        }
    }
}
