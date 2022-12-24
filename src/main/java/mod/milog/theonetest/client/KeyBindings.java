package mod.milog.theonetest.client;


import mod.milog.theonetest.Theonetest;
import net.minecraft.client.settings.KeyBinding;

public class KeyBindings {
    public static String category = "category."+ Theonetest.MOD_ID+".mainkeys";
    public static KeyBinding changeKey = new KeyBinding("key."+ Theonetest.MOD_ID+".changekey",0,category);
}
