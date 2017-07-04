package steel;

import com.adventuretime5k.runecraft.Reference;
import com.adventuretime5k.runecraft.RuneCraft;

import net.minecraft.item.Item;

public class Steel_sword extends Item {

	public Steel_sword() {
		setUnlocalizedName(Reference.RuneCraftItems.STEEL_SWORD.getUnlocalizedName());
		setRegistryName(Reference.RuneCraftItems.STEEL_SWORD.getRegistryName());
		
		setCreativeTab(RuneCraft.tabRunecraft);
	}
	

}
