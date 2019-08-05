package com.visa.day1_proj1.util;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

import com.visa.day1_proj1.annotation.Column;
import com.visa.day1_proj1.annotation.Table;

public class SQLUtil {
	
	public static String generateCreateSQL(Class<?> clazz) {
		StringBuilder builder = new StringBuilder();
		Table t = clazz.getAnnotation(Table.class);
		if(t != null) {
			builder.append("create table");
			builder.append(" ");
			builder.append(t.name());
			builder.append("(");
			
			Method[] methods = clazz.getDeclaredMethods(); // methods in class but not inherited
			for(Method m :methods) {
				if(m.getName().startsWith("get")) {
					Column c = m.getAnnotation(Column.class);
					if(c != null) {
						builder.append(c.name());
						builder.append(" ");
						builder.append(c.type());
						builder.append(", ");
						
					}
				}
			}
			
		}
		// create table products (prd_id NUMERIC(12), prd_name VARCHAR(150),
		
		builder.setCharAt(builder.lastIndexOf(",") , (')'));
		return builder.toString();
	}
	
	// insert into products values(120, 'iPhone XR');
	// insert into emp values(3,'Smith');
	public static String generateInsertSQL(Object obj) {
		StringBuilder builder = new StringBuilder();
		Table t = obj.getClass().getAnnotation(Table.class);
		System.out.println(t);
		if(t != null) {
			builder.append("insert into");
			builder.append(" ");
			builder.append(t.name());
			builder.append(" values");
			builder.append("(");
			
			System.out.println(builder.toString());
			
			
			Method[] methods = obj.getClass().getDeclaredMethods(); // methods in class but not inherited
			for(Method m :methods) {
				if(m.getName().startsWith("get")) {
					Column c = m.getAnnotation(Column.class);
					if(c != null) {
						try {
							
							builder.append(m.invoke(obj));
						} catch (IllegalAccessException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (IllegalArgumentException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (InvocationTargetException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
//						builder.append(" ");
//						builder.append(c.type());
						builder.append(", ");
						
					}
				}
			}
		
		
	
	
	}
		return builder.toString();
	}
}
	
	
	
	

