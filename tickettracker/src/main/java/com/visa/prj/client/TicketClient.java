package com.visa.prj.client;

import java.util.Date;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.visa.prj.entity.Employee;
import com.visa.prj.entity.Ticket;
import com.visa.prj.service.TicketService;

public class TicketClient {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("app.xml");
		//below one for xml based spring container creation. 
		
		//go on scanning packages for getting annotation
		ctx.scan("com.visa.prj");
		ctx.refresh();
		
		TicketService ts = ctx.getBean("ticketService",TicketService.class);
		


//		Ticket t1=new Ticket();
//		t1.setDesc("Laptop mother Problem");
//		t1.setRaisedBy(ts.getEmpById(1));
//		ts.raiseTicket(t1);
//		System.out.println("t1 saved");
//		
//		Ticket t = ts.getTicketById(3);
//		t.setResolvedBy(ts.getEmpById(1));
//		Date d= new Date();
//		t.setResolvedDate(d);
//		t.setResolveText("Laptop Changed");
//		
//		ts.updateTicket(t);
		
		for (Ticket t : ts.getAllOpenTickets()) {
			System.out.println(t.getId()+","+t.getDesc()+","+t.getRaisedBy().getEmail()+","+t.getRaisedDate());
		}

		
		

	}

}
