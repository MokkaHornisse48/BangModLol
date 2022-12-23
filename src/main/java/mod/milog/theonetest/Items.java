package mod.milog.theonetest;

import mod.milog.theonetest.entitys.Entitys;
import mod.milog.theonetest.items.DodoEggItem;
import net.minecraft.entity.EntityType;
import net.minecraft.item.*;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

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


    public static final Item DODO_SPAWN_EGG = new ForgeSpawnEggItem(new Supplier<EntityType<?>>() {
        @Override
        public EntityType<?> get() {
            return Entitys.DodoEntity;
        }
    }, 0xb8bdbe, 0xcc9104, new Item.Properties().group(BangItemGroup.BANG_ITEM_GROUP)).setRegistryName(Theonetest.MOD_ID,"dodo_spawn_egg");

    public static final Item DODO_EGG = new DodoEggItem( new Item.Properties().group(BangItemGroup.BANG_ITEM_GROUP)).setRegistryName(Theonetest.MOD_ID,"dodo_egg");

    public static final Item BLUE_BERRY = new Item(new Item.Properties().group(BangItemGroup.FOOD).food(new Food.Builder().hunger(1).saturation(2f).setAlwaysEdible().build())).setRegistryName(Theonetest.MOD_ID,"blue_berry");

    public static final Item BLUE_BERRY_PIE = new Item(new Item.Properties().group(BangItemGroup.FOOD).food(new Food.Builder().hunger(8).saturation(6f).setAlwaysEdible().build())).setRegistryName(Theonetest.MOD_ID,"blue_berry_pie");

    public static final Item SWORD_OF_DAYLIGHT = new SwordItem(ItemTier.NETHERITE,40,-2.4F,new Item.Properties().group(BangItemGroup.BANG_ITEM_GROUP)).setRegistryName(Theonetest.MOD_ID,"sword_of_daylight");

    public static final Item SWORD_OF_ECLIPSE = new SwordItem(ItemTier.NETHERITE,40,-2.4F,new Item.Properties().group(BangItemGroup.BANG_ITEM_GROUP)).setRegistryName(Theonetest.MOD_ID,"sword_of_eclipse");

    public static final Item SWORD_BASE = new SwordItem(ItemTier.NETHERITE,10,-2.4F,new Item.Properties().group(BangItemGroup.BANG_ITEM_GROUP)).setRegistryName(Theonetest.MOD_ID,"sword_base");

    public static final Item SWORD_UNIVERSE = new SwordItem(ItemTier.NETHERITE,50,-2.4F,new Item.Properties().group(BangItemGroup.BANG_ITEM_GROUP)).setRegistryName(Theonetest.MOD_ID,"sword_universe");

    public static final Item SWORD_HEAL = new SwordItem(ItemTier.NETHERITE,10,-2.4F,new Item.Properties().group(BangItemGroup.BANG_ITEM_GROUP)).setRegistryName(Theonetest.MOD_ID,"sword_heal");

    public static final Item SWORD_AGILITY = new SwordItem(ItemTier.NETHERITE,20,-2.4F,new Item.Properties().group(BangItemGroup.BANG_ITEM_GROUP)).setRegistryName(Theonetest.MOD_ID,"sword_agility");

    public static final Item SWORD_SUN = new SwordItem(ItemTier.NETHERITE,45,-2.4F,new Item.Properties().group(BangItemGroup.BANG_ITEM_GROUP)).setRegistryName(Theonetest.MOD_ID,"sword_sun");

    public static final Item SWORD_STRONG = new SwordItem(ItemTier.NETHERITE,22,-2.4F,new Item.Properties().group(BangItemGroup.BANG_ITEM_GROUP)).setRegistryName(Theonetest.MOD_ID,"sword_strong");

    public static final Item SWORD_FOOL = new SwordItem(ItemTier.NETHERITE,18,-2.4F,new Item.Properties().group(BangItemGroup.BANG_ITEM_GROUP)).setRegistryName(Theonetest.MOD_ID,"sword_fool");

    public static final Item SWORD_EMOTION = new SwordItem(ItemTier.NETHERITE,40,-2.4F,new Item.Properties().group(BangItemGroup.BANG_ITEM_GROUP)).setRegistryName(Theonetest.MOD_ID,"sword_emotion");

    public static final Item SWORD_SHADOW = new SwordItem(ItemTier.NETHERITE,40,-2.4F,new Item.Properties().group(BangItemGroup.BANG_ITEM_GROUP)).setRegistryName(Theonetest.MOD_ID,"sword_shadow");


    public static final Item DOUBLE_SWORD = new SwordItem(ItemTier.NETHERITE,15,-2.4F,new Item.Properties().group(BangItemGroup.BANG_ITEM_GROUP)).setRegistryName(Theonetest.MOD_ID,"double_sword");

    public static final Item AGILITY_STONE = new Item(new Item.Properties().group(BangItemGroup.BANG_ITEM_GROUP)).setRegistryName(Theonetest.MOD_ID,"agility_stone");

    public static final Item EMOTION_STONE = new Item(new Item.Properties().group(BangItemGroup.BANG_ITEM_GROUP)).setRegistryName(Theonetest.MOD_ID,"emotion_stone");

    public static final Item FOOL_STONE = new Item(new Item.Properties().group(BangItemGroup.BANG_ITEM_GROUP)).setRegistryName(Theonetest.MOD_ID,"fool_stone");

    public static final Item HEAL_STONE = new Item(new Item.Properties().group(BangItemGroup.BANG_ITEM_GROUP)).setRegistryName(Theonetest.MOD_ID,"heal_stone");

    public static final Item SHADOW_STONE = new Item(new Item.Properties().group(BangItemGroup.BANG_ITEM_GROUP)).setRegistryName(Theonetest.MOD_ID,"shadow_stone");

    public static final Item STRONG_STONE = new Item(new Item.Properties().group(BangItemGroup.BANG_ITEM_GROUP)).setRegistryName(Theonetest.MOD_ID,"strong_stone");

    public static final Item SUN_STONE = new Item(new Item.Properties().group(BangItemGroup.BANG_ITEM_GROUP)).setRegistryName(Theonetest.MOD_ID,"sun_stone");

    public static final Item UNIVERSE_STONE = new Item(new Item.Properties().group(BangItemGroup.BANG_ITEM_GROUP)).setRegistryName(Theonetest.MOD_ID,"universe_stone");

    public static final Item AGILITY_SHARD = new Item(new Item.Properties().group(BangItemGroup.BANG_ITEM_GROUP)).setRegistryName(Theonetest.MOD_ID,"agility_shard");

    public static final Item EMOTION_SHARD = new Item(new Item.Properties().group(BangItemGroup.BANG_ITEM_GROUP)).setRegistryName(Theonetest.MOD_ID,"emotion_shard");

    public static final Item FOOL_SHARD = new Item(new Item.Properties().group(BangItemGroup.BANG_ITEM_GROUP)).setRegistryName(Theonetest.MOD_ID,"fool_shard");

    public static final Item HEAL_SHARD = new Item(new Item.Properties().group(BangItemGroup.BANG_ITEM_GROUP)).setRegistryName(Theonetest.MOD_ID,"heal_shard");

    public static final Item SHADOW_SHARD = new Item(new Item.Properties().group(BangItemGroup.BANG_ITEM_GROUP)).setRegistryName(Theonetest.MOD_ID,"shadow_shard");

    public static final Item STRONG_SHARD = new Item(new Item.Properties().group(BangItemGroup.BANG_ITEM_GROUP)).setRegistryName(Theonetest.MOD_ID,"strong_shard");

    public static final Item SUN_SHARD = new Item(new Item.Properties().group(BangItemGroup.BANG_ITEM_GROUP)).setRegistryName(Theonetest.MOD_ID,"sun_shard");

    public static final Item UNIVERSE_SHARD = new Item(new Item.Properties().group(BangItemGroup.BANG_ITEM_GROUP)).setRegistryName(Theonetest.MOD_ID,"universe_shard");

    public static final Item SHADOW_BLOCK = new BlockItem(Blocks.SHADOW_BLOCK,new Item.Properties().group(BangItemGroup.BANG_ITEM_GROUP)).setRegistryName(Theonetest.MOD_ID,"shadow_block");

}
