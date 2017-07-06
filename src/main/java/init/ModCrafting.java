package init;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {
	
	public static void registerCraftingRecipes() {
		registerArmorRecipe(ModArmors.runite_helmet, ModArmors.runite_chestplate, ModArmors.runite_leggings, ModArmors.runite_boots , ModItems.runite_ingot);
		registerArmorRecipe(ModArmors.adamant_helmet, ModArmors.adamant_chestplate, ModArmors.adamant_leggings, ModArmors.adamant_boots , ModItems.adamant_ingot);
		registerArmorRecipe(ModArmors.mithril_helmet, ModArmors.mithril_chestplate, ModArmors.mithril_leggings, ModArmors.mithril_boots , ModItems.mithril_ingot);
		registerArmorRecipe(ModArmors.steel_helmet, ModArmors.steel_chestplate, ModArmors.steel_leggings, ModArmors.steel_boots , ModItems.steel_ingot);
		registerArmorRecipe(ModArmors.bronze_helmet, ModArmors.bronze_chestplate, ModArmors.bronze_leggings, ModArmors.bronze_boots , ModItems.bronze_ingot);
		registerToolRecipe(ModTools.runite_pickaxe, ModTools.runite_axe, ModTools.runite_shovel, ModTools.runite_hoe, ModTools.runite_sword, ModItems.runite_ingot);
		registerToolRecipe(ModTools.adamant_pickaxe, ModTools.adamant_axe, ModTools.adamant_shovel, ModTools.adamant_hoe, ModTools.adamant_sword, ModItems.adamant_ingot);
		registerToolRecipe(ModTools.mithril_pickaxe, ModTools.mithril_axe, ModTools.mithril_shovel, ModTools.mithril_hoe, ModTools.mithril_sword, ModItems.mithril_ingot);
		registerToolRecipe(ModTools.steel_pickaxe, ModTools.steel_axe, ModTools.steel_shovel, ModTools.steel_hoe, ModTools.steel_sword, ModItems.steel_ingot);
		registerToolRecipe(ModTools.bronze_pickaxe, ModTools.bronze_axe, ModTools.bronze_shovel, ModTools.bronze_hoe, ModTools.bronze_sword, ModItems.bronze_ingot);
		registerBlockRecipe(ModItems.runite_ingot, ModBlocks.runite_block);
		registerBlockRecipe(ModItems.adamant_ingot, ModBlocks.adamant_block);
		registerBlockRecipe(ModItems.mithril_ingot, ModBlocks.mithril_block);
		registerBlockRecipe(ModItems.steel_ingot, ModBlocks.steel_block);
		registerBlockRecipe(ModItems.bronze_ingot, ModBlocks.bronze_block);
		registerIngotSmelting(ModItems.bronze_mix, ModItems.bronze_ingot, 1.5F);
		registerIngotSmelting(ModItems.steel_mix, ModItems.steel_ingot, 2.0F);
		registerIngotSmelting(ModItems.mithril_mix, ModItems.mithril_ingot, 3.0F);
		registerIngotSmelting(ModItems.adamant_mix, ModItems.adamant_ingot, 4.5F);
		registerIngotSmelting(ModItems.runite_mix, ModItems.runite_ingot, 6.0F);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.bronze_mix), ModBlocks.copper_ore, ModBlocks.tin_ore);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.steel_mix), Blocks.IRON_ORE, Items.COAL, Items.COAL);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.mithril_mix), ModBlocks.mithril_ore, Items.COAL, Items.COAL, Items.COAL, Items.COAL);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.adamant_mix), ModBlocks.adamant_ore, Items.COAL, Items.COAL, Items.COAL, Items.COAL, Items.COAL, Items.COAL);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.runite_mix), ModBlocks.runite_ore, Items.COAL, Items.COAL, Items.COAL, Items.COAL, Items.COAL, Items.COAL, Items.COAL, Items.COAL);
		
	
	}
	
	public static void registerBlockRecipe(Item ingot, Block block) {
		GameRegistry.addShapelessRecipe(new ItemStack(ingot, 9), block);
		GameRegistry.addShapedRecipe(new ItemStack(block), "III","III","III", 'I', ingot);
	}
	
	public static void registerArmorRecipe(Item helmet, Item chestplate, Item leggings, Item boots, Item ingot) {
		GameRegistry.addRecipe(new ItemStack(helmet), new Object[] { "III","I I","   ",'I',ingot});
		GameRegistry.addRecipe(new ItemStack(helmet), new Object[] { "   ","III","I I",'I',ingot});
		GameRegistry.addRecipe(new ItemStack(chestplate), new Object[] { "I I","III","III",'I',ingot});
		GameRegistry.addRecipe(new ItemStack(leggings), new Object[] { "III","I I","I I",'I',ingot});
		GameRegistry.addRecipe(new ItemStack(boots), new Object[] { "I I","I I","   ",'I',ingot});
		GameRegistry.addRecipe(new ItemStack(boots), new Object[] { "   ","I I","I I",'I',ingot});
	}
	
	public static void registerToolRecipe(Item pickaxe, Item axe, Item shovel, Item hoe, Item sword, Item ingot) {
		GameRegistry.addRecipe(new ItemStack(pickaxe), new Object[] { "III"," S "," S ",'I',ingot,'S',Items.STICK});
		GameRegistry.addRecipe(new ItemStack(axe), new Object[] { "II ","IS "," S ",'I',ingot,'S',Items.STICK});
		GameRegistry.addRecipe(new ItemStack(shovel), new Object[] { " I "," S "," S ",'I',ingot,'S',Items.STICK});
		GameRegistry.addRecipe(new ItemStack(hoe), new Object[] { "II "," S "," S ",'I',ingot,'S',Items.STICK});
		GameRegistry.addRecipe(new ItemStack(sword), new Object[] { " I "," I "," S ",'I',ingot,'S',Items.STICK});
	}
	
	public static void registerIngotSmelting(Item mix, Item ingot, float xp) {
		GameRegistry.addSmelting(mix, new ItemStack(ingot), xp);
		
	}
	

}
