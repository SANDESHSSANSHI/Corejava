package com.tnsif.abstraction;

public class Akash extends TaxPayer{

	public Akash(double salary) {
		super(salary);
	}
	
	public double calTax() {
		if(salary<=500000) {
			return salary * 0.10;
		}
		else
		{
			return salary * 0.20;
		}
	}
}