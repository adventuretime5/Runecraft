package bronze;

import com.adventuretime5k.runecraft.Reference;
import com.adventuretime5k.runecraft.RuneCraft;

import net.minecraft.item.Item;

public class Bronze_pickaxe extends Item {

	public Bronze_pickaxe() {
		setUnlocalizedName(Reference.RuneCraftItems.BRONZE_PICKAXE.getUnlocalizedName());
		setRegistryName(Reference.RuneCraftItems.BRONZE_PICKAXE.getRegistryName());
		
		setCreativeTab(RuneCraft.tabRunecraft);
	}
	

}
