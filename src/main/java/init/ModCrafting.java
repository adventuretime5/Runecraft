package init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {
	
	public static void register() {
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.adamant_block), "AAA", "AAA", "AAA", 'A', ModItems.adamant_ingot);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.adamant_ingot, 9), ModBlocks.adamant_block);
		GameRegistry.addSmelting(ModBlocks.adamant_ore, new ItemStack(ModItems.adamant_ingot), 1F);
	}

}
