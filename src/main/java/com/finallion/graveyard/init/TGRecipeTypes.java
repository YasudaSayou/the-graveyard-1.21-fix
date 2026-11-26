package com.finallion.graveyard.init;

import com.finallion.graveyard.TheGraveyard;
import com.finallion.graveyard.recipe.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.item.crafting.SingleItemRecipe;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class TGRecipeTypes {

    public static final DeferredRegister<RecipeType<?>> RECIPE_TYPES = DeferredRegister.create(Registries.RECIPE_TYPE, TheGraveyard.MOD_ID);
    public static final DeferredRegister<RecipeSerializer<?>> RECIPE_SERIALIZERS = DeferredRegister.create(Registries.RECIPE_SERIALIZER, TheGraveyard.MOD_ID);

    public static final Supplier<RecipeType<OssuaryCarvingRecipe>> OSSUARY_CARVING = RECIPE_TYPES.register("ossuary_carving", () -> RecipeType.simple(TheGraveyard.prefix("ossuary_carving")));

    public static final Supplier<RecipeSerializer<OssuaryCarvingRecipe>> OSSUARY_CARVING_SERIALIZER = RECIPE_SERIALIZERS.register("ossuary_carving", OssuaryCarvingRecipe.Serializer::new);
}
