package com.neumont.csc150.airplace;

/**
 * 
 * @author Alex
 *
 */
public class Passenger {
	private String name;
	private int age;
	
	/**
	 * 
	 * @param name
	 * @param age
	 */
	public Passenger(String name, int age){
		this.setName(name);
		this.setAge(age);
	}
	/**
	 * equals if obj = this
	 */
	public boolean equals(Object obj){
		Passenger pass = (Passenger) obj;
		return(this.name.equals(pass.name) && this.age == pass.age);
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		if(name == null){
			throw new IllegalArgumentException("Name cannot be null");
		}
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
}
