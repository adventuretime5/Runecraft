package steel;

import com.adventuretime5k.runecraft.Reference;
import com.adventuretime5k.runecraft.RuneCraft;

import net.minecraft.item.Item;

public class Steel_pickaxe extends Item {

	public Steel_pickaxe() {
		setUnlocalizedName(Reference.RuneCraftItems.STEEL_PICKAXE.getUnlocalizedName());
		setRegistryName(Reference.RuneCraftItems.STEEL_PICKAXE.getRegistryName());
		
		setCreativeTab(RuneCraft.tabRunecraft);
	}
	

}
