package com.jimmy.hh.dimension.world.biomes;

import java.util.Random;

import com.jimmy.hh.blocks.HHBlocks;

import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomeGenHells extends BiomeGenBase
{
	public final Material blockMaterial;
	
	public BiomeGenHells(int par1)
	{
		super(par1);
		this.blockMaterial = Material.water;
		this.spawnableMonsterList.clear();
		this.spawnableCreatureList.clear();
		this.topBlock = (Blocks.netherrack);
		this.fillerBlock = (Blocks.lava);
		this.setBiomeName("HELL");

		/** this changes the water colour **/
		this.waterColorMultiplier = 0xE42E57;
	}
}