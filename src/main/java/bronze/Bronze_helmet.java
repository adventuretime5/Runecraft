package bronze;

import com.adventuretime5k.runecraft.Reference;
import com.adventuretime5k.runecraft.RuneCraft;

import net.minecraft.item.Item;

public class Bronze_helmet extends Item {

	public Bronze_helmet() {
		setUnlocalizedName(Reference.RuneCraftItems.BRONZE_HELMET.getUnlocalizedName());
		setRegistryName(Reference.RuneCraftItems.BRONZE_HELMET.getRegistryName());
		
		setCreativeTab(RuneCraft.tabRunecraft);
	}
	

}
