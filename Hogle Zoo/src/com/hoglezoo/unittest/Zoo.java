package com.hoglezoo.unittest;

import com.hoglezoo.animals.Animal;
import com.hoglezoo.animals.Arctic;
import com.hoglezoo.animals.Jungle;
import com.hoglezoo.animals.ModeOfTravelInWater;
import com.hoglezoo.animals.Ocean;
import com.hoglezoo.animals.Safari;

public class Zoo {
	/**
	 * 
	 * @param args
	 *            Array of type animal uses animal class and Arctic, Jungle,
	 *            Safari, and Ocean class methods
	 */
	public static void main(String[] args) {
		Animal[] animals = new Animal[11];
		animals[0] = new Arctic("PolarBear", 50.5, 50, "Roar", "White", 150);
		animals[1] = new Arctic("ArcticFox", 10, 30, "Growl", "White", 50);
		animals[2] = new Arctic("Seal", 70, 40, "Bark", "White", 25);
		animals[3] = new Jungle("Monkey", false, 20, "Hehe", "Brown", 30);
		animals[4] = new Jungle("Gorilla", false, 25, "Haha", "Black", 60);
		animals[5] = new Jungle("Tiger", true, 40, "Roar", "Orange", 50);
		animals[6] = new Safari("Giraffe", false, 3, "Phh", "Yellow", 10);
		animals[7] = new Safari("Lion", true, 40, "Roar", "Yellow", 51);
		animals[8] = new Ocean("Dolphin", false, ModeOfTravelInWater.Fins, "Eeeeek", "Gray", 20);
		animals[9] = new Ocean("Jellyfish", true, ModeOfTravelInWater.WaveRiding, "Pff", "Pink", 5);
		animals[10] = new Ocean("Squid", true, ModeOfTravelInWater.Propulsion, "Pluh", "Gray", 8);

		System.out.println("Speak:");
		System.out.println("");

		for (int i = 0; i < animals.length; i++) {
			System.out.println(animals[i].getName() + ": " + animals[i].getSpeak());
		}

		System.out.println("");
		System.out.println("Fights:");
		System.out.println("");

		for (int i = 0; i < animals.length; i++) {
			if (i == animals.length - 1)
				System.out.println((animals[i].fight(animals[0])).getName() + " wins");
			else
				System.out.println((animals[i].fight(animals[i + 1])).getName() + " wins");
		}

		System.out.println("");
		System.out.println("Using eat method:");
		System.out.println("");

		for (int i = 0; i < animals.length; i++) {
			System.out.println(animals[i].eat());
		}

		System.out.println("");
		System.out.println("Using hide method:");
		System.out.println("");

		for (int i = 0; i < animals.length; i++) {
			System.out.println(animals[i].hide());
		}

		System.out.println("");
		System.out.println("Jungle class jump:");
		System.out.println("");

		((Jungle) animals[4]).jump();

		System.out.println("");
		System.out.println("Jungle class shelter:");
		System.out.println("");

		((Jungle) animals[5]).makeShelter();

		System.out.println("");
		System.out.println("Jungle class lawDown:");
		System.out.println("");

		((Jungle) animals[3]).layDown();

		System.out.println("");
		System.out.println("Ocean class swim:");
		System.out.println("");

		((Ocean) animals[8]).swim();

		System.out.println("");
		System.out.println("Ocean class goDeeper:");
		System.out.println("");

		((Ocean) animals[10]).goDeeper();

		System.out.println("");
		System.out.println("Ocean class goShallow:");
		System.out.println("");

		((Ocean) animals[9]).goShallow();

		System.out.println("");
		System.out.println("Safari class run:");
		System.out.println("");

		((Safari) animals[6]).run();

		System.out.println("");
		System.out.println("Safari class sleep:");
		System.out.println("");

		((Safari) animals[7]).sleep();

		System.out.println("");
		System.out.println("Safari class clean:");
		System.out.println("");

		((Safari) animals[6]).clean();

		System.out.println("");
		System.out.println("Arctic class hibernate:");
		System.out.println("");

		((Arctic) animals[0]).hibernate();

		System.out.println("");
		System.out.println("Arctic class makeSnowAnimal:");
		System.out.println("");

		((Arctic) animals[1]).makeSnowAnimal();

		System.out.println("");
		System.out.println("Arctic class roll:");
		System.out.println("");

		((Arctic) animals[2]).roll();

		System.out.println("");
		System.out.println("toString:");
		System.out.println("");

		for (int i = 0; i < animals.length; i++) {
			System.out.println(animals[i].toString());
		}

		System.out.println("");
		System.out.println("compareTo:");
		System.out.println("");

		for (int i = 0; i < animals.length; i++) {
			if (i == animals.length - 1) {
				if (animals[i].compareTo(animals[0]) > 0)
					System.out.println(animals[10].getName() + " is stronger");
				else
					System.out.println(animals[0].getName() + " is stronger");
			} else {
				if (animals[i].compareTo(animals[i + 1]) > 0)
					System.out.println(animals[i].getName() + " is stronger");
				else
					System.out.println(animals[i + 1].getName() + " is stronger");

			}
		}
	}
}