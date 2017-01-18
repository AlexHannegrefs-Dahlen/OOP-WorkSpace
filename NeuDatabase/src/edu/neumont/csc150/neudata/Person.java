package edu.neumont.csc150.neudata;

public class Person implements Comparable<Person> {
	private String ssn;
	private String lastName;
	private String firstName;

	/**
	 * 
	 */
	public Person() {

	}

	/**
	 * 
	 * @param firstName
	 * @param lastName
	 * @param ssn
	 */
	public Person(String firstName, String lastName, String ssn) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setSsn(ssn);
	}

	/**
	 * @return the ssn
	 */
	public String getSsn() {
		return ssn;
	}

	/**
	 * @param ssn
	 *            the ssn to set
	 */
	public void setSsn(String ssn) {
		if (ssn == null)
			throw new IllegalArgumentException("ssn can not be null");
		this.ssn = ssn;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		if (lastName == null)
			throw new IllegalArgumentException("lastName can not be null");
		this.lastName = lastName;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		if (firstName == null)
			throw new IllegalArgumentException("firstName can not be null");
		this.firstName = firstName;
	}

	/**
	 * 
	 */
	public boolean equals(Object obj) {
		if (!(obj instanceof Person))
			throw new IllegalArgumentException("obj must be of type Person");
		Person equal = (Person) obj;
		return this.getFirstName().equals(equal.getFirstName()) && this.getLastName().equals(equal.getLastName())
				&& this.getSsn().equals(equal.getSsn());
	}

	/**
	 * 
	 */
	@Override
	public String toString() {
		return "First Name: " + this.getFirstName() + " Last Name: " + this.getLastName() + " SSN: " + this.getSsn();
	}

	/**
	 * 
	 */
	@Override
	public int compareTo(Person o) {
		/*
		int returnVal = 0;
		if (Integer.parseInt(this.getSsn()) > Integer.parseInt(o.getSsn()))
			returnVal = 1;
		else if (Integer.parseInt(this.getSsn()) < Integer.parseInt(o.getSsn()))
			returnVal = -1;
		return returnVal;
		*/
		return this.getSsn().compareTo(o.getSsn());
	}

}
