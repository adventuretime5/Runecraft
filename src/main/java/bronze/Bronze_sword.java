package bronze;

import com.adventuretime5k.runecraft.Reference;
import com.adventuretime5k.runecraft.RuneCraft;

import net.minecraft.item.Item;

public class Bronze_sword extends Item {

	public Bronze_sword() {
		setUnlocalizedName(Reference.RuneCraftItems.BRONZE_SWORD.getUnlocalizedName());
		setRegistryName(Reference.RuneCraftItems.BRONZE_SWORD.getRegistryName());
		
		setCreativeTab(RuneCraft.tabRunecraft);
	}
	

}
