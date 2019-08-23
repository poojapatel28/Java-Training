package com.visa.prj.client;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.visa.prj.entity.Customer;
import com.visa.prj.entity.Item;
import com.visa.prj.entity.Order;
import com.visa.prj.service.OrderService;

public class OrderClient {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("app.xml");
		//below one for xml based spring container creation. 
		
		//go on scanning packages for getting annotation
		ctx.scan("com.visa.prj");
		ctx.refresh();
		
		//in annotation based container creation  bean id is assigned as classname with first letter in lower case. 
		OrderService os = ctx.getBean("orderService",OrderService.class);
		
//		Order o= new Order();
//		Product p1=os.getById(3);
//		Product p2=os.getById(1);
//		Item i1=new Item();
//		i1.setProduct(p1);
//		i1.setQty(1);
//		i1.setAmount(p1.getPrice()*i1.getQty());
//		
//		Item i2 = new Item();
//		i2.setProduct(p2);
//		i2.setQty(10);
//		i2.setAmount(p2.getPrice()*i2.getQty());
//		
//		o.getItems().add(i1);
//		o.getItems().add(i2);
//		
//		Customer c = new Customer();
//		c.setEmail("a@visa.com");
//		o.setCustomer(c);
		
//		os.placeOrder(o);
		Customer c = new Customer();
		c.setEmail("a@visa.com");	
		List<Order> orders = os.getOrders(c);
		for(Order o:orders)
		{
			System.out.println(o.getOid()+","+o.getOrderDate()+","+o.getTotal());;
			System.out.println("Customer : "+o.getCustomer().getFirstName());
			List<Item> items = o.getItems();
			for(Item i:items)
			{
				System.out.println(i.getProduct().getName()+","+i.getQty()+","+i.getAmount());
			}
		}
	}

}
