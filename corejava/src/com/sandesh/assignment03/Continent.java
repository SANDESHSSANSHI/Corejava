package com.sandesh.assignment03;

public class Continent {
	private String rivers;
	private String mountains;
	private String monuments;
	private String statues;
	public Continent() {
		super();
	}
	public Continent(String rivers, String mountains, String monuments, String statues) {
		super();
		this.rivers = rivers;
		this.mountains = mountains;
		this.monuments = monuments;
		this.statues = statues;
	}
	public String getRivers() {
		return rivers;
	}
	public void setRivers(String rivers) {
		this.rivers = rivers;
	}
	public String getMountains() {
		return mountains;
	}
	public void setMountains(String mountains) {
		this.mountains = mountains;
	}
	public String getMonuments() {
		return monuments;
	}
	public void setMonuments(String monuments) {
		this.monuments = monuments;
	}
	public String getStatues() {
		return statues;
	}
	public void setStatues(String statues) {
		this.statues = statues;
	}
	@Override
	public String toString() {
		return "Continent [rivers=" + rivers + ", mountains=" + mountains + ", monuments=" + monuments + ", statues="
				+ statues + "]";
	}
}
