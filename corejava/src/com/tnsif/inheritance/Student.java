package com.tnsif.inheritance;

public class Student extends Customer{
	private String collegeName;
	private int rollNo;
	


	public Student(String name, int id, long aadharNo, long phoneNo, String collegeName, int rollNo) {
		super(name, id, aadharNo, phoneNo);
		// TODO Auto-generated constructor stub
		this.collegeName = collegeName;
		this.rollNo = rollNo;
		
		
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	@Override
	public String toString() {
		return "Student [collegeName=" + collegeName + ", rollNo=" + rollNo + ", getName()=" + getName() + ", getId()="
				+ getId() + ", getAadharNo()=" + getAadharNo() + ", getPhoneNo()=" + getPhoneNo() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	 

	
	
}