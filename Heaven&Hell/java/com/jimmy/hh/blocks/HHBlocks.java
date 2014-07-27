package com.jimmy.hh.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class HHBlocks {
	
	public static final Block heavenDirt =  new BlockBasic("heavenDirt", Material.ground, 0.2F);
	public static final Block heavenStone =  new BlockBasic("heavenStone", Material.rock, 0.5F);
	public static final Block heavenGrass =  new BlockHeavenGrass("heavenGrass", Material.grass, 0.2F);
	public static final Block heavenLeaf = new BlockHeavenLeaf("heavenLeaf", Material.leaves, 0.2F);
	public static final Block heavenLog = new BlockHeavenLog("heavenLog", Material.wood, 0.4F);
	public static final BlockHeavenFire heavenFire = new BlockHeavenFire("heavenFire");
	public static final BlockHeavenPortal heavenPortal = new BlockHeavenPortal("heavenPortal");
	
	public HHBlocks(){
		GameRegistry.registerBlock(heavenDirt, heavenDirt.getLocalizedName());
		GameRegistry.registerBlock(heavenStone, heavenStone.getLocalizedName());
		GameRegistry.registerBlock(heavenGrass, heavenGrass.getLocalizedName());
		GameRegistry.registerBlock(heavenLeaf, heavenLeaf.getLocalizedName());
		GameRegistry.registerBlock(heavenLog, heavenLog.getLocalizedName());
		GameRegistry.registerBlock(heavenFire, heavenFire.getLocalizedName());
		GameRegistry.registerBlock(heavenPortal, heavenPortal.getLocalizedName());
	}
}
