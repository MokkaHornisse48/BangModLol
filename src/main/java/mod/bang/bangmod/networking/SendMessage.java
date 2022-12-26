package mod.bang.bangmod.networking;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.ConnectingScreen;
import net.minecraft.client.gui.screen.MainMenuScreen;
import net.minecraft.client.gui.screen.MultiplayerScreen;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.network.NetworkEvent;

import java.lang.reflect.Field;
import java.util.function.Supplier;

public class SendMessage {
    public String address;
    public SendMessage(String paddress){
        this.address = paddress;
    }

    public static SendMessage decode(PacketBuffer buf) {
        String address = buf.readString();
        return new SendMessage(address);
    }

    public static void encode(SendMessage msg, PacketBuffer buf) {
        buf.writeString(msg.address);
    }

    public static String lastWorldName;

    @OnlyIn(Dist.CLIENT)
    public static void handleClient(SendMessage msg, Supplier<NetworkEvent.Context> ctx) {

        ServerData serverData;

        MultiplayerScreen multiplayerScreen = new MultiplayerScreen(new MainMenuScreen());
        if(Minecraft.getInstance().isSingleplayer()) {
            serverData = new ServerData("Send", msg.address, false);
            Minecraft.getInstance().world.sendQuittingDisconnectingPacket();
            ConnectingScreen connectingScreen = new ConnectingScreen(multiplayerScreen, Minecraft.getInstance(), serverData);
            Field connectingText = ReflectionUtils.getField(ConnectingScreen.class, ITextComponent.class, 0);
            StringTextComponent stringTextComponent = new StringTextComponent("Connecting to Hub...");
            try {
                ReflectionUtils.modifyPrivateField(connectingText, connectingScreen, stringTextComponent);
            } catch (Exception e) {
                e.printStackTrace();
            }
            Minecraft.getInstance().displayGuiScreen(connectingScreen);
        }else{
            Minecraft.getInstance().world.sendQuittingDisconnectingPacket();
            Minecraft.getInstance().loadWorld(lastWorldName);
        }


        



        // Do stuff

    }

    public static void handle(SendMessage msg, Supplier<NetworkEvent.Context> ctx) {
        ctx.get().enqueueWork(() -> {
            DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> SendMessage.handleClient(msg, ctx));
            // Do stuff
        });
        ctx.get().setPacketHandled(true);

    }

}
