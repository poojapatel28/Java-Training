package com.visa.training.jdbc;

public class Product {
	
	private String name;
	private int id;
	private int qoh;
	private float price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQoh() {
		return qoh;
	}
	public void setQoh(int qoh) {
		this.qoh = qoh;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Product(String name, int qoh, float price) {
		super();
		this.name = name;
		this.qoh = qoh;
		this.price = price;
	}
	
	public Product()
	{
		
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", id=" + id + ", qoh=" + qoh + ", price=" + price + "]";
	}
	
	

}
