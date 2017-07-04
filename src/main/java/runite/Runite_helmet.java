package runite;

import com.adventuretime5k.runecraft.Reference;
import com.adventuretime5k.runecraft.RuneCraft;

import net.minecraft.item.Item;

public class Runite_helmet extends Item {

	public Runite_helmet() {
		setUnlocalizedName(Reference.RuneCraftItems.RUNITE_HELMET.getUnlocalizedName());
		setRegistryName(Reference.RuneCraftItems.RUNITE_HELMET.getRegistryName());
		
		setCreativeTab(RuneCraft.tabRunecraft);
	}
	

}
