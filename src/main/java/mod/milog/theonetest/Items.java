package mod.milog.theonetest;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraft.item.ItemTier;

public class Items {

    public static final Item SEA_SALT_STUFF = new Item(new Item.Properties().group(BangItemGroup.FOOD).food(new Food.Builder().hunger(7).saturation(5.2f).setAlwaysEdible().build())).setRegistryName(Theonetest.MOD_ID,"sea_salt_stuff");

    public static final Item KATANA = new SwordItem(ItemTier.NETHERITE,31,-2.4F,new Item.Properties().group(BangItemGroup.BANG_ITEM_GROUP)).setRegistryName(Theonetest.MOD_ID,"katana");

    public static final Item BLOOD_STONE = new Item(new Item.Properties().group(BangItemGroup.BANG_ITEM_GROUP)).setRegistryName(Theonetest.MOD_ID,"blood_stone");

    public static final Item LASER_GUN = new LaserGunItem(new Item.Properties().group(BangItemGroup.BANG_ITEM_GROUP)).setRegistryName(Theonetest.MOD_ID,"laser_gun");

    public static final Item LASER = new Item(new Item.Properties().group(BangItemGroup.BANG_ITEM_GROUP)).setRegistryName(Theonetest.MOD_ID,"laser");

    public static final Item PORTAL_GUN_1 = new Item(new Item.Properties().group(BangItemGroup.BANG_ITEM_GROUP)).setRegistryName(Theonetest.MOD_ID,"portal_gun_1");

    public static final Item PORTAL_GUN_2 = new Item(new Item.Properties().group(BangItemGroup.BANG_ITEM_GROUP)).setRegistryName(Theonetest.MOD_ID,"portal_gun_2");

    public static final Item BLOOD_ORE = new BlockItem(Blocks.BLOOD_ORE,new Item.Properties().group(BangItemGroup.BANG_ITEM_GROUP)).setRegistryName(Theonetest.MOD_ID,"blood_ore");

    public static final Item FIRE_DRAGON_STAFF = new LaserGunItem(new Item.Properties().group(BangItemGroup.BANG_ITEM_GROUP)).setRegistryName(Theonetest.MOD_ID,"fire_dragon_staff");

}
