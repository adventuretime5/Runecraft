package steel;

import com.adventuretime5k.runecraft.Reference;
import com.adventuretime5k.runecraft.RuneCraft;

import net.minecraft.item.Item;

public class Steel_ingot extends Item {

	public Steel_ingot() {
		setUnlocalizedName(Reference.RuneCraftItems.STEEL_INGOT.getUnlocalizedName());
		setRegistryName(Reference.RuneCraftItems.STEEL_INGOT.getRegistryName());
		
		setCreativeTab(RuneCraft.tabRunecraft);
	}
	

}
