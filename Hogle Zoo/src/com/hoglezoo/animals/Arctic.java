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

	}

	/**
	 * 
	 * @param swimDuration
	 * @param heatRetentionFactor
	 * @param speak
	 */
	public Arctic(String name, double swimDuration, double heatRetentionFactor, String speak) {
		this.setName(name);
		this.setSwimDuration(swimDuration);
		this.setHeatRetentionFactor(heatRetentionFactor);
		this.setSpeak(speak);
	}

	/**
	 * 
	 */
	public boolean equals(Object obj) {
		Arctic equal = (Arctic) obj;
		return (this.heatRetentionFactor == equal.heatRetentionFactor && this.swimDuration == equal.swimDuration
				&& this.speak == equal.speak);
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
