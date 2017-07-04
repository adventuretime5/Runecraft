package mithril;

import com.adventuretime5k.runecraft.Reference;
import com.adventuretime5k.runecraft.RuneCraft;

import net.minecraft.item.Item;

public class Mithril_pickaxe extends Item {

	public Mithril_pickaxe() {
		setUnlocalizedName(Reference.RuneCraftItems.MITHRIL_PICKAXE.getUnlocalizedName());
		setRegistryName(Reference.RuneCraftItems.MITHRIL_PICKAXE.getRegistryName());
		
		setCreativeTab(RuneCraft.tabRunecraft);
	}
	

}
