package com.info.glasses;

public class Customers {
	
	private String name;
	
	private long CustID;

	private int noglasses;
	
	

	public Customers(String name, long CustID, int noglasses) {
		super();
		this.name = name;
		this.noglasses= noglasses;
		this.CustID = CustID;
	}

	public String getName() {
		return name;
	}
	public int getNoGlasses() {
		return noglasses;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getCustomerID() {
		return CustID;
	}

	public void setCustomerID(long CustID) {
		this.CustID = CustID;
	}



}
