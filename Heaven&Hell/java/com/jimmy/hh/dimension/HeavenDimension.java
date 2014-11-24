package com.jimmy.hh.dimension;

import com.jimmy.hh.dimension.world.WorldProviderHeaven;

import net.minecraftforge.common.DimensionManager;

public class HeavenDimension {
	
	private static final int HEAVEN_ID = 15;
	
	public HeavenDimension(){
		registerWorldGenerator();
	}

	private void registerWorldGenerator() {
		/**Register WorldProvider for Dimension **/
		DimensionManager.registerProviderType(this.getHeavenId(), WorldProviderHeaven.class, true);
		DimensionManager.registerDimension(this.getHeavenId(), this.getHeavenId());
	}

	/** getter for Heaven DImension ID so it can not be changed in code
	 * but will be changeable in config when set up.
	 * @return HEAVEN_ID
	 */
	public static int getHeavenId() {
		return HEAVEN_ID;
	}
}
