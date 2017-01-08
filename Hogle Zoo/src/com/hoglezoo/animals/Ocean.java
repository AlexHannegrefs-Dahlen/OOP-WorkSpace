package com.hoglezoo.animals;

/**
 * 
 * @author Alex
 *
 */
public class Ocean extends Animal {
	private boolean waterBreathing;
	private ModesOfTravel travelMode;

	public Ocean() {

	}

	public Ocean(String name, boolean waterBreathing, ModesOfTravel travelMode, String speak) {
		this.setName(name);
		this.setWaterBreathing(waterBreathing);
		this.setTravelMode(travelMode);
		this.setSpeak(speak);
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
	public ModesOfTravel getTravelMode() {
		return travelMode;
	}

	/**
	 * @param travelMode
	 *            the travelMode to set
	 */
	public void setTravelMode(ModesOfTravel travelMode) {
		this.travelMode = travelMode;
	}
}
