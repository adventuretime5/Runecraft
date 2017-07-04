package bronze;

import com.adventuretime5k.runecraft.Reference;
import com.adventuretime5k.runecraft.RuneCraft;

import net.minecraft.item.Item;

public class Bronze_shovel extends Item {

	public Bronze_shovel() {
		setUnlocalizedName(Reference.RuneCraftItems.BRONZE_SHOVEL.getUnlocalizedName());
		setRegistryName(Reference.RuneCraftItems.BRONZE_SHOVEL.getRegistryName());
		
		setCreativeTab(RuneCraft.tabRunecraft);
	}
	

}
