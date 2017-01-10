package com.hoglezoo.unittest;

import com.hoglezoo.animals.Arctic;
import com.hoglezoo.animals.Jungle;
import com.hoglezoo.animals.ModeOfTravelInWater;
import com.hoglezoo.animals.Ocean;
import com.hoglezoo.animals.Safari;

public class Zoo {
	/**
	 * Make animals from the other classes prints speak for all the animals an
	 * animal fights an animal from every class
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Arctic PolarBear = new Arctic("PolarBear", 50.5, 50, "Roar");
		Arctic ArcticFox = new Arctic("ArcticFox", 10, 30, "Growl");
		Arctic Seal = new Arctic("Seal", 70, 40, "Bark");
		Jungle Monkey = new Jungle("Monkey", false, 20, "Hehe");
		Jungle Gorilla = new Jungle("Gorilla", false, 25, "Haha");
		Jungle Tiger = new Jungle("Tiger", true, 40, "Roar");
		Safari Giraffe = new Safari("Giraffe", false, 3, "Phh");
		Safari Lion = new Safari("Lion", true, 40, "Roar");
		Ocean Dolphin = new Ocean("Dolphin", false, ModeOfTravelInWater.Fins, "Eeeeek");
		Ocean JellyFish = new Ocean("Jellyfish", true, ModeOfTravelInWater.WaveRiding, "Pff");
		Ocean Squid = new Ocean("Squid", true, ModeOfTravelInWater.Propulsion, "Pluh");

		System.out.println("Speak:");
		System.out.println("");

		System.out.println(PolarBear.getName() + ": " + PolarBear.getSpeak());
		System.out.println(ArcticFox.getName() + ": " + ArcticFox.getSpeak());
		System.out.println(Seal.getName() + ": " + Seal.getSpeak());
		System.out.println(Monkey.getName() + ": " + Monkey.getSpeak());
		System.out.println(Gorilla.getName() + ": " + Gorilla.getSpeak());
		System.out.println(Tiger.getName() + ": " + Tiger.getSpeak());
		System.out.println(Giraffe.getName() + ": " + Giraffe.getSpeak());
		System.out.println(Lion.getName() + ": " + Lion.getSpeak());
		System.out.println(Dolphin.getName() + ": " + Dolphin.getSpeak());
		System.out.println(JellyFish.getName() + ": " + JellyFish.getSpeak());
		System.out.println(Squid.getName() + ": " + Squid.getSpeak());

		System.out.println("");
		System.out.println("Arctic Fights:");
		System.out.println("");

		PolarBear.fight(ArcticFox);
		PolarBear.fight(Tiger);
		PolarBear.fight(Lion);
		PolarBear.fight(Dolphin);

		System.out.println("");
		System.out.println("Jungle Fights:");
		System.out.println("");

		Monkey.fight(Gorilla);
		Monkey.fight(Lion);
		Monkey.fight(JellyFish);
		Monkey.fight(ArcticFox);

		System.out.println("");
		System.out.println("Safari Fights:");
		System.out.println("");

		Giraffe.fight(Lion);
		Giraffe.fight(Dolphin);
		Giraffe.fight(PolarBear);
		Giraffe.fight(Tiger);

		System.out.println("");
		System.out.println("Ocean Fights:");
		System.out.println("");

		Dolphin.fight(Squid);
		Dolphin.fight(Seal);
		Dolphin.fight(Monkey);
		Dolphin.fight(Lion);

		System.out.println("");
		System.out.println("Using eat method:");
		System.out.println("");

		PolarBear.eat();
		Monkey.eat();
		Lion.eat();
		Dolphin.eat();

		System.out.println("");
		System.out.println("Using hide method:");
		System.out.println("");

		PolarBear.hide();
		Monkey.hide();
		Lion.hide();
		Dolphin.hide();

		System.out.println("");
		System.out.println("Jungle class jump:");
		System.out.println("");

		Monkey.jump();

		System.out.println("");
		System.out.println("Jungle class shelter:");
		System.out.println("");

		Gorilla.makeShelter();

		System.out.println("");
		System.out.println("Ocean class swim:");
		System.out.println("");

		JellyFish.swim();

		System.out.println("");
		System.out.println("Ocean class changeDepth:");
		System.out.println("");

		Squid.changeDepth();

		System.out.println("");
		System.out.println("Safari class run:");
		System.out.println("");

		Giraffe.run();

		System.out.println("");
		System.out.println("Safari class sleep");
		System.out.println("");

		Lion.sleep();

		System.out.println("");
		System.out.println("Arctic class hibernate");
		System.out.println("");

		ArcticFox.hibernate();

		System.out.println("");
		System.out.println("Arctic class makeSnowAnimal");
		System.out.println("");

		Seal.makeSnowAnimal();
	}

}