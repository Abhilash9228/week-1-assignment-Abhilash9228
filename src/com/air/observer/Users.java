package com.air.observer;

import com.info.glasses.Customers;

public class Users implements Observer{


	public boolean BulkOrder(Customers customers) {
		if (customers.getNoGlasses()>=10) {
			System.out.println(customers.getName() + " got a discount of 10% for placing a bulk order");
		return true;
		}
		return false;
	}

	@Override
	public void registerUser(Customers customers) {
		System.out.println("The customer "+customers.getName()+" can get 10% off on orders above 10 glasses, no coupon required");
		System.out.println("The customer "+customers.getName()+" is registered");

	}




}
