package init;

import blocks.Adamant_block;
import blocks.Adamant_ore;
import blocks.Bronze_block;
import blocks.Copper_ore;
import blocks.Mithril_block;
import blocks.Mithril_ore;
import blocks.Runite_block;
import blocks.Runite_ore;
import blocks.Steel_block;
import blocks.Tin_ore;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.IForgeRegistryEntry;

public class ModBlocks {
	
	public static Block adamant_block;
	public static Block bronze_block;
	public static Block mithril_block;
	public static Block steel_block;
	public static Block runite_block;
	public static Block adamant_ore;
	public static Block tin_ore;
	public static Block mithril_ore;
	public static Block copper_ore;
	public static Block runite_ore;
	
	
	public static void init() {
		adamant_block = new Adamant_block();
		adamant_ore = new Adamant_ore();
		mithril_block = new Mithril_block();
		mithril_ore = new Mithril_ore();
		runite_block = new Runite_block();
		runite_ore = new Runite_ore();
		bronze_block = new Bronze_block();
		tin_ore = new Tin_ore();
		steel_block = new Steel_block();
		copper_ore = new Copper_ore();
		
		
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
