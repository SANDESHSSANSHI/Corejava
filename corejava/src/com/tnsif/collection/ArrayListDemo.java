package com.tnsif.collection;

import java.util.*;


public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ob=new ArrayList();
		System.out.println("The size of the array list is:"+ob.size());  // to check the size of the ArrayList
		ob.add(2);
		ob.add('a');
		ob.add(22.35);
		System.out.println("The elements of the array are:"+ob);
		System.out.println("Check the elements is there or not:"+ob.contains(22.35));
		System.out.println("Remove the specified element from the list:"+ob.remove(0));
		System.out.println("The elements of the array are:"+ob);
		System.out.println(ob.isEmpty());
		
		ArrayList <String>obj=new ArrayList<String>();
		obj.add("Bangalore");
		obj.add("Mysore");
		obj.add("Hubli");
		System.out.println("The elements of the array:"+obj);
		Collections.sort(obj);
		System.out.println("The elements of the array after sorting  are:"+obj);
		
		Iterator<String> i=obj.iterator();
		while(i.hasNext()) {
			String nm=i.next();			
			System.out.println(nm);
		}
		
	}

}