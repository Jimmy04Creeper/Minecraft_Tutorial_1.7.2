package com.jimmy.hh.dimension.world.transport;

import net.minecraft.util.ChunkCoordinates;

public class CustomPortalPostion extends ChunkCoordinates
{
	public long field_85087_d;
	final HeavenTeleporter field_85088_e;
	public CustomPortalPostion(HeavenTeleporter heavenTeleporter, int par2, int par3, int par4, long par5)
	{
		super(par2, par3, par4);
		this.field_85088_e = heavenTeleporter;
		this.field_85087_d = par5;
	}
}