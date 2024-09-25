package com.tnsif.staticprograms;

public class Student {
	private String name; // instance variables
	private int id;
	
	static String collegename="DBIT"; // static variables

	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}
	
	

}