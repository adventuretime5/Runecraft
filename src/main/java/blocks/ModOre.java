package blocks;

import com.adventuretime5k.runecraft.Reference;
import com.adventuretime5k.runecraft.RuneCraft;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;

public class ModOre extends Block {

	public ModOre(float Hardness, String toolClass, int level, String unlocalizedName) {
		super(Material.ROCK);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MOD_ID, unlocalizedName));
		this.setCreativeTab(RuneCraft.tabRunecraft);
		setHardness(Hardness);
		setHarvestLevel(toolClass, level);
		setSoundType(SoundType.STONE);
		
		
		
	}

}
