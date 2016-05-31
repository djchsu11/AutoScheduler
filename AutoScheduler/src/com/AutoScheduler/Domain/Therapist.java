package com.AutoScheduler.Domain;

public class Therapist {
	private String name;
	private int zone;
	private int numOfHours;
	
	public Therapist(String name, int zone, int numOfHours) {
		super();
		this.name = name;
		this.zone = zone;
		this.numOfHours = numOfHours;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getZone() {
		return zone;
	}

	public void setZone(int zone) {
		this.zone = zone;
	}

	public int getNumOfHours() {
		return numOfHours;
	}

	public void setNumOfHours(int numOfHours) {
		this.numOfHours = numOfHours;
	}
	
	
}
