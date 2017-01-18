package com.luxar.tutorial;

import com.luxar.tutorial.init.ModItems;
import com.luxar.tutorial.init.ModRecipes;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent event){
		
		ModItems.init();
	}

	public void init(FMLInitializationEvent event){
		
		ModRecipes.init();
	}

	public void postInit(FMLPostInitializationEvent event){
		
	}
}
