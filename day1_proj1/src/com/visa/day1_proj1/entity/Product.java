package com.visa.day1_proj1.entity;

import com.visa.day1_proj1.annotation.Column;
import com.visa.day1_proj1.annotation.Table;
@Table(name="products")
public abstract class Product implements Comparable<Product> {
	private int id;
	private String name;
	private double price;
	@Column(name="prod_id",type="NUMERIC(10)")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name="prod_name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public Product() {
	}
	
	public abstract boolean isExpensive();
	
	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return Double.compare(this.price,o.price);
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	

}
