package com.bd3194345.pennywisemod.entity;

import com.bd3194345.pennywisemod.PennywiseMod;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public
class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, PennywiseMod.MOD_ID);

    public static final RegistryObject<EntityType<LosersClubEntity>> LOSERS_CLUB = ENTITY_TYPES.register("losers_club", () -> EntityType.Builder.of(LosersClubEntity::new, MobCategory.MONSTER).sized(0.6f, 1.95f).build("losers_club"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
