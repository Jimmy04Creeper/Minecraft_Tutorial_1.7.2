package com.jimmy.hh.dimension.world.biomes;

import ibxm.Player;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.biome.BiomeGenBase;

import com.jimmy.hh.blocks.HHBlocks;

public class BiomeGenHeaven extends BiomeGenBase
{
	public final Material blockMaterial;
	
	public BiomeGenHeaven(int par1)
	{
		super(par1);
		this.blockMaterial = Material.water;
		this.spawnableMonsterList.clear();
		this.spawnableCreatureList.clear();
		this.topBlock = (HHBlocks.heavenGrass);
		this.fillerBlock = (HHBlocks.heavenDirt);
		this.setBiomeName("Heaven");

		/** this changes the water colour **/
		this.waterColorMultiplier = 0xE42E57;
	}
}