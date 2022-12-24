package mod.milog.bangmod.networking;

import mod.milog.bangmod.items.ability.AbilitySwordItem;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.text.StringTextComponent;
import net.minecraftforge.fml.network.NetworkEvent;

import java.util.function.Supplier;

public class AbilityChangeMessage{

    public int slotId;
    public int ability;
    public AbilityChangeMessage(int pslotId,int pability){
        this.slotId=pslotId;
        this.ability=pability;
    }

    public static AbilityChangeMessage decode(PacketBuffer buf) {
        int slotId = buf.readInt();
        int ability = buf.readInt();
        return new AbilityChangeMessage(slotId,ability);
    }

    public static void encode(AbilityChangeMessage msg, PacketBuffer buf) {
        buf.writeInt(msg.slotId);
        buf.writeInt(msg.ability);
    }


    public static void handle(AbilityChangeMessage msg, Supplier<NetworkEvent.Context> ctx) {
        ctx.get().enqueueWork(() -> {
            // Work that needs to be thread-safe (most work)
            ServerPlayerEntity sender = ctx.get().getSender(); // the client that sent this packet
            ItemStack hand = sender.inventory.getStackInSlot(msg.slotId);
            if (hand.getItem() instanceof AbilitySwordItem) {
                AbilitySwordItem item = (AbilitySwordItem) hand.getItem();
                item.setCurrentAbility(hand, msg.ability % item.getAbilitys().length);
                sender.sendStatusMessage(new StringTextComponent(item.getAbility(hand).getName()), true);
            }

            // Do stuff
        });
        ctx.get().setPacketHandled(true);

    }

}
