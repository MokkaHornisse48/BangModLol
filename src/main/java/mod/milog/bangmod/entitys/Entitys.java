package mod.milog.bangmod.entitys;

import mod.milog.bangmod.BangMod;
import mod.milog.bangmod.entitys.projectiles.DodoEggEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;

public class Entitys {
    public static final EntityType<DodoEntity> DodoEntity = (EntityType<mod.milog.bangmod.entitys.DodoEntity>) EntityType.Builder.create(DodoEntity::new,EntityClassification.CREATURE).size(0.7F, 1.8F).trackingRange(10).build(new ResourceLocation(BangMod.MOD_ID, "dodo").toString()).setRegistryName(new ResourceLocation(BangMod.MOD_ID, "dodo"));

    public static final EntityType<DodoEggEntity> DodoEggEntity = (EntityType<DodoEggEntity>) EntityType.Builder.<DodoEggEntity>create(DodoEggEntity::new,EntityClassification.MISC).build(new ResourceLocation(BangMod.MOD_ID, "dodo_egg").toString()).setRegistryName(new ResourceLocation(BangMod.MOD_ID, "dodo_egg"));
}
