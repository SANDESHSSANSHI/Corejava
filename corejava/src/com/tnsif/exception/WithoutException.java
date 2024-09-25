package com.tnsif.exception;

public class WithoutException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d=0;
		try {
			int a=42/d; //Exception is raised
			System.out.println("Harshit");
		}
		catch(ArithmeticException e) {
			System.out.println("Exception handle successfully"+ e.getMessage());
		}
		System.out.println("Will not be printed");

	}

}