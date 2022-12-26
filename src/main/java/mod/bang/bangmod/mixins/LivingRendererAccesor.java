package mod.bang.bangmod.mixins;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(LivingRenderer.class)
public interface LivingRendererAccesor {

    @Invoker("func_230496_a_")
    public RenderType afunc_230496_a_(LivingEntity p_230496_1_, boolean p_230496_2_, boolean p_230496_3_, boolean p_230496_4_);

    @Invoker("getOverlayProgress")
    public float agetOverlayProgress(LivingEntity livingEntityIn, float partialTicks);

}
