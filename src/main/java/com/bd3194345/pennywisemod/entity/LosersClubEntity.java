package com.bd3194345.pennywisemod.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;

public
class LosersClubEntity extends Monster {
    public LosersClubEntity(EntityType<? extends Monster> entityType, Level level) {
        super(entityType, level);
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Monster.createMonsterAttributes()
        .add(Attributes.MAX_HEALTH, 20.0D)
        .add(Attributes.ATTACK_DAMAGE, 3.0D)
        .add(Attributes.MOVEMENT_SPEED, 0.23D);
    }
}
