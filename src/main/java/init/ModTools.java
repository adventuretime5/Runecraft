package init;


import com.adventuretime5k.runecraft.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import tools.ModAxe;
import tools.ModHoe;
import tools.ModPickaxe;
import tools.ModShovel;
import tools.ModSword;

public class ModTools {
	
	public static final ToolMaterial runiteMaterial = EnumHelper.addToolMaterial(Reference.MOD_ID + ":runite", 7, 1020, 11.0F, 5.0F, 15);
	public static final ToolMaterial adamantMaterial = EnumHelper.addToolMaterial(Reference.MOD_ID + ":adamant", 6, 849, 9.0F, 4.0F, 8);
	public static final ToolMaterial mithrilMaterial = EnumHelper.addToolMaterial(Reference.MOD_ID + ":mithril", 5, 669, 8.0F, 3.0F, 20);
	public static final ToolMaterial steelMaterial = EnumHelper.addToolMaterial(Reference.MOD_ID + ":steel", 4, 379, 7.0F, 2.5F, 18);
	public static final ToolMaterial bronzeMaterial = EnumHelper.addToolMaterial(Reference.MOD_ID + ":bronze", 2, 189, 5.0F, 1.5F, 6);
	
	

	
	public static ItemPickaxe adamant_pickaxe, mithril_pickaxe, runite_pickaxe, bronze_pickaxe, steel_pickaxe;
	public static ItemHoe adamant_hoe, mithril_hoe, runite_hoe, bronze_hoe, steel_hoe;
	public static ItemSpade adamant_shovel, mithril_shovel, runite_shovel, bronze_shovel, steel_shovel;
	public static ItemSword adamant_sword, mithril_sword, runite_sword, bronze_sword, steel_sword;
	public static ModAxe adamant_axe, mithril_axe, runite_axe, bronze_axe, steel_axe;
	
	public static void init() {
		adamant_pickaxe = new ModPickaxe(adamantMaterial, "adamant_pickaxe");
		adamant_hoe = new ModHoe(adamantMaterial, "adamant_hoe");
		adamant_shovel = new ModShovel(adamantMaterial, "adamant_shovel");
		adamant_sword = new ModSword(adamantMaterial, "adamant_sword");
		adamant_axe = new ModAxe(adamantMaterial, "adamant_axe");
		mithril_pickaxe = new ModPickaxe(mithrilMaterial, "mithril_pickaxe");
		mithril_hoe = new ModHoe(mithrilMaterial, "mithril_hoe");
		mithril_shovel = new ModShovel(mithrilMaterial, "mithril_shovel");
		mithril_sword = new ModSword(mithrilMaterial, "mithril_sword");
		mithril_axe = new ModAxe(mithrilMaterial, "mithril_axe");
		runite_pickaxe = new ModPickaxe(runiteMaterial, "runite_pickaxe");
		runite_hoe = new ModHoe(runiteMaterial, "runite_hoe");
		runite_shovel = new ModShovel(runiteMaterial, "runite_shovel");
		runite_sword = new ModSword(runiteMaterial, "runite_sword");
		runite_axe = new ModAxe(runiteMaterial, "runite_axe");
		bronze_pickaxe = new ModPickaxe(bronzeMaterial, "bronze_pickaxe");
		bronze_hoe = new ModHoe(bronzeMaterial, "bronze_hoe");
		bronze_shovel = new ModShovel(bronzeMaterial, "bronze_shovel");
		bronze_sword = new ModSword(bronzeMaterial, "bronze_sword");
		bronze_axe = new ModAxe(bronzeMaterial, "bronze_axe");
		steel_pickaxe = new ModPickaxe(steelMaterial, "steel_pickaxe");
		steel_hoe = new ModHoe(steelMaterial, "steel_hoe");
		steel_shovel = new ModShovel(steelMaterial, "steel_shovel");
		steel_sword = new ModSword(steelMaterial, "steel_sword");
		steel_axe = new ModAxe(steelMaterial, "steel_axe");
	
		
	}
	
	public static void register() {
		GameRegistry.register(adamant_pickaxe);
		GameRegistry.register(adamant_hoe);
		GameRegistry.register(adamant_shovel);
		GameRegistry.register(adamant_sword);
		GameRegistry.register(adamant_axe);
		GameRegistry.register(mithril_pickaxe);
		GameRegistry.register(mithril_hoe);
		GameRegistry.register(mithril_shovel);
		GameRegistry.register(mithril_sword);
		GameRegistry.register(mithril_axe);
		GameRegistry.register(runite_pickaxe);
		GameRegistry.register(runite_hoe);
		GameRegistry.register(runite_shovel);
		GameRegistry.register(runite_sword);
		GameRegistry.register(runite_axe);
		GameRegistry.register(bronze_pickaxe);
		GameRegistry.register(bronze_hoe);
		GameRegistry.register(bronze_shovel);
		GameRegistry.register(bronze_sword);
		GameRegistry.register(bronze_axe);
		GameRegistry.register(steel_pickaxe);
		GameRegistry.register(steel_hoe);
		GameRegistry.register(steel_shovel);
		GameRegistry.register(steel_sword);
		GameRegistry.register(steel_axe);
		
	}
	
	public static void registerRender() {
		registerRender(adamant_pickaxe);
		registerRender(adamant_hoe);
		registerRender(adamant_shovel);
		registerRender(adamant_sword);
		registerRender(adamant_axe);
		registerRender(mithril_pickaxe);
		registerRender(mithril_hoe);
		registerRender(mithril_shovel);
		registerRender(mithril_sword);
		registerRender(mithril_axe);
		registerRender(runite_pickaxe);
		registerRender(runite_hoe);
		registerRender(runite_shovel);
		registerRender(runite_sword);
		registerRender(runite_axe);
		registerRender(steel_pickaxe);
		registerRender(steel_hoe);
		registerRender(steel_shovel);
		registerRender(steel_sword);
		registerRender(steel_axe);
		registerRender(bronze_pickaxe);
		registerRender(bronze_hoe);
		registerRender(bronze_shovel);
		registerRender(bronze_sword);
		registerRender(bronze_axe);
		
	}
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}

}
