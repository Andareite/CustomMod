package io.github.Andareite.custommod.core.init;

import io.github.Andareite.custommod.CustomMod;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
	
public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CustomMod.MOD_ID);
	
	
	public static final RegistryObject<Block> EXAMPLE_BLOCK = 
			BLOCKS.register("example_block", () -> 
			new Block(AbstractBlock.Properties.of(Material.METAL,MaterialColor.COLOR_BLUE)
					.strength(15f, 30f)
					.harvestTool(ToolType.PICKAXE)
					.sound(SoundType.GRAVEL)));
	
 
}
	