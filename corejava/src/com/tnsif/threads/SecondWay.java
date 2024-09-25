package com.tnsif.threads;

public class SecondWay implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecondWay t=new SecondWay();
		Thread th=new Thread(t);
		th.start();
//		th.start(); illegal thread state exception
		th.run();
//		th.run();
		
	}
	public void run() {
		System.out.println("creation of thread using runnable interface");
	}
}
