package runite;

import com.adventuretime5k.runecraft.Reference;
import com.adventuretime5k.runecraft.RuneCraft;

import net.minecraft.item.Item;

public class Runite_sword extends Item {

	public Runite_sword() {
		setUnlocalizedName(Reference.RuneCraftItems.RUNITE_SWORD.getUnlocalizedName());
		setRegistryName(Reference.RuneCraftItems.RUNITE_SWORD.getRegistryName());
		
		setCreativeTab(RuneCraft.tabRunecraft);
	}
	

}
