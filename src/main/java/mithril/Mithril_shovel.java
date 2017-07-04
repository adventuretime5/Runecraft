package mithril;

import com.adventuretime5k.runecraft.Reference;
import com.adventuretime5k.runecraft.RuneCraft;

import net.minecraft.item.Item;

public class Mithril_shovel extends Item {

	public Mithril_shovel() {
		setUnlocalizedName(Reference.RuneCraftItems.MITHRIL_SHOVEL.getUnlocalizedName());
		setRegistryName(Reference.RuneCraftItems.MITHRIL_SHOVEL.getRegistryName());
		
		setCreativeTab(RuneCraft.tabRunecraft);
	}
	

}
