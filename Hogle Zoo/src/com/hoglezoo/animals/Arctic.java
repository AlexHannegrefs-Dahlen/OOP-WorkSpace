package com.hoglezoo.animals;

/**
 * 
 * @author Alex
 *
 */
public class Arctic extends Animal {
	private double swimDuration;
	private double heatRetentionFactor;

	/**
	 * 
	 */
	public Arctic() {
		super();
	}

	/**
	 * 
	 * @param swimDuration
	 * @param heatRetentionFactor
	 * @param speak
	 */
	public Arctic(String name, double swimDuration, double heatRetentionFactor, String speak, String color,
			int attack) {
		super(name, color, speak, attack);
		this.setSwimDuration(swimDuration);
		this.setHeatRetentionFactor(heatRetentionFactor);
	}

	/**
	 * 
	 */
	public void hibernate() {
		System.out.println(this.getName() + " is hibernating");
	}

	/**
	 * 
	 */
	public void makeSnowAnimal() {
		System.out.println(this.getName() + " made a snow animal");
	}

	/**
	 * @return the swimDuration
	 */
	public double getSwimDuration() {
		return swimDuration;
	}

	/**
	 * @param swimDuration
	 *            the swimDuration to set
	 */
	public void setSwimDuration(double swimDuration) {
		if (swimDuration < 0) {
			throw new IllegalArgumentException("Swim duration cannot be less than zero");
		}
		this.swimDuration = swimDuration;
	}

	/**
	 * @return the heatRetentionFactor
	 */
	public double getHeatRetentionFactor() {
		return heatRetentionFactor;
	}

	/**
	 * @param heatRetentionFactor
	 *            the heatRetentionFactor to set
	 */
	public void setHeatRetentionFactor(double heatRetentionFactor) {
		if (heatRetentionFactor < 0) {
			throw new IllegalArgumentException("Heat retention factor cannot be less than zero");
		}
		this.heatRetentionFactor = heatRetentionFactor;
	}

	@Override
	public String getSpeak() {
		return super.speak;
	}

}
