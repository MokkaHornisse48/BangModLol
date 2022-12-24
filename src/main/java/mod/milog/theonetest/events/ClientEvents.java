package mod.milog.theonetest.events;

import mod.milog.theonetest.Theonetest;
import mod.milog.theonetest.client.KeyBindings;
import mod.milog.theonetest.items.ability.AbilitySwordItem;
import mod.milog.theonetest.networking.AbilityChangeMessage;
import mod.milog.theonetest.networking.PacketHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.StringTextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Theonetest.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ClientEvents {

    public static boolean changeKeys = false;

    @SubscribeEvent
    public static void onClientTick(TickEvent.ClientTickEvent event){
        //Theonetest.LOGGER.info("tick");
        if (event.phase == TickEvent.Phase.END) { // Only call code once as the tick event is called twice every tick

            boolean isp = KeyBindings.changeKey.isKeyDown();

            if (isp && !changeKeys) {
                //Theonetest.LOGGER.info("cool");
                //
                // Execute logic to perform on click here
                ItemStack hand = Minecraft.getInstance().player.getHeldItemMainhand();

                //Minecraft.getInstance().player.sendStatusMessage(new StringTextComponent(hand.getItem().toString()),false);

                if(hand.getItem() instanceof AbilitySwordItem){
                    AbilitySwordItem item  = (AbilitySwordItem) hand.getItem();
                    int ca = item.getCurrentAbility(hand);
                    int slot = Minecraft.getInstance().player.inventory.getSlotFor(hand);
                    ca = (ca+1)%item.getAbilitys().length;
                    PacketHandler.INSTANCE.sendToServer(new AbilityChangeMessage(slot,ca));
                    item.setCurrentAbility(hand,ca%item.getAbilitys().length);
                }


            }
            changeKeys = isp;
        }
    }
}
