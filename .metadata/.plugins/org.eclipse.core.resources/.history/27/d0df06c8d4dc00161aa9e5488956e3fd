package edu.neumont.csc150.neudata;

public class Student extends Person {
	private double gpa;

	/**
	 * 
	 */
	public Student() {

	}

	/**
	 * 
	 * @param firstName
	 * @param lastName
	 * @param ssn
	 * @param gpa
	 */
	public Student(String firstName, String lastName, String ssn, double gpa) {
		super(firstName, lastName, ssn);
		this.setGpa(gpa);
	}

	/**
	 * @return the gpa
	 */
	public double getGpa() {
		return gpa;
	}

	/**
	 * @param gpa
	 *            the gpa to set
	 */
	public void setGpa(double gpa) {
		if (gpa < 0)
			throw new IllegalArgumentException("gpa can not be less than zero");
		this.gpa = gpa;
	}

	/**
	 * 
	 */
	public String toString() {
		return super.toString() + " gpa: " + this.getGpa();
	}

	/**
	 * 
	 * @param s
	 * @return
	 */
	public int compareTo(Student s) {
		int val = 0;
		if (this.getGpa() > s.getGpa())
			val = 1;
		else if (this.getGpa() < s.getGpa())
			val = -1;
		return val;
	}
}
