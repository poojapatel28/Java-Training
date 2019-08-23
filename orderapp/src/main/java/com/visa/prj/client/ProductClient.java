package com.visa.prj.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.visa.prj.entity.Product;
import com.visa.prj.service.OrderService;

public class ProductClient {

	public static void main(String[] args) {
		// create spring container
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("app.xml");
		//below one for xml based spring container creation. 
		
		//go on scanning packages for getting annotation
		ctx.scan("com.visa.prj");
		ctx.refresh();
		
		//in annotation based container creation  bean id is assigned as classname with first letter in lower case. 
		OrderService os = ctx.getBean("orderService",OrderService.class);
		
		Product p=new Product(0,"Logitech Mouse","computer",450.00,1000);
		//os.insertProduct(p);
		//System.out.println("Inserted : "+ p.getId());
		p=os.getById(1);
		
		System.out.println(p.getName()+","+p.getCategory()+","+p.getPrice());
		
		System.out.println("-----All Products-----");
		for (Product pt : os.fetchProducts()) {
			System.out.println(pt.getName()+","+pt.getCategory()+","+pt.getPrice()+","+pt.getCount()+","+pt.getId());
		}

	}

}
