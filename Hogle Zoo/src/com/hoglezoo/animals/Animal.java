package com.hoglezoo.animals;

abstract public class Animal implements AnimalType, Comparable<Animal> {
	private String name;
	protected String speak;
	private String color;
	private int attack;

	public Animal() {

	}

	public Animal(String name, String color, String speak, int attack) {
		this.setName(name);
		this.setColor(color);
		this.setSpeak(speak);
		this.setAttack(attack);
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Animal)) {
			throw new IllegalArgumentException("obj must be an instance of animal");
		}
		Animal equalling = (Animal) obj;
		return this.getName().equals(equalling.getName()) && this.getColor().equals(equalling.getColor())
				&& this.getSpeak().equals(equalling.getSpeak()) && this.getAttack() == equalling.getAttack();
	}

	@Override
	public String toString() {
		return "Name: " + this.getName() + ", Speak: " + this.getSpeak() + ", Color: " + this.getColor();
	}

	/**
	 * 
	 */
	public String eat() {
		return this.name + " has ate.";
	}

	/**
	 * 
	 */
	public String hide() {
		return this.name + " is hiding.";
	}

	/**
	 * 
	 * @param Anial
	 *            object to fight another Animal object
	 * 
	 */
	public Animal fight(Animal fighting) {
		if (this.getAttack() < fighting.getAttack())
			return fighting;
		else
			return this;
	}

	/**
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		if (name == null) {
			throw new IllegalArgumentException("Name cannot be null");
		}
		this.name = name;
	}

	/**
	 * @return the speak
	 */
	abstract public String getSpeak();

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
	 *            the attack to set
	 */
	public void setAttack(int attack) {
		if (attack < 0) {
			throw new IllegalArgumentException("attack cannot be less than 0");
		}
		this.attack = attack;
	}

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
