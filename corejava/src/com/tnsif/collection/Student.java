package com.tnsif.collection;

public class Student {
	 int rollno;
	 String name,addresses;
	public Student(int rollno, String name, String addresses) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.addresses = addresses;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", addresses=" + addresses + "]";
	}
	
	
}