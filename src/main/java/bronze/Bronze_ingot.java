package bronze;

import com.adventuretime5k.runecraft.Reference;
import com.adventuretime5k.runecraft.RuneCraft;

import net.minecraft.item.Item;

public class Bronze_ingot extends Item {

	public Bronze_ingot() {
		setUnlocalizedName(Reference.RuneCraftItems.BRONZE_INGOT.getUnlocalizedName());
		setRegistryName(Reference.RuneCraftItems.BRONZE_INGOT.getRegistryName());
		
		setCreativeTab(RuneCraft.tabRunecraft);
	}
	

}
