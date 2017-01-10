package com.hoglezoo.animals;

/**
 * 
 * @author Alex
 *
 */
public class Ocean extends Animal {
	private boolean waterBreathing;
	private ModeOfTravelInWater travelMode;

	/**
	 * 
	 */
	public Ocean() {

	}

	/**
	 * 
	 * @param name
	 * @param waterBreathing
	 * @param travelMode
	 * @param speak
	 */
	public Ocean(String name, boolean waterBreathing, ModeOfTravelInWater travelMode, String speak) {
		this.setName(name);
		this.setWaterBreathing(waterBreathing);
		this.setTravelMode(travelMode);
		this.setSpeak(speak);
	}

	/**
	 * Makes animal swim
	 */
	public void swim() {
		System.out.println(this.getName() + " is swimming with " + this.getTravelMode());
	}

	/**
	 * Animal goes deeper in water
	 */
	public void changeDepth() {
		System.out.println(this.getName() + " went deeper");
	}

	/**
	 * 
	 */
	public boolean equals(Object obj) {
		Ocean equal = (Ocean) obj;
		return (this.isWaterBreathing() == equal.isWaterBreathing() && this.getTravelMode() == equal.getTravelMode()
				&& this.getSpeak() == equal.getSpeak());
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
