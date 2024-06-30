package com.sandesh.assignment03;
public class Country extends Continent {
	
	private String lakes;
	private String hills;
	private String memorials;
	public Country() {
		super();
	}
	public Country(String lakes, String hills, String memorials,String rivers, String mountains, String monuments, String statues) {
		super( rivers, mountains,  monuments, statues);
		this.lakes = lakes;
		this.hills = hills;
		this.memorials = memorials;
		
		
	}
	public String getLakes() {
		return lakes;
	}
	public void setLakes(String lakes) {
		this.lakes = lakes;
	}
	public String getHills() {
		return hills;
	}
	public void setHills(String hills) {
		this.hills = hills;
	}
	public String getMemorials() {
		return memorials;
	}
	public void setMemorials(String memorials) {
		this.memorials = memorials;
	}
	@Override
	public String toString() {
		return "Country [lakes=" + lakes + ", hills=" + hills + ", memorials=" + memorials + ", getRivers()="
				+ getRivers() + ", getMountains()=" + getMountains() + ", getMonuments()=" + getMonuments()
				+ ", getStatues()=" + getStatues() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	

	
	

}