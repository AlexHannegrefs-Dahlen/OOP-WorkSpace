package com.hoglezoo.animals;

import java.util.Random;

/**
 * 
 * @author Alex
 *
 */
public class Ocean {
	private boolean waterBreathing;
	private ModesOfTravel travelMode;
	private String speak;
	private Random gen = new Random();
	
	public Ocean(){
		
	}
	
	public Ocean(boolean waterBreathing, ModesOfTravel travelMode, String speak){
		this.setWaterBreathing(waterBreathing);
		this.setTravelMode(travelMode);
		this.setSpeak(speak);
	}
	
	/**
	 * 
	 * @param obj
	 */
	public void fight(Object obj){
	
	}
	
	/**
	 * 
	 * @return
	 */
	public static String getType(){
		return "Ocean";
	}
	
	/**
	 * @return the speak
	 */
	public String getSpeak() {
		return speak;
	}
	/**
	 * @param speak the speak to set
	 */
	public void setSpeak(String speak) {
		this.speak = speak;
	}
	/**
	 * @return the waterBreathing
	 */
	public boolean isWaterBreathing() {
		return waterBreathing;
	}
	/**
	 * @param waterBreathing the waterBreathing to set
	 */
	public void setWaterBreathing(boolean waterBreathing) {
		this.waterBreathing = waterBreathing;
	}
	/**
	 * @return the travelMode
	 */
	public ModesOfTravel getTravelMode() {
		return travelMode;
	}
	/**
	 * @param travelMode the travelMode to set
	 */
	public void setTravelMode(ModesOfTravel travelMode) {
		this.travelMode = travelMode;
	}
}
