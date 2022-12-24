package mod.milog.bangmod.blocks;

import mod.milog.bangmod.BangMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;

public class Blocks {

    public static final Block BLOOD_ORE = new Block(AbstractBlock.Properties.create((Material.IRON),MaterialColor.RED)
                    .hardnessAndResistance(3f,6).harvestTool(ToolType.PICKAXE).harvestLevel(4).sound(SoundType.METAL)).setRegistryName(BangMod.MOD_ID,"blood_ore");

    public static final Block EXTRACTOR = new Block(AbstractBlock.Properties.create((Material.IRON),MaterialColor.BLACK)
            .hardnessAndResistance(3f,6).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL)).setRegistryName(BangMod.MOD_ID,"extractor");

    public static final Block SHADOW_BLOCK = new Block(AbstractBlock.Properties.create((Material.IRON),MaterialColor.BLACK)
            .hardnessAndResistance(30f,60).harvestTool(ToolType.PICKAXE).harvestLevel(10).sound(SoundType.METAL)).setRegistryName(BangMod.MOD_ID,"shadow_block");


}
