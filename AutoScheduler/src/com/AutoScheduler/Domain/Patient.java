package com.AutoScheduler.Domain;

public class Patient {
	private Therapist lastTherapist;
	private int daysSinceLastSeen;
	private int numOfVisits;
	private int zone;
	private boolean hold;
	private boolean extraWork;
	private boolean discharged;
	
	public Patient(Therapist lastTherapist, int daysSinceLastSeen, int numOfVisits, int zone, boolean hold,
			boolean extraWork, boolean discharged) {
		super();
		this.lastTherapist = lastTherapist;
		this.daysSinceLastSeen = daysSinceLastSeen;
		this.numOfVisits = numOfVisits;
		this.zone = zone;
		this.hold = hold;
		this.extraWork = extraWork;
		this.discharged = discharged;
	}

	public Therapist getLastTherapist() {
		return lastTherapist;
	}

	public void setLastTherapist(Therapist lastTherapist) {
		this.lastTherapist = lastTherapist;
	}

	public int getDaysSinceLastSeen() {
		return daysSinceLastSeen;
	}

	public void setDaysSinceLastSeen(int daysSinceLastSeen) {
		this.daysSinceLastSeen = daysSinceLastSeen;
	}

	public int getNumOfVisits() {
		return numOfVisits;
	}

	public void setNumOfVisits(int numOfVisits) {
		this.numOfVisits = numOfVisits;
	}

	public int getZone() {
		return zone;
	}

	public void setZone(int zone) {
		this.zone = zone;
	}

	public boolean isHold() {
		return hold;
	}

	public void setHold(boolean hold) {
		this.hold = hold;
	}

	public boolean isExtraWork() {
		return extraWork;
	}

	public void setExtraWork(boolean extraWork) {
		this.extraWork = extraWork;
	}

	public boolean isDischarged() {
		return discharged;
	}

	public void setDischarged(boolean discharged) {
		this.discharged = discharged;
	}
}
