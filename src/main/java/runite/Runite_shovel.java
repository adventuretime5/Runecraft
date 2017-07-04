package runite;

import com.adventuretime5k.runecraft.Reference;
import com.adventuretime5k.runecraft.RuneCraft;

import net.minecraft.item.Item;

public class Runite_shovel extends Item {

	public Runite_shovel() {
		setUnlocalizedName(Reference.RuneCraftItems.RUNITE_SHOVEL.getUnlocalizedName());
		setRegistryName(Reference.RuneCraftItems.RUNITE_SHOVEL.getRegistryName());
		
		setCreativeTab(RuneCraft.tabRunecraft);
	}
	

}
