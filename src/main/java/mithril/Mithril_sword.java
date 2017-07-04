package mithril;

import com.adventuretime5k.runecraft.Reference;
import com.adventuretime5k.runecraft.RuneCraft;

import net.minecraft.item.Item;

public class Mithril_sword extends Item {

	public Mithril_sword() {
		setUnlocalizedName(Reference.RuneCraftItems.MITHRIL_SWORD.getUnlocalizedName());
		setRegistryName(Reference.RuneCraftItems.MITHRIL_SWORD.getRegistryName());
		
		setCreativeTab(RuneCraft.tabRunecraft);
	}
	

}
