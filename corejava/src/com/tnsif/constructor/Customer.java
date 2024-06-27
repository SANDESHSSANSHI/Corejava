package com.tnsif.constructor;

public class Customer {
	
	private int Customer_id;
	private String Customer_name;
	
	
	//getter and setter
	public int getCustomer_id() {
		return Customer_id;
	}
	public void setCustomer_id(int customer_id) {
		Customer_id = customer_id;
	}
	public String getCustomer_name() {
		return Customer_name;
	}
	public void setCustomer_name(String customer_name) {
		Customer_name = customer_name;
	}
	
	//default constructor
	
	public Customer() {
		super();
		System.out.println("----default constructor----");
	}
	
	//Parameterized constructor 
	public Customer(int customer_id, String customer_name) {
		super();
		Customer_id = customer_id;
		Customer_name = customer_name;
	}
	@Override
	public String toString() {
		return "Customer [Customer_id=" + Customer_id + ", Customer_name=" + Customer_name + "]";
	}
	
	
	
	
	
	
	
	

}
