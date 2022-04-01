package com.air.observer;

import com.info.glasses.Customers;

public interface Observer {
	//This method calls the method registerUser to register passed as input
	public void registerUser(Customers customers);

	public boolean BulkOrder(Customers customers);

}
