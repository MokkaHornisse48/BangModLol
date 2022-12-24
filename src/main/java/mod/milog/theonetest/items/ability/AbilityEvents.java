package mod.milog.theonetest.items.ability;

import mod.milog.theonetest.Theonetest;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Theonetest.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class AbilityEvents {
    @SubscribeEvent
    public static void onPlayerAttackTarget(AttackEntityEvent event){
        ItemStack hand = event.getPlayer().getHeldItemMainhand();
        if(hand.getItem() instanceof AbilitySwordItem){
            event.setCanceled(!((AbilitySwordItem) hand.getItem()).getAbility(hand).beforeHit(hand,event.getPlayer(),event.getTarget()));
        }
    }
}
