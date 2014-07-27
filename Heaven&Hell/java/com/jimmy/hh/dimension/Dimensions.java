package com.jimmy.hh.dimension;

public class Dimensions {
	
	private static final int HEAVEN_ID = 15;

	public Dimensions(){
		
		new HeavenDimension();
	}

	/** getter for Heaven DImension ID so it can not be changed in code
	 * but will be changeable in config when set up.
	 * @return HEAVEN_ID
	 */
	public static int getHeavenId() {
		return HEAVEN_ID;
	}
}
