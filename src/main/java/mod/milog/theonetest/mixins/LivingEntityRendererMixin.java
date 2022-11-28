package mod.milog.theonetest.mixins;


import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.SquidRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.attributes.ModifiableAttributeInstance;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;


//@Mixin(SquidRenderer.class)
//public class SquidRendererMixin {

	//@Inject(method = "scale", at = @At("TAIL"))
	//private <T extends LivingEntity> void scale(T entity, MatrixStack matrices, float amount, CallbackInfo callbackInfo) {
		//ModifiableAttributeInstance widthMultiplier = entity.getAttribute()
		//EntityAttributeInstance widthMultiplier = entity.getAttributeInstance(SizeEntityAttributes.WIDTH_MULTIPLIER);
		//EntityAttributeInstance heightMultiplier = entity.getAttributeInstance(SizeEntityAttributes.HEIGHT_MULTIPLIER);
		//if (widthMultiplier != null && heightMultiplier != null) {
			//matrices.scale((float) widthMultiplier.getValue(), (float) heightMultiplier.getValue(), (float) widthMultiplier.getValue());
//		}
//	}
//}