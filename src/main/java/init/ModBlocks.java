package init;

import blocks.ModOre;
import blocks.ModBlock;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.IForgeRegistryEntry;

public class ModBlocks {
	
	public static Block adamant_block, bronze_block, mithril_block, steel_block, runite_block;
	public static Block adamant_ore, tin_ore, mithril_ore, copper_ore, runite_ore, iron_ore;
	
	public static void init() {
		runite_block = new ModBlock(20.0F, "pickaxe", 7, "runite_block");
		runite_ore = new ModOre(6.0F, "pickaxe", 6, "runite_ore");
		adamant_block = new ModBlock(14.0F, "pickaxe", 6, "adamant_block");
		adamant_ore = new ModOre(5.0F, "pickaxe", 5, "adamant_ore");
		mithril_block = new ModBlock(12.0F, "pickaxe", 5, "mithril_block");
		mithril_ore = new ModOre(4.0F, "pickaxe", 4, "mithril_ore");
		steel_block = new ModBlock(10.0F, "pickaxe", 4, "steel_block");
		iron_ore = new ModOre(3.0F, "pickaxe", 2, "iron_ore");
		tin_ore = new ModOre(2.5F, "pickaxe", 1, "tin_ore");
		bronze_block = new ModBlock(8.0F, "pickaxe", 2, "bronze_block");
		copper_ore = new ModOre(2.5F, "pickaxe", 1, "copper_ore");
		

		
		
	}		
	
	public static void register() {
		GameRegistry.register(new ItemBlock(adamant_block).setRegistryName(adamant_block.getRegistryName()));
		GameRegistry.register(adamant_block);
		GameRegistry.register(new ItemBlock(adamant_ore).setRegistryName(adamant_ore.getRegistryName()));
		GameRegistry.register(adamant_ore);
		GameRegistry.register(new ItemBlock(mithril_block).setRegistryName(mithril_block.getRegistryName()));
		GameRegistry.register(mithril_block);
		GameRegistry.register(new ItemBlock(mithril_ore).setRegistryName(mithril_ore.getRegistryName()));
		GameRegistry.register(mithril_ore);
		GameRegistry.register(new ItemBlock(runite_block).setRegistryName(runite_block.getRegistryName()));
		GameRegistry.register(runite_block);
		GameRegistry.register(new ItemBlock(runite_ore).setRegistryName(runite_ore.getRegistryName()));
		GameRegistry.register(runite_ore);
		GameRegistry.register(new ItemBlock(steel_block).setRegistryName(steel_block.getRegistryName()));
		GameRegistry.register(steel_block);
		GameRegistry.register(new ItemBlock(bronze_block).setRegistryName(bronze_block.getRegistryName()));
		GameRegistry.register(bronze_block);
		GameRegistry.register(new ItemBlock(tin_ore).setRegistryName(tin_ore.getRegistryName()));
		GameRegistry.register(tin_ore);
		GameRegistry.register(new ItemBlock(copper_ore).setRegistryName(copper_ore.getRegistryName()));
		GameRegistry.register(copper_ore);
		
	}
	
	public static void registerRender() {
		registerRender (adamant_block);
		registerRender (adamant_ore);
		registerRender (mithril_block);
		registerRender (mithril_ore);
		registerRender (runite_block);
		registerRender (runite_ore);
		registerRender (bronze_block);
		registerRender (tin_ore);
		registerRender (steel_block);
		registerRender (copper_ore);
	}
	
	private static void registerRender(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}		
}
