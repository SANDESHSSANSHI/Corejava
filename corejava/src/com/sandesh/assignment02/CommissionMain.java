package com.sandesh.assignment02;

public class CommissionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Commission obj=new Commission();
		obj.employee_details_entry();
		double commission = obj.calculate_commission();
		System.out.println("Commission is : "+commission);
		
	}

}
