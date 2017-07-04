package com.adventuretime5k.runecraft.proxy;

import init.ModBlocks;
import init.ModItems;

public class ClientProxy implements CommonProxy {

	@Override
	public void init() {
		ModItems.registerRender();
		ModBlocks.registerRender();
		
	}

}
