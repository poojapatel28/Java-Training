package com.visa.training.jdbc;

import java.util.List;

public class ProductApp {
	
	public static void main(String[] args)
	{
		JdbcProductDao dao = new JdbcProductDao();
		Product test = new Product("test", 20000, 100);
		
		Product saved = dao.save(test);
		System.out.println("saved product id " + saved.getId());
		List<Product> li = dao.findAll();
		li.forEach(System.out::println);
	}

}
