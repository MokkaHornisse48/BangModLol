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
            new Item[]{Items.SEA_SALT_STUFF,Items.KATANA,Items.BLOOD_STONE,Items.LASER,Items.LASER_GUN,Items.PORTAL_GUN_1,Items.PORTAL_GUN_2,Items.BLOOD_ORE,Items.FIRE_DRAGON_STAFF}
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


