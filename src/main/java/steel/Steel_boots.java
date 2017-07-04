package steel;

import com.adventuretime5k.runecraft.Reference;
import com.adventuretime5k.runecraft.RuneCraft;

import net.minecraft.item.Item;

public class Steel_boots extends Item {

	public Steel_boots() {
		setUnlocalizedName(Reference.RuneCraftItems.STEEL_BOOTS.getUnlocalizedName());
		setRegistryName(Reference.RuneCraftItems.STEEL_BOOTS.getRegistryName());
		
		setCreativeTab(RuneCraft.tabRunecraft);
	}
	

}
