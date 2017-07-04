package steel;

import com.adventuretime5k.runecraft.Reference;
import com.adventuretime5k.runecraft.RuneCraft;

import net.minecraft.item.Item;

public class Steel_axe extends Item {

	public Steel_axe() {
		setUnlocalizedName(Reference.RuneCraftItems.STEEL_AXE.getUnlocalizedName());
		setRegistryName(Reference.RuneCraftItems.STEEL_AXE.getRegistryName());
		
		setCreativeTab(RuneCraft.tabRunecraft);
	}
	

}
