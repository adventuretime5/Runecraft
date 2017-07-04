package mithril;

import com.adventuretime5k.runecraft.Reference;
import com.adventuretime5k.runecraft.RuneCraft;

import net.minecraft.item.Item;

public class Mithril_ingot extends Item {

	public Mithril_ingot() {
		setUnlocalizedName(Reference.RuneCraftItems.MITHRIL_INGOT.getUnlocalizedName());
		setRegistryName(Reference.RuneCraftItems.MITHRIL_INGOT.getRegistryName());
		
		setCreativeTab(RuneCraft.tabRunecraft);
	}
	

}
