package com.finallion.graveyard.init;

import com.finallion.graveyard.TheGraveyard;
import com.finallion.graveyard.advancements.*;
import net.minecraft.advancements.CriterionTrigger;
import net.minecraft.core.registries.BuiltInRegistries;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;


public class TGAdvancements {
    public static final DeferredRegister<CriterionTrigger<?>> TRIGGER_TYPES = DeferredRegister.create(BuiltInRegistries.TRIGGER_TYPES, TheGraveyard.MOD_ID);

    public static Supplier<DimLightTrigger> DIM_LIGHT = TRIGGER_TYPES.register("dim_light", DimLightTrigger::new);
    public static Supplier<SpawnWraithTrigger> SPAWN_WRAITH = TRIGGER_TYPES.register("spawn_wraith", SpawnWraithTrigger::new);
}