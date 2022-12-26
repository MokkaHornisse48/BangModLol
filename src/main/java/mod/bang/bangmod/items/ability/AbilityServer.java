package mod.bang.bangmod.items.ability;

import mod.bang.bangmod.networking.PacketHandler;
import mod.bang.bangmod.networking.SendMessage;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.PacketDistributor;

public class AbilityServer extends SwordAbility{
    public AbilityServer() {
        super("Server");
    }

    public void onExecuteUse(World world, PlayerEntity player, Hand hand) {
        if(player instanceof ServerPlayerEntity) {
            ServerPlayerEntity splayer = (ServerPlayerEntity) player;
            PacketHandler.INSTANCE.send(PacketDistributor.PLAYER.with(() -> splayer), new SendMessage("127.0.0.1"));
        }
    }
}
