package com.hoglezoo.animals;

/**
 * 
 * @author Alex basic animal class String speak String name String color int
 *         attack
 *
 */
abstract public class Animal implements AnimalType, Comparable<Animal> {
	private String name;
	private String speak;
	private String color;
	private int attack;

	/**
	 * basic constructor
	 */
	public Animal() {

	}

	/**
	 * Overloaded Constructor
	 * 
	 * @param name
	 * @param color
	 * @param speak
	 * @param attack
	 */
	public Animal(String name, String color, String speak, int attack) {
		this.setName(name);
		this.setColor(color);
		this.setSpeak(speak);
		this.setAttack(attack);
	}

	/**
	 * returns true if name, color, speak, and attack are equal between this and
	 * obj
	 */
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Animal)) {
			throw new IllegalArgumentException("obj must be an instance of animal");
		}
		Animal equalling = (Animal) obj;
		return this.getName().equals(equalling.getName()) && this.getColor().equals(equalling.getColor())
				&& this.getSpeak().equals(equalling.getSpeak()) && this.getAttack() == equalling.getAttack();
	}

	/**
	 * returns String = Name, Speak, Color
	 */
	@Override
	public String toString() {
		return "Name: " + this.getName() + ", Speak: " + this.getSpeak() + ", Color: " + this.getColor();
	}

	/**
	 * makes animal eat
	 */
	public String eat() {
		return this.name + " has ate.";
	}

	/**
	 * akes animal hide
	 */
	public String hide() {
		return this.name + " is hiding.";
	}

	/**
	 * 
	 * @param Animal
	 *            object to fight another Animal object returns the animal that
	 *            has the higher attack
	 * 
	 */
	public Animal fight(Animal fighting) {
		if (this.getAttack() < fighting.getAttack())
			return fighting;
		else
			return this;
	}

	/**
	 * @return String name
	 */
	public String getName() {
		return name;
	}

	/**
	 * sets parameter name to String name
	 * 
	 * @param String
	 *            name
	 */
	public void setName(String name) {
		if (name == null) {
			throw new IllegalArgumentException("Name cannot be null");
		}
		this.name = name;
	}

	/**
	 * @return String speak
	 */
	public String getSpeak() {
		return this.speak;
	}

	/**
	 * @param speak
	 *            the speak to set
	 */
	public void setSpeak(String speak) {
		if (speak == null) {
			throw new IllegalArgumentException("Speak cannot be null");
		}
		this.speak = speak;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color
	 *            the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the attack
	 */
	public int getAttack() {
		return attack;
	}

	/**
	 * @param attack
	 *            int attack to set
	 */
	public void setAttack(int attack) {
		if (attack < 0) {
			throw new IllegalArgumentException("attack cannot be less than 0");
		}
		this.attack = attack;
	}

	/**
	 * @param Animal
	 *            Compares attack, returns 1 if this attack is greater, returns
	 *            -1 if arg0 attack is greater, returns 0 if they are equal
	 */
	@Override
	public int compareTo(Animal arg0) {
		if (this.getAttack() > arg0.getAttack())
			return 1;
		else if (this.getAttack() < arg0.getAttack())
			return -1;
		else
			return 0;
	}
}
