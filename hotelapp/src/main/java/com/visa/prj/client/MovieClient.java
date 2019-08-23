package com.visa.prj.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.visa.prj.dao.MovieDao;
import com.visa.prj.entity.Actor;
import com.visa.prj.entity.Movie;

public class MovieClient {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("app.xml");
		//below one for xml based spring container creation. 
		
		//go on scanning packages for getting annotation
		ctx.scan("com.visa.prj");
		ctx.refresh();
		
		MovieDao dao = ctx.getBean("movieDao",MovieDao.class);
		
		Movie m = new Movie();
		//Actor a1 = new Actor();
		m.setName("Kill Bill I");
		//a1.setName("John travota");
		Actor a2= new Actor();
		a2.setName("Uma Thruman");
		
		//m.getActors().add(a1);
		m.getActors().add(a2);
		
		dao.addMovie(m);
		System.out.println("Saved");

	}

}
