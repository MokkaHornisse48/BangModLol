package mod.milog.theonetest;

import mod.milog.theonetest.Theonetest;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.awt.*;
@Mod.EventBusSubscriber(modid = Theonetest.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class ModEventSubscriber {

    @SubscribeEvent
    public static void onRegisterItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
            new Item[]{Items.SEA_SALT_STUFF,Items.KATANA,Items.BLOOD_STONE,Items.LASER,Items.LASER_GUN,Items.PORTAL_GUN_1,Items.PORTAL_GUN_2,Items.BLOOD_ORE,Items.FIRE_DRAGON_STAFF,Items.BLUE_BERRY,Items.BLUE_BERRY_PIE,Items.SWORD_OF_DAYLIGHT,Items.SWORD_OF_ECLIPSE,Items.SWORD_BASE,Items.SWORD_UNIVERSE,Items.SWORD_HEAL,Items.SWORD_EMOTION,Items.SWORD_FOOL,Items.SWORD_STRONG,Items.SWORD_SUN,Items.SWORD_AGILITY,Items.DOUBLE_SWORD,Items.AGILITY_STONE,Items.EMOTION_STONE,Items.FOOL_STONE,Items.HEAL_STONE,Items.SHADOW_STONE,Items.STRONG_STONE,Items.SUN_STONE,Items.UNIVERSE_STONE,Items.SWORD_SHADOW,Items.AGILITY_SHARD,Items.EMOTION_SHARD,Items.FOOL_SHARD,Items.HEAL_SHARD,Items.SHADOW_SHARD,Items.STRONG_SHARD,Items.SUN_SHARD,Items.UNIVERSE_SHARD}
        );

    }

    @SubscribeEvent
    public static void onRegisterBlock(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
            new Block[]{Blocks.BLOOD_ORE,Blocks.EXTRACTOR}
        );
    }


    //@SubscribeEvent
    //public static void onRegisterEntityType(RegistryEvent.Register<EntityTypeMod> event) {
      //  event.getRegistry().registerAll(

        //);

    }

//}


