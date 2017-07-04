package com.adventuretime5k.runecraft;

public class Reference {
	
	public static final String MOD_ID = "runecraft";
	public static final String NAME = "RuneCraft";
	public static final String VERSION = "1.0";
	public static final String ACCEPTED_VERSIONS = "[1.11.2]";
	
	public static final String CLIENT_PROXY_CLASS = "com.adventuretime5k.runecraft.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.adventuretime5k.runecraft.proxy.ServerProxy";
	
	public static enum RuneCraftItems {
		MITHRIL_INGOT("mithril_ingot", "mithril_ingot"),
		MITHRIL_AXE("mithril_axe", "mithril_axe"),
		MITHRIL_HOE("mithril_hoe", "mithril_hoe"),
		MITHRIL_BOOTS("mithril_boots", "mithril_boots"),
		MITHRIL_CHESTPLATE("mithril_chestplate", "mithril_chestplate"),
		MITHRIL_HELMET("mithril_helmet", "mithril_helmet"),
		MITHRIL_PICKAXE("mithril_pickaxe", "mithril_pickaxe"),
		MITHRIL_SHOVEL("mithril_shovel", "mithril_shovel"),
		MITHRIL_SWORD("mithril_sword", "mithril_sword"),
		MITHRIL_LEGGINGS("mithril_leggings", "mithril_leggings"),
		ADAMANT_INGOT("adamant_ingot", "adamant_ingot"),
		ADAMANT_AXE("adamant_axe", "adamant_axe"),
		ADAMANT_HOE("adamant_hoe", "adamant_hoe"),
		ADAMANT_BOOTS("adamant_boots", "adamant_boots"),
		ADAMANT_CHESTPLATE("adamant_chestplate", "adamant_chestplate"),
		ADAMANT_HELMET("adamant_helmet", "adamant_helmet"),
		ADAMANT_PICKAXE("adamant_pickaxe", "adamant_pickaxe"),
		ADAMANT_SHOVEL("adamant_shovel", "adamant_shovel"),
		ADAMANT_SWORD("adamant_sword", "adamant_sword"),
		ADAMANT_LEGGINGS("adamant_leggings", "adamant_leggings"),
		BRONZE_INGOT("bronze_ingot", "bronze_ingot"),
		BRONZE_AXE("bronze_axe", "bronze_axe"),
		BRONZE_HOE("bronze_hoe", "bronze_hoe"),
		BRONZE_BOOTS("bronze_boots", "bronze_boots"),
		BRONZE_CHESTPLATE("bronze_chestplate", "bronze_chestplate"),
		BRONZE_HELMET("bronze_helmet", "bronze_helmet"),
		BRONZE_PICKAXE("bronze_pickaxe", "bronze_pickaxe"),
		BRONZE_SHOVEL("bronze_shovel", "bronze_shovel"),
		BRONZE_SWORD("bronze_sword", "bronze_sword"),
		BRONZE_LEGGINGS("bronze_leggings", "bronze_leggings"),
		STEEL_INGOT("steel_ingot", "steel_ingot"),
		STEEL_AXE("steel_axe", "steel_axe"),
		STEEL_HOE("steel_hoe", "steel_hoe"),
		STEEL_BOOTS("steel_boots", "steel_boots"),
		STEEL_CHESTPLATE("steel_chestplate", "steel_chestplate"),
		STEEL_HELMET("steel_helmet", "steel_helmet"),
		STEEL_PICKAXE("steel_pickaxe", "steel_pickaxe"),
		STEEL_SHOVEL("steel_shovel", "steel_shovel"),
		STEEL_SWORD("steel_sword", "steel_sword"),
		STEEL_LEGGINGS("steel_leggings", "steel_leggings"),
		RUNITE_INGOT("runite_ingot", "runite_ingot"),
		RUNITE_AXE("runite_axe", "runite_axe"),
		RUNITE_HOE("runite_hoe", "runite_hoe"),
		RUNITE_BOOTS("runite_boots", "runite_boots"),
		RUNITE_CHESTPLATE("runite_chestplate", "runite_chestplate"),
		RUNITE_HELMET("runite_helmet", "runite_helmet"),
		RUNITE_PICKAXE("runite_pickaxe", "runite_pickaxe"),
		RUNITE_SHOVEL("runite_shovel", "runite_shovel"),
		RUNITE_SWORD("runite_sword", "runite_sword"),
		RUNITE_LEGGINGS("runite_leggings", "runite_leggings");
		private String unlocalizedName;
		private String registryName;
		
		RuneCraftItems(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
	}
	
	public static enum RuneCraftBlocks {
		ADAMANT_BLOCK("adamant_block", "adamant_block"),
		ADAMANT_ORE("adamant_ore", "adamant_ore"),
		MITHRIL_BLOCK("mithril_block", "mithril_block"),
		MITHRIL_ORE("mithril_ore", "mithril_ore"),
		RUNITE_BLOCK("runite_block", "runite_block"),
		RUNITE_ORE("runite_ore", "runite_ore"),
		BRONZE_BLOCK("bronze_block", "bronze_block"),
		TIN_ORE("tin_ore", "tin_ore"),
		STEEL_BLOCK("steel_block", "steel_block"),
		COPPER_ORE("copper_ore", "copper_ore");
		private String unlocalizedName;
		private String registryName;
		
		RuneCraftBlocks(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
	
	}	
	
}
	

