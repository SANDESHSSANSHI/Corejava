package com.tnsif.collection;
import java.util.*;

public class Demo 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List<Laptops>laps=new ArrayList<Laptops>();
		laps.add(new Laptops(55000,12,"dell"));
		laps.add(new Laptops(65000,11,"hp"));
		laps.add(new Laptops(95000,10,"lenovo"));
		Collections.sort(laps);
		for(Laptops l:laps)
		{
			System.out.println(l);
		}
	}
	
}
