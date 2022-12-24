package mod.milog.bangmod.client;


import mod.milog.bangmod.BangMod;
import net.minecraft.client.settings.KeyBinding;

public class KeyBindings {
    public static String category = "category."+ BangMod.MOD_ID+".mainkeys";
    public static KeyBinding changeKey = new KeyBinding("key."+ BangMod.MOD_ID+".changekey",82,category);
}
