//program to demonstrate abstract class
package com.tnsif.abstraction;

public abstract class TaxPayer {
	public abstract double calTax();	//abstract method
	protected double salary;
	
	public TaxPayer(double salary) {	//parameterized constructor
		super();
		this.salary = salary;
	}
	
	public void display() {
		System.out.println("the tax payed is : "+calTax());
		
	}
	
	
}
