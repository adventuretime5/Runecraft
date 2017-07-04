package steel;

import com.adventuretime5k.runecraft.Reference;
import com.adventuretime5k.runecraft.RuneCraft;

import net.minecraft.item.Item;

public class Steel_shovel extends Item {

	public Steel_shovel() {
		setUnlocalizedName(Reference.RuneCraftItems.STEEL_SHOVEL.getUnlocalizedName());
		setRegistryName(Reference.RuneCraftItems.STEEL_SHOVEL.getRegistryName());
		
		setCreativeTab(RuneCraft.tabRunecraft);
	}
	

}
