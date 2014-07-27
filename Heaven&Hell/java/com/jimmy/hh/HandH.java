package com.jimmy.hh;

import com.jimmy.hh.blocks.HHBlocks;
import com.jimmy.hh.dimension.Dimensions;
import com.jimmy.hh.reference.Reference;
import com.jimmy.hh.tabs.HHCreativeTabs;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, version = Reference.MOD_VERSION)
public class HandH{
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent pre){

	}
	
    @EventHandler
    public void init(FMLInitializationEvent event){
    	
    	//Add all blocks in mod.
    	new HHBlocks();
    	
    	//Creative Tabs for mod.
    	new HHCreativeTabs();
    	
    	//Dimensions
    	new Dimensions();
    }
}
