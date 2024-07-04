package com.tnsif.Polymorphism;

public class MainOverloading {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("HELLO");
		main(81);
		main("DBIT");
	}
	public static void main(int num) {
        System.out.println("Hello ..! " + num);
    }
	public static void main(String arg) {
        System.out.println("Hello "+ arg);
    }

}
