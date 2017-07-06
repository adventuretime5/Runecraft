package com.adventuretime5k.runecraft.proxy;

import init.ModArmors;
import init.ModBlocks;
import init.ModItems;
import init.ModTools;

public class ClientProxy implements CommonProxy {

	@Override
	public void init() {
		ModItems.registerRender();
		ModBlocks.registerRender();
		ModTools.registerRender();
		ModArmors.registerRender();
		
	}

}
