package com.tnsif.streamapi;

import java.util.Arrays;
import java.util.stream.Stream;

public class Streamoperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				//using of()  method
				Stream<Integer>ob=Stream.of(10,20,30);
				//System.out.println(ob);
				//ob.forEach(System.out::println);
				
				// using stream() method
				Integer[] values=new Integer[] {10,20,30,40};
				ob = Arrays.stream(values);
				//System.out.println(ob);
				ob.forEach(System.out::println);
		

	}

}
