package com.info.order;

import com.air.observer.Users;
import com.info.custom.Glass;
import com.info.custom.Partyglass;
import com.info.custom.color;
import com.info.custom.shape;
import com.info.glasses.Customers;

public class OrderGlass {
	
	public static void main(String[] args) {
		
		//Register User 
		Customers c1 = new Customers("Customer1", 001, 9);
		Users user = new Users();
		user.registerUser(c1);
		boolean discount = user.BulkOrder(c1);
		Glass partyglass = new Partyglass();
		int noglasses=c1.getNoGlasses();
		previewOrder(partyglass,discount,noglasses);

		partyglass = new shape(partyglass);
		previewOrder(partyglass,discount,noglasses);

		partyglass = new color(partyglass);
		previewOrder(partyglass,discount,noglasses);


		
	}
	
	private static void previewOrder(Glass g,boolean discount, int noglasses) {
		double cost = g.cost();
		if(discount){
			cost*=0.9;
		}
	    System.out.println("Cost is: " + cost + "$ per glass, Description of the glass chosen: " + g.getDescription());
		System.out.println("total cost is :"+cost*noglasses);
	}
	
	

}
