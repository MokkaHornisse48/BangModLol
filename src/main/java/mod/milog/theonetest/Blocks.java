package mod.milog.theonetest;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.AirBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Blocks {

    public static final Block BLOOD_ORE = new Block(AbstractBlock.Properties.create((Material.IRON),MaterialColor.RED)
                    .hardnessAndResistance(3f,6).harvestTool(ToolType.PICKAXE).harvestLevel(4).sound(SoundType.METAL)).setRegistryName(Theonetest.MOD_ID,"blood_ore");

    public static final Block EXTRACTOR = new Block(AbstractBlock.Properties.create((Material.IRON),MaterialColor.BLACK)
            .hardnessAndResistance(3f,6).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL)).setRegistryName(Theonetest.MOD_ID,"extractor");


}
