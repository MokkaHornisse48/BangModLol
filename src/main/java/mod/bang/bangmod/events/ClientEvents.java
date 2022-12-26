package mod.bang.bangmod.events;

import mod.bang.bangmod.client.KeyBindings;
import mod.bang.bangmod.items.ability.AbilitySwordItem;
import mod.bang.bangmod.networking.PacketHandler;
import mod.bang.bangmod.BangMod;
import mod.bang.bangmod.networking.AbilityChangeMessage;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = BangMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ClientEvents {

    public static boolean changeKeys = false;

    @SubscribeEvent
    public static void onClientTick(TickEvent.ClientTickEvent event){
        //Theonetest.LOGGER.info("tick");
        if (event.phase == TickEvent.Phase.END) { // Only call code once as the tick event is called twice every tick

            boolean isp = KeyBindings.changeKey.isKeyDown();

            if (isp && !changeKeys) {
                BangMod.LOGGER.info(KeyBindings.changeKey.getKey().getKeyCode());
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
