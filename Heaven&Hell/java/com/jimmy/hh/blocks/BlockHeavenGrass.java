package com.jimmy.hh.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import com.jimmy.hh.reference.Reference;
import com.jimmy.hh.tabs.HHCreativeTabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockHeavenGrass extends Block{
	
	/** Icons **/
	@SideOnly(Side.CLIENT)
	private IIcon grassTop;
	@SideOnly(Side.CLIENT)
	private IIcon grassSide;
	@SideOnly(Side.CLIENT)
	private IIcon grassBottom;

	public BlockHeavenGrass(String blockName, Material material, float hardness){
		super(Material.grass);
		this.setTickRandomly(true);
		this.setBlockName(blockName);
		this.setCreativeTab(HHCreativeTabs.hhBlocks);
		this.setLightLevel(1.0F);
	}

	/** Register all icons for this block **/
	@SideOnly(Side.CLIENT)
	@Override
	public void registerBlockIcons(IIconRegister register){
		this.grassBottom = register.registerIcon(Reference.MOD_ID + ":" + (this.getUnlocalizedName().substring(5) + "_Bottom"));
		this.grassSide = register.registerIcon(Reference.MOD_ID + ":" + (this.getUnlocalizedName().substring(5) + "_Side"));
		this.grassTop = register.registerIcon(Reference.MOD_ID + ":" + (this.getUnlocalizedName().substring(5) + "_Top"));
	}

	/** Assign icons to the side required **/
	@SideOnly(Side.CLIENT)
	@Override
	public IIcon getIcon(int side, int meta){
		if(side == 0){
			return this.grassBottom;
		}
		if(side == 1){
			return this.grassTop;
		}
		if(side == 2 || side == 3 || side == 4 || side == 4 || side == 5){
			return this.grassSide;
		}
		else{
			System.out.println("Invalid texture, int's for sides are incorrect, please change them.");
			return null;
		}
	}

	/**
	 * Ticks the block if it's been scheduled
	 */
	public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random){
		if (!par1World.isRemote){
			if (par1World.getBlockLightValue(par2, par3 + 1, par4) < 4 && par1World.getBlockLightOpacity(par2, par3 + 1, par4) > 2){
				par1World.setBlock(par2, par3, par4, HHBlocks.heavenDirt);
			}
			else if (par1World.getBlockLightValue(par2, par3 + 1, par4) >= 9){
				for (int l = 0; l < 4; ++l){
					int i1 = par2 + par5Random.nextInt(3) - 1;
					int j1 = par3 + par5Random.nextInt(5) - 3;
					int k1 = par4 + par5Random.nextInt(3) - 1;
					Block l1 = par1World.getBlock(i1, j1 + 1, k1);

					if (par1World.getBlock(i1, j1, k1) == HHBlocks.heavenDirt && par1World.getBlockLightValue(i1, j1 + 1, k1) >= 4 && par1World.getBlockLightOpacity(i1, j1 + 1, k1) <= 2){
						par1World.setBlock(i1, j1, k1, HHBlocks.heavenGrass);
					}
				}
			}
		}
	}

	/**
	 * Returns the ID of the items to drop on destruction.
	 */
	public Item idDropped(int par1, Random par2Random, int par3){
		return HHBlocks.heavenDirt.getItemDropped(0, par2Random, par3);
	}
}