package init;

import com.adventuretime5k.runecraft.Reference;

import items.ModItem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class ModItems {
	
	public static Item adamant_ingot, bronze_ingot, steel_ingot, mithril_ingot, runite_ingot;
	public static Item bronze_mix, steel_mix, mithril_mix, adamant_mix, runite_mix;
	
	public static void init() {
		adamant_ingot = new ModItem("adamant_ingot");
		bronze_ingot = new ModItem("bronze_ingot");
		steel_ingot = new ModItem("steel_ingot");
		mithril_ingot = new ModItem("mithril_ingot");
		runite_ingot = new ModItem("runite_ingot");
		bronze_mix = new ModItem("bronze_mix");
		steel_mix = new ModItem("steel_mix");
		mithril_mix = new ModItem("mithril_mix");
		adamant_mix = new ModItem("adamant_mix");
		runite_mix = new ModItem("runite_mix");
		
		
	}

	public static void register() {
		GameRegistry.register(adamant_ingot);
		GameRegistry.register(bronze_ingot);
		GameRegistry.register(steel_ingot);
		GameRegistry.register(mithril_ingot);
		GameRegistry.register(runite_ingot);
		GameRegistry.register(bronze_mix);
		GameRegistry.register(steel_mix);
		GameRegistry.register(mithril_mix);
		GameRegistry.register(adamant_mix);
		GameRegistry.register(runite_mix);
		
	}
	
	public static void registerRender() {
		registerRender(adamant_ingot);
		registerRender(bronze_ingot);
		registerRender(steel_ingot);
		registerRender(mithril_ingot);
		registerRender(runite_ingot);
		registerRender(bronze_mix);
		registerRender(steel_mix);
		registerRender(mithril_mix);
		registerRender(adamant_mix);
		registerRender(runite_mix);
		
	}
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
