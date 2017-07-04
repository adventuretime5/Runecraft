package mithril;

import com.adventuretime5k.runecraft.Reference;
import com.adventuretime5k.runecraft.RuneCraft;

import net.minecraft.item.Item;

public class Mithril_helmet extends Item {

	public Mithril_helmet() {
		setUnlocalizedName(Reference.RuneCraftItems.MITHRIL_HELMET.getUnlocalizedName());
		setRegistryName(Reference.RuneCraftItems.MITHRIL_HELMET.getRegistryName());
		
		setCreativeTab(RuneCraft.tabRunecraft);
	}
	

}
