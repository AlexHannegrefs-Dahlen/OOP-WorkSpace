package com.hoglezoo.animals;

/**
 * 
 * @author Alex Ocean animal boolean waterBreathing enum ModeOfTravelInWater
 *
 */
public class Ocean extends Animal {
	private boolean waterBreathing;
	private ModeOfTravelInWater travelMode;

	/**
	 * basic constructor uses Animal basic constructor
	 */
	public Ocean() {
		super();
	}

	/**
	 * overloaded constructor uses Animal overloaded constructor
	 * 
	 * @param name
	 * @param waterBreathing
	 * @param travelMode
	 * @param speak
	 */
	public Ocean(String name, boolean waterBreathing, ModeOfTravelInWater travelMode, String speak, String color,
			int attack) {
		super(name, color, speak, attack);
		this.setWaterBreathing(waterBreathing);
		this.setTravelMode(travelMode);
	}

	/**
	 * @return Animal toString + water breathing + travel mode
	 */
	@Override
	public String toString() {
		return super.toString() + ", is water breathing " + this.isWaterBreathing() + ", travel mode "
				+ this.getTravelMode();
	}

	/**
	 * Makes ocean swim
	 */
	public void swim() {
		System.out.println(this.getName() + " is swimming with " + this.getTravelMode());
	}

	/**
	 * Ocean goes deeper
	 */
	public void goDeeper() {
		System.out.println(this.getName() + " went deeper");
	}

	/**
	 * Ocean goes shallow
	 */
	public void goShallow() {
		System.out.println(this.getName() + " went shallower");
	}

	/**
	 * @return the waterBreathing
	 */
	public boolean isWaterBreathing() {
		return waterBreathing;
	}

	/**
	 * @param waterBreathing
	 *            the waterBreathing to set
	 */
	public void setWaterBreathing(boolean waterBreathing) {
		this.waterBreathing = waterBreathing;
	}

	/**
	 * @return the travelMode
	 */
	public ModeOfTravelInWater getTravelMode() {
		return travelMode;
	}

	/**
	 * @param travelMode
	 *            the travelMode to set
	 */
	public void setTravelMode(ModeOfTravelInWater travelMode) {
		if (travelMode == null) {
			throw new IllegalArgumentException("travelMode cannot be null");
		}
		this.travelMode = travelMode;
	}

}
