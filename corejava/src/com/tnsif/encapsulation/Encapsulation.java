package com.tnsif.encapsulation;

public class Encapsulation {
	private int serialNum=10,age;
	private String name;
	public int getSerialNum() {
		return serialNum;
	}
	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;
	}
	@Override
	public String toString() {
		return "Encapsulation [serialNum=" + serialNum + ", age=" + age + ", name=" + name + "]";
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
