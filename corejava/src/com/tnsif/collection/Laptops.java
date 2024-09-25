package com.tnsif.collection;

public class Laptops implements Comparable<Laptops> {
	
	public Laptops(int price, int ram, String brand) {
		super();
		this.price = price;
		this.ram = ram;
		this.brand = brand;
	}
	private int price,ram;
	private String brand;
	@Override
	public String toString() {
		return "Laptops [price=" + price + ", ram=" + ram + ", brand=" + brand + "]";
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public int compareTo(Laptops o)
	{
		if(this.getRam()<o.getRam())
		{
			return 1;
		}
		return 0;
	}

}
