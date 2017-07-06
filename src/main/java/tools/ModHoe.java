package tools;

import com.adventuretime5k.runecraft.Reference;
import com.adventuretime5k.runecraft.RuneCraft;

import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import net.minecraft.util.ResourceLocation;

public class ModHoe extends ItemHoe {

	public ModHoe(ToolMaterial material, String unlocalizedName) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MOD_ID, unlocalizedName));
		this.setCreativeTab(RuneCraft.tabRunecraft);
	}

}
	


