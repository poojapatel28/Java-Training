package com.visa.day1_proj1.entity;

public class Mobile extends Product {
	
	private String connectivity;

	public Mobile() {
	}

	public Mobile(int id, String name, double price, String connectivity) {
		super(id, name, price);
		this.connectivity = connectivity;
	}

	public String getConnectivity() {
		return connectivity;
	}

	public void setConnectivity(String connectivity) {
		connectivity = connectivity;
	}

	@Override
	public boolean isExpensive() {
		// TODO Auto-generated method stub
		if("3G".equals(connectivity)&& getPrice()>5000)
		{
			return true;
		}
		else if("4G".equals(connectivity)&& getPrice()>15000)
		{
			return true;
		}
			return false;
	}
	

}
