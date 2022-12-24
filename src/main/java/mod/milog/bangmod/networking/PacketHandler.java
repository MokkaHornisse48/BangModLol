package mod.milog.bangmod.networking;

import mod.milog.bangmod.BangMod;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.network.NetworkDirection;
import net.minecraftforge.fml.network.NetworkRegistry;
import net.minecraftforge.fml.network.simple.SimpleChannel;

import java.util.Optional;

public class PacketHandler {
    private static final String PROTOCOL_VERSION = "1";
    public static SimpleChannel INSTANCE;

    public static int idm = 0;

    public static boolean register(){
        INSTANCE =  NetworkRegistry.newSimpleChannel(
                new ResourceLocation(BangMod.MOD_ID, "main"),
                () -> PROTOCOL_VERSION,
                PROTOCOL_VERSION::equals,
                PROTOCOL_VERSION::equals
        );
        INSTANCE.registerMessage(idm++,AbilityChangeMessage.class, AbilityChangeMessage::encode,AbilityChangeMessage::decode,AbilityChangeMessage::handle, Optional.of(NetworkDirection.PLAY_TO_SERVER));
        INSTANCE.registerMessage(idm++,SendMessage.class, SendMessage::encode,SendMessage::decode,SendMessage::handle, Optional.of(NetworkDirection.PLAY_TO_CLIENT));
        return true;
    }
}
