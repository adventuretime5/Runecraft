package steel;

import com.adventuretime5k.runecraft.Reference;
import com.adventuretime5k.runecraft.RuneCraft;

import net.minecraft.item.Item;

public class Steel_hoe extends Item {

	public Steel_hoe() {
		setUnlocalizedName(Reference.RuneCraftItems.STEEL_HOE.getUnlocalizedName());
		setRegistryName(Reference.RuneCraftItems.STEEL_HOE.getRegistryName());
		
		setCreativeTab(RuneCraft.tabRunecraft);
	}
	

}
