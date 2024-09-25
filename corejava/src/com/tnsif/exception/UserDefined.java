package com.tnsif.exception;

import java.util.Scanner;
public class UserDefined {
	private static int age;
	
	static void validate() throws Age,ArithmeticException{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		age=sc.nextInt();
		if(age<=18) {
			throw new Age("invalid age");
		}
		else {
			System.out.println("valid age");
		}
	}

}