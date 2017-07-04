package steel;

import com.adventuretime5k.runecraft.Reference;
import com.adventuretime5k.runecraft.RuneCraft;

import net.minecraft.item.Item;

public class Steel_chestplate extends Item {

	public Steel_chestplate() {
		setUnlocalizedName(Reference.RuneCraftItems.STEEL_CHESTPLATE.getUnlocalizedName());
		setRegistryName(Reference.RuneCraftItems.STEEL_CHESTPLATE.getRegistryName());
		
		setCreativeTab(RuneCraft.tabRunecraft);
	}
	

}
