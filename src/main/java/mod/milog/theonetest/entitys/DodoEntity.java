package mod.milog.theonetest.entitys;

import mod.milog.theonetest.Items;
import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.passive.ChickenEntity;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class DodoEntity extends ChickenEntity {

    public DodoEntity(EntityType<? extends ChickenEntity> p_i50282_1_, World p_i50282_2_) {
        super(p_i50282_1_, p_i50282_2_);
    }

    public static AttributeModifierMap.MutableAttribute setAttributes() {
        return MobEntity.func_233666_p_()
                .createMutableAttribute(Attributes.MAX_HEALTH, 5.0D)
                .createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.28D);
    }

    @Override
    public ChickenEntity createChild(ServerWorld world, AgeableEntity mate) {
        return Entitys.DodoEntity.create(world);
    }

    @Override
    public void livingTick() {
        super.livingTick();
        if (!this.world.isRemote && this.isAlive() && !this.isChild() && !this.isChickenJockey() && --this.timeUntilNextEgg <= 0) {
            this.playSound(SoundEvents.ENTITY_CHICKEN_EGG, 1.0F, (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F);
            this.entityDropItem(Items.DODO_EGG.getDefaultInstance());
            this.timeUntilNextEgg = this.rand.nextInt(6000) + 6000;
        }

    }
}
