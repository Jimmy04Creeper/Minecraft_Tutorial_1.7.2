package com.jimmy.hh.blocks;

import com.jimmy.hh.reference.Reference;
import com.jimmy.hh.tabs.HHCreativeTabs;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockBasic extends Block{
	
	/**
	 * Basic Block class for mod blocks.
	 * @param blockName
	 * @param material
	 * @param hardness
	 */
    public BlockBasic(String blockName, Material material, float hardness){
    	super(material);
    	this.setBlockName(blockName);
    	this.setBlockTextureName(Reference.MOD_ID + ":" + blockName);
    	this.setCreativeTab(HHCreativeTabs.hhBlocks);
    	this.blockHardness = hardness;
    	this.setStepSound(soundTypeGrass);
    }
}