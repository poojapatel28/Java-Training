package com.visa.prj.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.visa.prj.service.BookingService;


public class BookingClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("app.xml");
		//below one for xml based spring container creation. 
		
		//go on scanning packages for getting annotation
		ctx.scan("com.visa.prj");
		ctx.refresh();
		
		BookingService bs = ctx.getBean("bookingService",BookingService.class);
		System.out.println(bs.getHotelById(1));
		System.out.println(bs.getUser("poojapatel2807@gmail.com", "qwertyuiop"));
		System.out.println(bs.findHotels("NY"));
		
		
		
		
		

	}

}
