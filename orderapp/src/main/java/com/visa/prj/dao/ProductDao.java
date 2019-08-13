package com.visa.prj.dao;

import java.util.List;

import com.visa.prj.entity.Product;

public interface ProductDao {
	
	List<Product> getProducts();
	Product GetProduct(int id);
	int addProduct(Product p);

}
