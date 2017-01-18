package com.hoglezoo.animals;

/**
 * 
 * @author Alex Arctic animal extends Animal double swimDuration double
 *         heatRetentionFactor
 *
 */
public class Arctic extends Animal {
	private double swimDuration;
	private double heatRetentionFactor;

	/**
	 * basic Constructor uses Animal basic Constructor
	 */
	public Arctic() {
		super();
	}

	/**
	 * Overloaded Constructor uses Animal overloaded constructor
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
	 * returns Animal toString + swim duration + heat retention
	 */
	public String toString() {
		return super.toString() + ", swim duration " + this.getSwimDuration() + ", heat retention factor "
				+ this.getHeatRetentionFactor();
	}

	/**
	 * makes Arctic hibernate
	 */
	public void hibernate() {
		System.out.println(this.getName() + " is hibernating");
	}

	/**
	 * makes Arctic make a snow animal
	 */
	public void makeSnowAnimal() {
		System.out.println(this.getName() + " made a snow animal");
	}

	/**
	 * makes Arctic roll
	 */
	public void roll() {
		System.out.println(this.getName() + "rolled");
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
}
