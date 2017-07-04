package runite;

import com.adventuretime5k.runecraft.Reference;
import com.adventuretime5k.runecraft.RuneCraft;

import net.minecraft.item.Item;

public class Runite_axe extends Item {

	public Runite_axe() {
		setUnlocalizedName(Reference.RuneCraftItems.RUNITE_AXE.getUnlocalizedName());
		setRegistryName(Reference.RuneCraftItems.RUNITE_AXE.getRegistryName());
		
		setCreativeTab(RuneCraft.tabRunecraft);
	}
	

}
