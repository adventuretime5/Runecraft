package blocks;

import com.adventuretime5k.runecraft.Reference;
import com.adventuretime5k.runecraft.RuneCraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Runite_block extends Block {

	public Runite_block() {
		super(Material.IRON);
		setUnlocalizedName(Reference.RuneCraftBlocks.RUNITE_BLOCK.getUnlocalizedName());
		setRegistryName(Reference.RuneCraftBlocks.RUNITE_BLOCK.getRegistryName());
		setHardness(10.0f);
		setResistance(100.0f);
		setHarvestLevel("pickaxe", 3);
		
		setCreativeTab(RuneCraft.tabRunecraft);
	}
}