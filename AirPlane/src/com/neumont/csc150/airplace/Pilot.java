package com.neumont.csc150.airplace;

/**
 * 
 * @author Alex
 *
 */
public class Pilot {
	private String name;
	private	Rank rank;
	
	public boolean equals(Object obj){
		Pilot pilot = (Pilot) obj;
		return this.name.equals(pilot.name) && this.rank == pilot.rank;
	}
	/**
	 * 
	 * @param name
	 * @param rank
	 */
	public Pilot(String name, Rank rank){
		this.setName(name);
		this.setRank(rank);
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
			throw new IllegalArgumentException("Name connot be null");
		}
		this.name = name;
	}
	/**
	 * @return the rank
	 */
	public Rank getRank() {
		return rank;
	}
	/**
	 * @param rank the rank to set
	 */
	public void setRank(Rank rank) {
		this.rank = rank;
	}
}
