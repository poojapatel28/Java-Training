package com.visa.day1_proj1.entity;

import static org.junit.Assert.*;

import org.junit.Test;

public class TimeTest {

	@Test
	public void testAddTime() {
		Time t1=new Time(3,45);
		Time t2=new Time(4,30);
		Time t3=new Time(8,15);
		assertEquals(t3.getHrs(), Time.addTime(t1, t2).getHrs());
		assertEquals(t3.getMin(), Time.addTime(t1, t2).getMin());
		
	}

	@Test
	public void testAddtime() {
		Time t1=new Time(3,45);
		Time t2=new Time(4,30);
		Time t3=new Time(8,15);
		assertEquals(t3.getHrs(), t1.addtime(t2).getHrs());
		assertEquals(t3.getMin(), t1.addtime(t2).getMin());
	}

}
