package runite;

import com.adventuretime5k.runecraft.Reference;
import com.adventuretime5k.runecraft.RuneCraft;

import net.minecraft.item.Item;

public class Runite_boots extends Item {

	public Runite_boots() {
		setUnlocalizedName(Reference.RuneCraftItems.RUNITE_BOOTS.getUnlocalizedName());
		setRegistryName(Reference.RuneCraftItems.RUNITE_BOOTS.getRegistryName());
		
		setCreativeTab(RuneCraft.tabRunecraft);
	}
	

}
