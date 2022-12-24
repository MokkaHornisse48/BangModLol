package mod.milog.theonetest.entitys;

import mod.milog.theonetest.Theonetest;
import mod.milog.theonetest.entitys.projectiles.DodoEggEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.projectile.ProjectileItemEntity;
import net.minecraft.util.ResourceLocation;

public class Entitys {
    public static final EntityType<DodoEntity> DodoEntity = (EntityType<mod.milog.theonetest.entitys.DodoEntity>) EntityType.Builder.create(DodoEntity::new,EntityClassification.CREATURE).size(0.7F, 1.8F).trackingRange(10).build(new ResourceLocation(Theonetest.MOD_ID, "dodo").toString()).setRegistryName(new ResourceLocation(Theonetest.MOD_ID, "dodo"));

    public static final EntityType<DodoEggEntity> DodoEggEntity = (EntityType<DodoEggEntity>) EntityType.Builder.<DodoEggEntity>create(DodoEggEntity::new,EntityClassification.MISC).build(new ResourceLocation(Theonetest.MOD_ID, "dodo_egg").toString()).setRegistryName(new ResourceLocation(Theonetest.MOD_ID, "dodo_egg"));
}
