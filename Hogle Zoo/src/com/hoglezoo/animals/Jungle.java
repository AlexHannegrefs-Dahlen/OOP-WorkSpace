package com.hoglezoo.animals;

/**
 * 
 * @author Alex Jungle animal boolean groundDwelling int IQ
 *
 */
public class Jungle extends Animal {
	private boolean groundDwelling;
	private int IQ;

	/**
	 * basic constructor
	 */
	public Jungle() {
		super();
	}

	/**
	 * overloaded constructor
	 * 
	 * @param name
	 * @param groundDwelling
	 * @param IQ
	 * @param speak
	 * @param color
	 * @param attack
	 */
	public Jungle(String name, boolean groundDwelling, int IQ, String speak, String color, int attack) {
		super(name, color, speak, attack);
		this.setGroundDwelling(groundDwelling);
		this.setIQ(IQ);
	}

	/**
	 * @return Animal toString + ground dwelling + IQ
	 */
	public String toString() {
		return super.toString() + ", is ground dwelling " + this.isGroundDwelling() + ", IQ " + this.getIQ();
	}

	/**
	 * Makes jungle jump
	 */
	public void jump() {
		System.out.println(this.getName() + " jumped.");
	}

	/**
	 * Makes jungle make a shelter
	 */
	public void makeShelter() {
		System.out.println(this.getName() + " tore down leaves and to a small shelter");
	}

	/**
	 * Makes jungle lay down
	 */
	public void layDown() {
		System.out.println(this.getName() + "is laying down");
	}

	/**
	 * @return the groundDwelling
	 */
	public boolean isGroundDwelling() {
		return groundDwelling;
	}

	/**
	 * @param groundDwelling
	 *            the groundDwelling to set
	 */
	public void setGroundDwelling(boolean groundDwelling) {
		this.groundDwelling = groundDwelling;
	}

	/**
	 * @return the iQ
	 */
	public int getIQ() {
		return IQ;
	}

	/**
	 * @param iQ
	 *            the iQ to set
	 */
	public void setIQ(int iQ) {
		if (iQ < 0) {
			throw new IllegalArgumentException("iQ cannot be less than 0");
		}
		IQ = iQ;
	}

}
