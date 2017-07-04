package runite;

import com.adventuretime5k.runecraft.Reference;
import com.adventuretime5k.runecraft.RuneCraft;

import net.minecraft.item.Item;

public class Runite_hoe extends Item {

	public Runite_hoe() {
		setUnlocalizedName(Reference.RuneCraftItems.RUNITE_HOE.getUnlocalizedName());
		setRegistryName(Reference.RuneCraftItems.RUNITE_HOE.getRegistryName());
		
		setCreativeTab(RuneCraft.tabRunecraft);
	}
	

}
