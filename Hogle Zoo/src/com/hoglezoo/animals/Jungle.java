package com.hoglezoo.animals;

/**
 * 
 * @author Alex
 *
 */
public class Jungle extends Animal {
	private boolean groundDwelling;
	private int IQ;

	/**
	 * 
	 */
	public Jungle() {
		super();
	}

	/**
	 * 
	 * @param groundDwelling
	 * @param IQ
	 * @param speak
	 */
	public Jungle(String name, boolean groundDwelling, int IQ, String speak, String color, int attack) {
		super(name, color, speak, attack);
		this.setGroundDwelling(groundDwelling);
		this.setIQ(IQ);
	}

	/**
	 * Makes jungle jump
	 */
	public void jump() {
		System.out.println(super.getName() + " jumped.");
	}

	/**
	 * 
	 */
	public void makeShelter() {
		System.out.println(super.getName() + " tore down leaves and make a small shelter");
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

	@Override
	public String getSpeak() {
		return super.speak;
	}

}
