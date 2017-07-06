package init;

import com.adventuretime5k.runecraft.Reference;

import armors.ModArmor;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModArmors {
	
	public static final ArmorMaterial runiteMaterial = EnumHelper.addArmorMaterial("runite", Reference.MOD_ID + ":runite", 30, new int[] {3, 6, 8, 4}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static final ArmorMaterial adamantMaterial = EnumHelper.addArmorMaterial("adamant", Reference.MOD_ID + ":adamant", 23, new int[] {2, 5, 7, 3}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1.0F);
	public static final ArmorMaterial mithrilMaterial = EnumHelper.addArmorMaterial("mithril", Reference.MOD_ID + ":mithril", 18, new int[] {2, 4, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial steelMaterial = EnumHelper.addArmorMaterial("steel", Reference.MOD_ID + ":steel", 12, new int[] {2, 3, 5, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial bronzeMaterial = EnumHelper.addArmorMaterial("bronze", Reference.MOD_ID + ":bronze", 8, new int[] {1, 2, 4, 1}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	
	public static ItemArmor runite_helmet, runite_chestplate, runite_leggings, runite_boots;
	public static ItemArmor adamant_helmet, adamant_chestplate, adamant_leggings, adamant_boots;
	public static ItemArmor mithril_helmet, mithril_chestplate, mithril_leggings, mithril_boots;
	public static ItemArmor steel_helmet, steel_chestplate, steel_leggings, steel_boots;
	public static ItemArmor bronze_helmet, bronze_chestplate, bronze_leggings, bronze_boots;
	
	public static void init() {
		runite_helmet = new ModArmor(runiteMaterial, 1, EntityEquipmentSlot.HEAD, "runite_helmet");
		runite_chestplate = new ModArmor(runiteMaterial, 1, EntityEquipmentSlot.CHEST, "runite_chestplate");
		runite_leggings = new ModArmor(runiteMaterial, 2, EntityEquipmentSlot.LEGS, "runite_leggings");
		runite_boots = new ModArmor(runiteMaterial, 1, EntityEquipmentSlot.FEET, "runite_boots");
		adamant_helmet = new ModArmor(adamantMaterial, 1, EntityEquipmentSlot.HEAD, "adamant_helmet");
		adamant_chestplate = new ModArmor(adamantMaterial, 1, EntityEquipmentSlot.CHEST, "adamant_chestplate");
		adamant_leggings = new ModArmor(adamantMaterial, 2, EntityEquipmentSlot.LEGS, "adamant_leggings");
		adamant_boots = new ModArmor(adamantMaterial, 1, EntityEquipmentSlot.FEET, "adamant_boots");
		mithril_helmet = new ModArmor(mithrilMaterial, 1, EntityEquipmentSlot.HEAD, "mithril_helmet");
		mithril_chestplate = new ModArmor(mithrilMaterial, 1, EntityEquipmentSlot.CHEST, "mithril_chestplate");
		mithril_leggings = new ModArmor(mithrilMaterial, 2, EntityEquipmentSlot.LEGS, "mithril_leggings");
		mithril_boots = new ModArmor(mithrilMaterial, 1, EntityEquipmentSlot.FEET, "mithril_boots");
		steel_helmet = new ModArmor(steelMaterial, 1, EntityEquipmentSlot.HEAD, "steel_helmet");
		steel_chestplate = new ModArmor(steelMaterial, 1, EntityEquipmentSlot.CHEST, "steel_chestplate");
		steel_leggings = new ModArmor(steelMaterial, 2, EntityEquipmentSlot.LEGS, "steel_leggings");
		steel_boots = new ModArmor(steelMaterial, 1, EntityEquipmentSlot.FEET, "steel_boots");
		bronze_helmet = new ModArmor(bronzeMaterial, 1, EntityEquipmentSlot.HEAD, "bronze_helmet");
		bronze_chestplate = new ModArmor(bronzeMaterial, 1, EntityEquipmentSlot.CHEST, "bronze_chestplate");
		bronze_leggings = new ModArmor(bronzeMaterial, 2, EntityEquipmentSlot.LEGS, "bronze_leggings");
		bronze_boots = new ModArmor(bronzeMaterial, 1, EntityEquipmentSlot.FEET, "bronze_boots");
		
		
		
	}
	
	public static void register() {
		GameRegistry.register(adamant_leggings);
		GameRegistry.register(adamant_boots);
		GameRegistry.register(adamant_chestplate);
		GameRegistry.register(adamant_helmet);
		GameRegistry.register(bronze_leggings);
		GameRegistry.register(bronze_boots);
		GameRegistry.register(bronze_chestplate);
		GameRegistry.register(bronze_helmet);
		GameRegistry.register(steel_leggings);
		GameRegistry.register(steel_boots);
		GameRegistry.register(steel_chestplate);
		GameRegistry.register(steel_helmet);
		GameRegistry.register(mithril_leggings);
		GameRegistry.register(mithril_boots);
		GameRegistry.register(mithril_chestplate);
		GameRegistry.register(mithril_helmet);
		GameRegistry.register(runite_leggings);
		GameRegistry.register(runite_boots);
		GameRegistry.register(runite_chestplate);
		GameRegistry.register(runite_helmet);
	}
	
	public static void registerRender() {
		registerRender(adamant_leggings);
		registerRender(adamant_boots);
		registerRender(adamant_chestplate);
		registerRender(adamant_helmet);
		registerRender(bronze_leggings);
		registerRender(bronze_boots);
		registerRender(bronze_chestplate);
		registerRender(bronze_helmet);
		registerRender(steel_leggings);
		registerRender(steel_boots);
		registerRender(steel_chestplate);
		registerRender(steel_helmet);
		registerRender(mithril_leggings);
		registerRender(mithril_boots);
		registerRender(mithril_chestplate);
		registerRender(mithril_helmet);
		registerRender(runite_leggings);
		registerRender(runite_boots);
		registerRender(runite_chestplate);
		registerRender(runite_helmet);
	}
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}

}
