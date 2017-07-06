package tools;

import com.adventuretime5k.runecraft.Reference;
import com.adventuretime5k.runecraft.RuneCraft;

import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.util.ResourceLocation;

public class ModPickaxe extends ItemPickaxe {

	public ModPickaxe(ToolMaterial material, String unlocalizedName) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MOD_ID, unlocalizedName));
		this.setCreativeTab(RuneCraft.tabRunecraft);
	}

}
	


