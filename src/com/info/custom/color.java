package com.info.custom;

public class color extends Glassdesign {
   
	Glass glass;
	
	public color(Glass glass) {
		this.glass= glass;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return glass.getDescription() +", With multi-color ";
	} 

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return glass.cost()+ 2.5;
	}

}
