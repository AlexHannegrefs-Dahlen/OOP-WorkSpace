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

	}

	/**
	 * 
	 * @param groundDwelling
	 * @param IQ
	 * @param speak
	 */
	public Jungle(String name, boolean groundDwelling, int IQ, String speak) {
		this.setName(name);
		this.setGroundDwelling(groundDwelling);
		this.setIQ(IQ);
		this.setSpeak(speak);
	}

	/**
	 * 
	 */
	public boolean equals(Object obj) {
		Jungle equal = (Jungle) obj;
		return (this.isGroundDwelling() == equal.isGroundDwelling() && this.getIQ() == equal.getIQ()
				&& this.getSpeak() == equal.getSpeak());
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
