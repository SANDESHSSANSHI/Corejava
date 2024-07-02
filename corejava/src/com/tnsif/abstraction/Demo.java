package com.tnsif.abstraction;
import java.util.Scanner;


public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter salary of Akash : ");
		double akashsalary = sc.nextDouble();
		TaxPayer ob = new Akash(akashsalary);
		
		System.out.println("enter salary of Hitesh : ");
		double hiteshsalary = sc.nextDouble();
		TaxPayer ob1 =  new Hitesh(hiteshsalary);
		
		System.out.println("Akash tax: ");
		ob.display();
		
		System.out.println("Hitesh tax: ");
		ob1.display();

	}

}
