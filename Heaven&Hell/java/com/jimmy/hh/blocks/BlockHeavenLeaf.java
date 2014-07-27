package com.jimmy.hh.blocks;

import java.util.Random;

import com.jimmy.hh.blocks.BlockBasic;
import net.minecraft.block.Block;
import net.minecraft.block.BlockGrass;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BlockHeavenLeaf extends BlockBasic{
	public BlockHeavenLeaf(String blockName, Material material, float hardness){
    	super(blockName, material, hardness);
	}

	public boolean isOpaqueCube(){
		return false;
	}

	/**
	 * Returns the ID of the items to drop on destruction.
	 */
	public Item idDropped(int par1, Random par2Random, int par3){
		return HHBlocks.heavenLeaf.getItemDropped(0, par2Random, par3);
	}
	
	/**
	 * Returns the quantity of items to drop on block destruction.
	 */
	public int quantityDropped(Random par1Random){
		return 1;
	}
}