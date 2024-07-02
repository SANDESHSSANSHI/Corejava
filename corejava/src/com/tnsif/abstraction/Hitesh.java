package com.tnsif.abstraction;

public class Hitesh extends TaxPayer{

	public Hitesh(double salary) {
		super(salary);
	}
	public double calTax(){
		
		return salary * 0.15;
	}
}