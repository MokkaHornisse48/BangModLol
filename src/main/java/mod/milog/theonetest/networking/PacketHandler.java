package mod.milog.theonetest.networking;

import mod.milog.theonetest.Theonetest;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.network.NetworkDirection;
import net.minecraftforge.fml.network.NetworkEvent;
import net.minecraftforge.fml.network.NetworkRegistry;
import net.minecraftforge.fml.network.simple.IndexedMessageCodec;
import net.minecraftforge.fml.network.simple.SimpleChannel;

import java.util.Optional;
import java.util.function.Supplier;

public class PacketHandler {
    private static final String PROTOCOL_VERSION = "1";
    public static SimpleChannel INSTANCE;

    public static int idm = 0;

    public static boolean register(){
        INSTANCE =  NetworkRegistry.newSimpleChannel(
                new ResourceLocation(Theonetest.MOD_ID, "main"),
                () -> PROTOCOL_VERSION,
                PROTOCOL_VERSION::equals,
                PROTOCOL_VERSION::equals
        );
        INSTANCE.registerMessage(idm++,AbilityChangeMessage.class, AbilityChangeMessage::encode,AbilityChangeMessage::decode,AbilityChangeMessage::handle, Optional.of(NetworkDirection.PLAY_TO_SERVER));
        return true;
    }
}
