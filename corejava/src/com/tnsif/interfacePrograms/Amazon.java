package com.tnsif.interfacePrograms;

public interface Amazon {
	void welcome();//abstract method
	void thankyou();//abstract method
	
	default void servicecharge()
	{
		int amt=100;
		System.out.println("The service charge is :"+amt);
	}
	 
	static void aboutUs()
	{
		System.out.println("This is Amazon");
	}

}
