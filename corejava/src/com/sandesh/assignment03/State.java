package com.sandesh.assignment03;

public class State extends Country {
	
	private String ponds;
	private String peaks;
	public State() {
		super();
	}
	public State(String lakes, String hills, String memorials, String rivers, String mountains, String monuments,
			String statues,String ponds,String peaks) {
		super(lakes, hills, memorials, rivers, mountains, monuments, statues);
		// TODO Auto-generated constructor stub
		this.ponds=ponds;
		this.peaks=peaks;
	}
	public String getPonds() {
		return ponds;
	}
	public void setPonds(String ponds) {
		this.ponds = ponds;
	}
	public String getPeaks() {
		return peaks;
	}
	public void setPeaks(String peaks) {
		this.peaks = peaks;
	}
	@Override
	public String toString() {
		return "State [ponds=" + ponds + ", peaks=" + peaks + ", getLakes()=" + getLakes() + ", getHills()="
				+ getHills() + ", getMemorials()=" + getMemorials() + ", toString()=" + super.toString()
				+ ", getRivers()=" + getRivers() + ", getMountains()=" + getMountains() + ", getMonuments()="
				+ getMonuments() + ", getStatues()=" + getStatues() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	
	
	
	

}