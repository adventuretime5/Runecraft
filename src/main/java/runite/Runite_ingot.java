package runite;

import com.adventuretime5k.runecraft.Reference;
import com.adventuretime5k.runecraft.RuneCraft;

import net.minecraft.item.Item;

public class Runite_ingot extends Item {

	public Runite_ingot() {
		setUnlocalizedName(Reference.RuneCraftItems.RUNITE_INGOT.getUnlocalizedName());
		setRegistryName(Reference.RuneCraftItems.RUNITE_INGOT.getRegistryName());
		
		setCreativeTab(RuneCraft.tabRunecraft);
	}
	

}
