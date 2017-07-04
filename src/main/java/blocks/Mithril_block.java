package blocks;

import com.adventuretime5k.runecraft.Reference;
import com.adventuretime5k.runecraft.RuneCraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Mithril_block extends Block {

	public Mithril_block() {
		super(Material.IRON);
		setUnlocalizedName(Reference.RuneCraftBlocks.MITHRIL_BLOCK.getUnlocalizedName());
		setRegistryName(Reference.RuneCraftBlocks.MITHRIL_BLOCK.getRegistryName());
		setHardness(10.0f);
		setResistance(100.0f);
		setHarvestLevel("pickaxe", 3);
		
		setCreativeTab(RuneCraft.tabRunecraft);
	}
}