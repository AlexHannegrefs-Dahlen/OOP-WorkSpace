package com.hoglezoo.animals;

/**
 * 
 * @author Alex Safari animal boolean carnivore double travelSpeed
 *
 */
public class Safari extends Animal {
	private boolean carnivore;
	private double travelSpeed;

	/**
	 * basic constructor uses animals basic constructor
	 * 
	 */
	public Safari() {
		super();
	}

	/**
	 * overloaded constructor uses Animals overloaded constructor
	 * 
	 * @param name
	 * @param carnivore
	 * @param travelSpeed
	 * @param speak
	 * @param color
	 * @param attack
	 */
	public Safari(String name, boolean carnivore, double travelSpeed, String speak, String color, int attack) {
		super(name, color, speak, attack);
		this.setCarnivore(carnivore);
		this.setTravelSpeed(travelSpeed);
	}

	/**
	 * returns super.toString + Carnivore, travel speed
	 */
	public String toString() {
		return super.toString() + ", is Carnivore " + this.isCarnivore() + ", travel speed " + this.getTravelSpeed();
	}

	/**
	 * makes the Safari run
	 */
	public void run() {
		System.out.println(this.getName() + " ran at " + this.getTravelSpeed() + " m/s");
	}

	/**
	 * makes the Safari sleep
	 */
	public void sleep() {
		System.out.println(this.getName() + " is sleeping.");
	}

	/**
	 * makes Safari clean
	 */
	public void clean() {
		System.out.println(this.getName() + " clean themself");
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
