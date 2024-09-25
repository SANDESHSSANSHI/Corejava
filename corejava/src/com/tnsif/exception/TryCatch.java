// program to demonstrate try multiple catch blocks 
package com.tnsif.exception;

public class TryCatch {
	public static void divide() {
		int a=6,b=0,c=0,d=0;
		try {			
			c=a/b; //exception raised
			
		}
		catch(ArithmeticException e) {
			System.out.println("Exception caught"+e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception Caught"+e.getMessage());
		}
		catch(NullPointerException e) {
			System.out.println("Exception Caught"+e.getMessage());
		}
		catch(Exception e) {
			System.out.println("Exception caught"+e.getMessage());
		}
		
		
	}

}