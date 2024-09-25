package com.tnsif.exception;

import java.io.IOException;


public class ThrowsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Throws ob=new Throws();
		try {
			ob.display();
		}
		catch(IOException e) {
			System.out.println("Exception caught"+e.getMessage());
		}
	}

}