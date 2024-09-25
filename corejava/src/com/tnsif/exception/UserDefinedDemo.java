package com.tnsif.exception;

public class UserDefinedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			UserDefined.validate();
		}
		catch(Age e) {
			System.out.println("Age exception is caught:"+e.getMessage());
		}
	
	}

}