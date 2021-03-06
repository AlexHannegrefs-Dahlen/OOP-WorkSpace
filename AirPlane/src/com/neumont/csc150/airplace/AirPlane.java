package com.neumont.csc150.airplace;

import java.util.ArrayList;

/**
 * 
 * @author Alex
 *
 */
public class AirPlane {
	private String model;
	private double airSpeed;
	private int numberOfSeats;
	private ArrayList<Pilot> pilots;
	private int flightAttendants;
	private ArrayList<Passenger> passengers;
	
	/**
	 * returns true if obj equals this
	 */
	public boolean equals(Object obj) {
		AirPlane plane = (AirPlane) obj;
		return (this.model.equals(plane.model) && this.airSpeed == plane.airSpeed
				&& this.numberOfSeats == plane.numberOfSeats && this.passengers == plane.passengers
				&& plane.flightAttendants == this.flightAttendants && plane.pilots == this.pilots);
	}

	/**
	 * 
	 * @param model
	 * @param airSpeed
	 * @param numberOfSeats
	 * @param pilots
	 * @param flightAttendants
	 */
	public AirPlane(String model, double airSpeed, int numberOfSeats, ArrayList<Pilot> pilots, int flightAttendants,
			ArrayList<Passenger> passengers) {
		this.setModel(model);
		this.setAirSpeed(airSpeed);
		this.setNumberOfSeats(numberOfSeats);
		this.setPilots(pilots);
		this.setFlightAttendants(flightAttendants);
		this.setPassengers(passengers);
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model
	 *            the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the airSpeed
	 */
	public double getAirSpeed() {
		return airSpeed;
	}

	/**
	 * @param airSpeed
	 *            the airSpeed to set
	 */
	public void setAirSpeed(double airSpeed) {
		this.airSpeed = airSpeed;
	}

	/**
	 * @return the numberOfSeats
	 */
	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	/**
	 * @param numberOfSeats
	 *            the numberOfSeats to set
	 */
	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	/**
	 * @return the pilots
	 */
	public ArrayList<Pilot> getPilots() {
		return pilots;
	}

	/**
	 * @param pilots
	 *            the pilots to set
	 */
	public void setPilots(ArrayList<Pilot> pilots) {
		this.pilots = pilots;
	}

	/**
	 * @return the flightAttendants
	 */
	public int getFlightAttendants() {
		return flightAttendants;
	}

	/**
	 * @param flightAttendants
	 *            the flightAttendants to set
	 */
	public void setFlightAttendants(int flightAttendants) {
		this.flightAttendants = flightAttendants;
	}

	/**
	 * @return the passengers
	 */
	public ArrayList<Passenger> getPassengers() {
		return passengers;
	}

	/**
	 * @param passengers
	 *            the passengers to set
	 */
	public void setPassengers(ArrayList<Passenger> passengers) {
		this.passengers = passengers;
	}
}
