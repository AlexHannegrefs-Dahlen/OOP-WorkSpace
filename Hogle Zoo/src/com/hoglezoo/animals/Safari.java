package com.hoglezoo.animals;

/**
 * 
 * @author Alex
 *
 */
public class Safari extends Animal {
	private boolean carnivore;
	private double travelSpeed;

	/**
	 * 
	 */
	public Safari() {

	}

	public Safari(String name, boolean carnivore, double travelSpeed, String speak) {
		this.setName(name);
		this.setCarnivore(carnivore);
		this.setTravelSpeed(travelSpeed);
		this.setSpeak(speak);
	}

	/**
	 * 
	 */
	public boolean equals(Object obj) {
		Safari equal = (Safari) obj;
		return (this.isCarnivore() == equal.isCarnivore() && this.getTravelSpeed() == equal.getTravelSpeed()
				&& this.getSpeak() == equal.getSpeak());
	}

	/**
	 * 
	 */
	public void run() {
		System.out.println(this.getName() + " ran at " + this.getTravelSpeed() + " m/s");
	}

	/**
	 * 
	 */
	public void sleep() {
		System.out.println(this.getName() + " is sleeping.");
	}

	/**
	 * @return the carnivore
	 */
	public boolean isCarnivore() {
		return carnivore;
	}

	/**
	 * @param carnivore
	 *            the carnivore to set
	 */
	public void setCarnivore(boolean carnivore) {
		this.carnivore = carnivore;
	}

	/**
	 * @return the travelSpeed
	 */
	public double getTravelSpeed() {
		return travelSpeed;
	}

	/**
	 * @param travelSpeed
	 *            the travelSpeed to set
	 */
	public void setTravelSpeed(double travelSpeed) {
		if (travelSpeed < 0)
			throw new IllegalArgumentException("travelSpeed cannot be less than 0");
		this.travelSpeed = travelSpeed;
	}
}
