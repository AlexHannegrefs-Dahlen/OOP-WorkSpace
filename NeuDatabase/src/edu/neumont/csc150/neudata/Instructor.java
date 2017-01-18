package edu.neumont.csc150.neudata;

/**
 * 
 * @author Alex
 *
 */
public class Instructor extends Person {
	private int officeNumber;

	/**
	 * 
	 */
	public Instructor() {

	}

	/**
	 * 
	 * @param firstName
	 * @param lastName
	 * @param ssn
	 * @param officeNumber
	 */
	public Instructor(String firstName, String lastName, String ssn, int officeNumber) {
		super(firstName, lastName, ssn);
		this.setOfficeNumber(officeNumber);
	}

	/**
	 * @return the officeNumber
	 */
	public int getOfficeNumber() {
		return officeNumber;
	}

	/**
	 * @param officeNumber
	 *            the officeNumber to set
	 */
	public void setOfficeNumber(int officeNumber) {
		this.officeNumber = officeNumber;
	}

	/**
	 * 
	 */
	public String toString() {
		return super.toString() + " office number: " + this.getOfficeNumber();
	}

	/**
	 * 
	 * @param i
	 * @return
	 */
	public int compareTo(Instructor i) {
		int returnVal = 0;
		if (this.getOfficeNumber() > i.getOfficeNumber())
			returnVal = 1;
		else if (this.getOfficeNumber() < i.getOfficeNumber())
			returnVal = -1;
		return returnVal;
	}
}
