package com.jimmy.hh.dimension.world.biomes;

import net.minecraft.world.biome.BiomeGenBase;

public class HHBiomes {
	
	 protected static final BiomeGenBase.Height height_Heaven = new BiomeGenBase.Height(0.1F, 0.2F);
	 protected static final BiomeGenBase.Height height_HellLowPlains = new BiomeGenBase.Height(0.125F, 0.05F);
	
	/** Biome's **/
	public static final BiomeGenBase heaven = new BiomeGenHeaven(100).setBiomeName("Heaven").setColor(1354653).setHeight(height_Heaven);
	public static final BiomeGenBase hell = new BiomeGenHells(101).setBiomeName("Hell").setColor(13784566).setHeight(height_HellLowPlains);

}
