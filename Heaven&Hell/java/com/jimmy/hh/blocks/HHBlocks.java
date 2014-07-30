package com.jimmy.hh.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class HHBlocks {
	
	/**
	 * Heaven Blocks
	 */
	public static final Block heavenDirt =  new BlockBasic("heavenDirt", Material.ground, 0.2F);
	public static final Block heavenStone =  new BlockBasic("heavenStone", Material.rock, 0.5F);
	public static final Block heavenGrass =  new BlockHeavenGrass("heavenGrass", Material.grass, 0.2F);
	public static final Block heavenLeaf = new BlockHeavenLeaf("heavenLeaf", Material.leaves, 0.2F);
	public static final Block heavenLog = new BlockHeavenLog("heavenLog", Material.wood, 0.4F);
	public static final BlockHeavenFire heavenFire = new BlockHeavenFire("heavenFire");
	public static final BlockHeavenPortal heavenPortal = new BlockHeavenPortal("heavenPortal");
	
	/** 
	 * Hell Blocks
	 */
	public static final Block hellDirt =  new BlockBasic("hellDirt", Material.ground, 0.2F);
	public static final Block hellStone =  new BlockBasic("hellStone", Material.rock, 0.5F);
	public static final Block hellGrass =  new BlockHellGrass("hellGrass", Material.grass, 0.2F);
	public static final Block hellLeaf = new BlockHellLeaf("hellLeaf", Material.leaves, 0.2F);
	public static final Block hellLog = new BlockHellLog("hellLog", Material.wood, 0.4F);
	public static final BlockHellFire hellFire = new BlockHellFire("hellFire");
	public static final BlockHellPortal hellPortal = new BlockHellPortal("hellPortal");
	
	public HHBlocks(){
		
		/**
		 * Heaven Block Registry
		 */
		GameRegistry.registerBlock(heavenDirt, heavenDirt.getLocalizedName());
		GameRegistry.registerBlock(heavenStone, heavenStone.getLocalizedName());
		GameRegistry.registerBlock(heavenGrass, heavenGrass.getLocalizedName());
		GameRegistry.registerBlock(heavenLeaf, heavenLeaf.getLocalizedName());
		GameRegistry.registerBlock(heavenLog, heavenLog.getLocalizedName());
		GameRegistry.registerBlock(heavenFire, heavenFire.getLocalizedName());
		GameRegistry.registerBlock(heavenPortal, heavenPortal.getLocalizedName());
		
		/**
		 * Hell Block Registry
		 */
		GameRegistry.registerBlock(hellDirt, hellDirt.getLocalizedName());
		GameRegistry.registerBlock(hellStone, hellStone.getLocalizedName());
		GameRegistry.registerBlock(hellGrass, hellGrass.getLocalizedName());
		GameRegistry.registerBlock(hellLeaf, hellLeaf.getLocalizedName());
		GameRegistry.registerBlock(hellLog, hellLog.getLocalizedName());
		GameRegistry.registerBlock(hellFire, hellFire.getLocalizedName());
		GameRegistry.registerBlock(hellPortal, hellPortal.getLocalizedName());
	}
}
