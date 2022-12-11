package mod.milog.theonetest.mixins;


import com.google.common.collect.Lists;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import mod.milog.theonetest.client.renderer.Dodo_model;
import mod.milog.theonetest.entitys.DodoEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.client.renderer.entity.SquidRenderer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.attributes.ModifiableAttributeInstance;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.List;


@Mixin(LivingRenderer.class)
public abstract class LivingRendererMixin extends EntityRenderer{

	@Shadow
	protected EntityModel entityModel;

	@Shadow
	protected final List<LayerRenderer<LivingEntity, EntityModel<LivingEntity>>> layerRenderers = Lists.newArrayList();

	protected LivingRendererMixin(EntityRendererManager renderManager) {
		super(renderManager);
	}


	@Inject(method = "render(Lnet/minecraft/entity/LivingEntity;FFLcom/mojang/blaze3d/matrix/MatrixStack;Lnet/minecraft/client/renderer/IRenderTypeBuffer;I)V",at = @At(value = "INVOKE",target = "Lnet/minecraft/client/renderer/entity/model/EntityModel;render(Lcom/mojang/blaze3d/matrix/MatrixStack;Lcom/mojang/blaze3d/vertex/IVertexBuilder;IIFFFF)V"),cancellable = true)
	public void render(LivingEntity entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn,CallbackInfo info) {

		if(entityIn instanceof DodoEntity){
			Minecraft minecraft = Minecraft.getInstance();
			boolean flag = !entityIn.isInvisible();
			boolean flag1 = !flag && !entityIn.isInvisibleToPlayer(minecraft.player);
			boolean flag2 = minecraft.isEntityGlowing(entityIn);
			RenderType rendertype = ((LivingRendererAccesor)this).afunc_230496_a_(entityIn, flag, flag1, flag2);
			int i = LivingRenderer.getPackedOverlay(entityIn, ((LivingRendererAccesor)this).agetOverlayProgress(entityIn, partialTicks));
			IVertexBuilder ivertexbuilder = bufferIn.getBuffer(rendertype);
			((Dodo_model)entityModel).render((DodoEntity) entityIn,matrixStackIn, ivertexbuilder, packedLightIn, i, 1.0F, 1.0F, 1.0F, flag1 ? 0.15F : 1.0F,partialTicks);

			boolean shouldSit = entityIn.isPassenger() && (entityIn.getRidingEntity() != null && entityIn.getRidingEntity().shouldRiderSit());

			float f8 = 0.0F;
			float f5 = 0.0F;
			float f7 = (float)entityIn.ticksExisted + partialTicks;
			if (!shouldSit && entityIn.isAlive()) {
				f8 = MathHelper.lerp(partialTicks, entityIn.prevLimbSwingAmount, entityIn.limbSwingAmount);
				f5 = entityIn.limbSwing - entityIn.limbSwingAmount * (1.0F - partialTicks);
				if (entityIn.isChild()) {
					f5 *= 3.0F;
				}

				if (f8 > 1.0F) {
					f8 = 1.0F;
				}
			}

			float f = MathHelper.interpolateAngle(partialTicks, entityIn.prevRenderYawOffset, entityIn.renderYawOffset);
			float f1 = MathHelper.interpolateAngle(partialTicks, entityIn.prevRotationYawHead, entityIn.rotationYawHead);
			float f2 = f1 - f;
			if (shouldSit && entityIn.getRidingEntity() instanceof LivingEntity) {
				LivingEntity livingentity = (LivingEntity)entityIn.getRidingEntity();
				f = MathHelper.interpolateAngle(partialTicks, livingentity.prevRenderYawOffset, livingentity.renderYawOffset);
				f2 = f1 - f;
				float f3 = MathHelper.wrapDegrees(f2);
				if (f3 < -85.0F) {
					f3 = -85.0F;
				}

				if (f3 >= 85.0F) {
					f3 = 85.0F;
				}

				f = f1 - f3;
				if (f3 * f3 > 2500.0F) {
					f += f3 * 0.2F;
				}

				f2 = f1 - f;
			}

			float f6 = MathHelper.lerp(partialTicks, entityIn.prevRotationPitch, entityIn.rotationPitch);

			if (!entityIn.isSpectator()) {
				for(Object layerrenderer : this.layerRenderers) {
					((LayerRenderer<LivingEntity, EntityModel<LivingEntity>>)layerrenderer).render(matrixStackIn, bufferIn, packedLightIn, entityIn, f5, f8, partialTicks, f7, f2, f6);
				}
			}

			matrixStackIn.pop();
			super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
			//net.minecraftforge.common.MinecraftForge.EVENT_BUS.post(new net.minecraftforge.client.event.RenderLivingEvent.Post(entityIn, this, partialTicks, matrixStackIn, bufferIn, packedLightIn));

			info.cancel();
		}
	}
}