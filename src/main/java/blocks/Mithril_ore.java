package blocks;

import com.adventuretime5k.runecraft.Reference;
import com.adventuretime5k.runecraft.RuneCraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Mithril_ore extends Block {

	public Mithril_ore() {
		super(Material.ROCK);
		setUnlocalizedName(Reference.RuneCraftBlocks.MITHRIL_ORE.getUnlocalizedName());
		setRegistryName(Reference.RuneCraftBlocks.MITHRIL_ORE.getRegistryName());
		setHardness(10.0f);
		setResistance(100.0f);
		setHarvestLevel("pickaxe", 3);
		
		setCreativeTab(RuneCraft.tabRunecraft);
	}
}