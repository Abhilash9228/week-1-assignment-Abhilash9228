package com.info.custom;

public class shape extends Glassdesign {

	Glass glass;
	
	public shape(Glass glass) {
		this.glass = glass;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return glass.getDescription()+" , With round shape ";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return glass.cost()+ 3;
	}
	
	

}
