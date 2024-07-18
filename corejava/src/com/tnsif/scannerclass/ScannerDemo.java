// program to demonstrate Scanner class
package com.tnsif.scannerclass;

import java.util.Scanner;
public class ScannerDemo {
	public static void main(String[]  args) {
	Scanner ob=new Scanner(System.in);
	System.out.println("Enter the id");
	boolean a=ob.hasNextInt();
	int id=ob.nextInt();
	if(ob.hasNextInt())
	{
		System.out.println(id);
	}
	String name=ob.nextLine();
	char a1=ob.next().charAt(0); // which index you want to read 
	}
}