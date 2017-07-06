package blocks;

import com.adventuretime5k.runecraft.Reference;
import com.adventuretime5k.runecraft.RuneCraft;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;

public class ModBlock extends Block {

	public ModBlock(float Hardness, String toolClass, int level, String unlocalizedName) {
		super(Material.IRON);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MOD_ID, unlocalizedName));
		this.setCreativeTab(RuneCraft.tabRunecraft);
		setHardness(Hardness);
		setHarvestLevel(toolClass, level);
		setSoundType(SoundType.METAL);
		
		
		
	}

}
