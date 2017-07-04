package runite;

import com.adventuretime5k.runecraft.Reference;
import com.adventuretime5k.runecraft.RuneCraft;

import net.minecraft.item.Item;

public class Runite_chestplate extends Item {

	public Runite_chestplate() {
		setUnlocalizedName(Reference.RuneCraftItems.RUNITE_CHESTPLATE.getUnlocalizedName());
		setRegistryName(Reference.RuneCraftItems.RUNITE_CHESTPLATE.getRegistryName());
		
		setCreativeTab(RuneCraft.tabRunecraft);
	}
	

}
