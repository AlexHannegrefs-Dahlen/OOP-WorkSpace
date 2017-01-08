package com.hoglezoo.animals;

import java.util.Random;

public class Animal {
	protected String name;
	protected String speak;

	private int numberGen() {
		Random gen = new Random();
		return gen.nextInt(2);
	}

	/**
	 * 
	 * @param Jungle
	 *            object to fight Safari
	 */
	public void fight(Jungle fighting) {
		if (numberGen() == 1) {
			System.out.println(fighting.getName() + " wins");
		} else
			System.out.println(this.getName() + " wins");
	}

	/**
	 * 
	 * @param Ocean
	 *            object to fight Safari
	 */
	public void fight(Ocean fighting) {
		if (numberGen() == 1) {
			System.out.println(fighting.getName() + " wins");
		} else
			System.out.println(this.getName() + " wins");
	}

	/**
	 * 
	 * @param Arctic
	 *            object to fight Safari
	 */
	public void fight(Arctic fighting) {
		if (numberGen() == 1) {
			System.out.println(fighting.getName() + " wins");
		} else
			System.out.println(this.getName() + " wins");
	}

	/**
	 * 
	 * @param Safari
	 *            object to fight Safari
	 */
	public void fight(Safari fighting) {
		if (numberGen() == 1) {
			System.out.println(fighting.getName() + " wins");
		} else
			System.out.println(this.getName() + " wins");
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
	public String getSpeak() {
		return speak;
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
}
