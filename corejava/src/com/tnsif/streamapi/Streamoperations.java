package com.tnsif.streamapi;

import java.util.stream.Stream;
import java.util.*;
public class Streamoperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] values=new Integer[] {10,20,30,40};//input from arrays
		Stream<Integer>ob= Arrays.stream(values);
		
		// usage of map() to demonstrate square of number
		
		System.out.println("Square of number:"+Arrays.toString(values));
		ob.map(num->num*num).forEach(System.out::println);
		

		
		
		

	}

}
