package com.tnsif.staticprograms;

public class Myclass {
	private int section; // instance variable
	static int srNo; // static variables
	
	static {
		System.out.println("-----static block-------");
		srNo=1000;
//		section++;
	}
	
	public Myclass() {
		super();
		System.out.println("------Default Constructor------");
	}
	static void display() {
		System.out.println("----static method-----");
		System.out.println("The serial no is:"+srNo++);
		System.out.println(srNo);
	}
	@Override
	public String toString() {
		return "Myclass [section=" + section + "]";
	}
	
}