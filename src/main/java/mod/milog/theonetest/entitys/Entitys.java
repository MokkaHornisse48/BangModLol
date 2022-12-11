package mod.milog.theonetest.entitys;

import mod.milog.theonetest.Theonetest;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;

public class Entitys {
    public static final EntityType<DodoEntity> DodoEntity = (EntityType<mod.milog.theonetest.entitys.DodoEntity>) EntityType.Builder.create(DodoEntity::new,EntityClassification.CREATURE).size(0.7F, 1.8F).build(new ResourceLocation(Theonetest.MOD_ID, "dodo").toString()).setRegistryName(new ResourceLocation(Theonetest.MOD_ID, "dodo"));

}
