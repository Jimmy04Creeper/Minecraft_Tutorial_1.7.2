package com.jimmy.hh.blocks;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import com.jimmy.hh.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockHellLog extends BlockBasic{
	
	//TADO: fix log top texture as it wont show in game or in icons for tabs and display

	@SideOnly(Side.CLIENT)
	private IIcon iconLogTop;

	public BlockHellLog(String blockName, Material material, float hardness){
		super(blockName, Material.wood, hardness);
		this.setStepSound(soundTypeWood);
		this.setHardness(2.0F);
	}

	/**
	 * Called when a block is placed using its ItemBlock. Args: World, X, Y, Z, side, hitX, hitY, hitZ, block metadata
	 */
	public int onBlockPlaced(World par1World, int par2, int par3, int par4, int par5, float par6, float par7, float par8, int par9)
	{
		int j1 = par9 & 3;
		byte b0 = 0;
		switch (par5)
		{
		case 0:
		case 1:
			b0 = 0;
			break;
		case 2:
		case 3:
			b0 = 8;
			break;
		case 4:
		case 5:
			b0 = 4;
		}
		return j1 | b0;
	}

	/**
	 * Returns the ID of the items to drop on destruction.
	 */
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_){
		return Item.getItemFromBlock(this);
	}

	/**
	 * Returns the quantity of items to drop on block destruction.
	 */
	public int quantityDropped(Random par1Random){
		return 1;
	}

	/** gets the icon **/
	public IIcon getIcon(int par1, int par2){
		if(par1 == 0|| par1 == 1){
			return this.iconLogTop;
		}
		else{
			return this.blockIcon;
		}
	}

	@SideOnly(Side.CLIENT)
	/** Register Icons for this block used in method above **/
	public void registerIcons(IIconRegister par1IconRegister){
		/** change the "Tutorial:LogSide,LogTop to your texture names **/
		this.iconLogTop = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(5) + "Top");
	}

	@SideOnly(Side.CLIENT)
	protected IIcon getSideIcon(int p_150163_1_){
		return this.blockIcon;
	}

	@SideOnly(Side.CLIENT)
	protected IIcon getTopIcon(int p_150161_1_){
		return this.iconLogTop;
	}

	@Override
	public boolean canSustainLeaves(IBlockAccess world, int x, int y, int z)
	{
		return true;
	}

	@Override
	public boolean isWood(IBlockAccess world, int x, int y, int z)
	{
		return true;
	}
}