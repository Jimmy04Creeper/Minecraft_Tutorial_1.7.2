package com.jimmy.hh.tabs;

import com.jimmy.hh.blocks.HHBlocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class HHCreativeTabs {
	
	/**
	 * Add creative tabs for mod.
	 * creative tabs has a string on constructor which is used to get the name for the tab from the lang file
	 */
	
	//Block Tab
	public static CreativeTabs hhBlocks = new CreativeTabs("hhBlocks") {
	    @Override
	    @SideOnly(Side.CLIENT)
	    public Item getTabIconItem() {
	        return Item.getItemFromBlock(HHBlocks.heavenStone);
	    }
	};
	
	//Item Tab
	public static CreativeTabs hhItems = new CreativeTabs("hhItems") {
	    @Override
	    @SideOnly(Side.CLIENT)
	    public Item getTabIconItem() {
	        return Items.bone;
	    }
	};
}
