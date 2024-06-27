
// program to demonstrate inheritance

package com.tnsif.inheritance;

public class Customer {
	
	private String name;
	private int id;
	private long aadharNo;
	private long phoneNo;
	
	public Customer() {
		super();
	}

	

	public Customer(String name, int id, long aadharNo, long phoneNo) {
		super();
		this.name = name;
		this.id = id;
		this.aadharNo = aadharNo;
		this.phoneNo = phoneNo;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	
}
