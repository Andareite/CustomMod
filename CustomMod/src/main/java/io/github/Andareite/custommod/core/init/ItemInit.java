package io.github.Andareite.custommod.core.init;

import io.github.Andareite.custommod.CustomMod;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CustomMod.MOD_ID);
	
	
	public static final RegistryObject<Item> EXAMPLE_ITEM = 
			ITEMS.register("golem_core", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)));
	
	
	
	//Block Item
	public static final RegistryObject<BlockItem> EXAMPLE_BLOCK = 
			ITEMS.register("example_block", () -> 
			new BlockItem(BlockInit.EXAMPLE_BLOCK.get(), 
					new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));

}
