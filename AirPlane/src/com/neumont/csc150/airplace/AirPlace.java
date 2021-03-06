package com.neumont.csc150.airplace;

import java.util.ArrayList;

public class AirPlace {

	public static void main(String[] args) {

		// Passenger
		ArrayList<Passenger> Passenger = new ArrayList<>();
		Passenger Passenger1 = new Passenger("Bob", 55);
		Passenger Passenger2 = new Passenger("Fred", 60);
		Passenger Passenger3 = new Passenger("Sue", 35);
		Passenger Passenger4 = new Passenger("Hunter", 20);
		Passenger Passenger5 = new Passenger("Forrest", 23);
		Passenger Passenger6 = new Passenger("Dylan", 13);
		Passenger Passenger7 = new Passenger("Errrrrlin", 18);
		Passenger Passenger8 = new Passenger("Mike", 40);
		Passenger Passenger9 = new Passenger("Rick", 50);
		Passenger Passenger10 = new Passenger("Parker", 19);
		Passenger.add(Passenger1);
		Passenger.add(Passenger2);
		Passenger.add(Passenger3);
		Passenger.add(Passenger4);
		Passenger.add(Passenger5);
		Passenger.add(Passenger6);
		Passenger.add(Passenger7);
		Passenger.add(Passenger8);
		Passenger.add(Passenger9);
		Passenger.add(Passenger10);

		// Pilots
		ArrayList<Pilot> pilots = new ArrayList<>();
		Pilot Pilot1 = new Pilot("Rich", Rank.SeniorCap);
		Pilot Pilot2 = new Pilot("Luke", Rank.CoPilot);
		pilots.add(Pilot1);
		pilots.add(Pilot2);

		// Planes
		AirPlane Plane1 = new AirPlane("747", 750, 10, pilots, 2, Passenger);
		AirPlane Plane2 = new AirPlane("AirBus", 800, 10, pilots, 4, Passenger);

		if (Plane1.equals(Plane2))
			System.out.println("Planes Equal");
		else
			System.out.println("Planes Not Equal");

	}

}
