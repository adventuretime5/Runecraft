package tools;

import com.adventuretime5k.runecraft.Reference;
import com.adventuretime5k.runecraft.RuneCraft;

import net.minecraft.item.ItemSpade;
import net.minecraft.util.ResourceLocation;

public class ModShovel extends ItemSpade {

	public ModShovel(ToolMaterial material, String unlocalizedName) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MOD_ID, unlocalizedName));
		this.setCreativeTab(RuneCraft.tabRunecraft);
	}

}
	


