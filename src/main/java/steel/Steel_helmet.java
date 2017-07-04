package steel;

import com.adventuretime5k.runecraft.Reference;
import com.adventuretime5k.runecraft.RuneCraft;

import net.minecraft.item.Item;

public class Steel_helmet extends Item {

	public Steel_helmet() {
		setUnlocalizedName(Reference.RuneCraftItems.STEEL_HELMET.getUnlocalizedName());
		setRegistryName(Reference.RuneCraftItems.STEEL_HELMET.getRegistryName());
		
		setCreativeTab(RuneCraft.tabRunecraft);
	}
	

}
