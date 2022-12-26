package mod.bang.bangmod.client.renderer;

import mod.bang.bangmod.BangMod;
import mod.bang.bangmod.entitys.DodoEntity;
import mod.bang.bangmod.entitys.projectiles.DodoEggEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.SpriteRenderer;
import net.minecraft.entity.passive.ChickenEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.client.registry.IRenderFactory;

//@OnlyIn(Dist.CLIENT)
public class Dodo_renderer extends MobRenderer<DodoEntity, Dodo_model<DodoEntity>> {
    private static final ResourceLocation DODO_TEXTURES = new ResourceLocation(BangMod.MOD_ID,"textures/entity/dodo.png");

    public Dodo_renderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new Dodo_model<DodoEntity>(), 0.3F);
    }

    /**
     * Returns the location of an entity's texture.
     */
    @Override
    public ResourceLocation getEntityTexture(DodoEntity entity) {
        return DODO_TEXTURES;
    }


    /**
     * Defines what float the third param in setRotationAngles of ModelBase is
     */
    protected float handleRotationFloat(ChickenEntity livingBase, float partialTicks) {
        float f = MathHelper.lerp(partialTicks, livingBase.oFlap, livingBase.wingRotation);
        float f1 = MathHelper.lerp(partialTicks, livingBase.oFlapSpeed, livingBase.destPos);
        return (MathHelper.sin(f) + 1.0F) * f1;
    }

    public static class RenderFactory implements IRenderFactory<DodoEntity> {

        @Override
        public EntityRenderer<? super DodoEntity> createRenderFor(EntityRendererManager manager) {
            return new Dodo_renderer(manager);
        }
    }

    public static class RenderFactoryEgg implements IRenderFactory<DodoEggEntity> {

        @Override
        public EntityRenderer<? super DodoEggEntity> createRenderFor(EntityRendererManager manager) {
            return new SpriteRenderer<DodoEggEntity>(manager, Minecraft.getInstance().getItemRenderer());
        }
    }
}
