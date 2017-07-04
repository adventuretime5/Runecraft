package runite;

import com.adventuretime5k.runecraft.Reference;
import com.adventuretime5k.runecraft.RuneCraft;

import net.minecraft.item.Item;

public class Runite_pickaxe extends Item {

	public Runite_pickaxe() {
		setUnlocalizedName(Reference.RuneCraftItems.RUNITE_PICKAXE.getUnlocalizedName());
		setRegistryName(Reference.RuneCraftItems.RUNITE_PICKAXE.getRegistryName());
		
		setCreativeTab(RuneCraft.tabRunecraft);
	}
	

}
