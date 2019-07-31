package com.visa.day1_proj1.client;

import com.visa.day1_proj1.entity.Time;

public class TimeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Time t1 = new Time(4,30);
		Time t2 = new Time(3,45);

		Time t3 = Time.addTime(t1,t2);
		
		System.out.println(t3.getHrs()+":"+t3.getMin());
		Time t4 = t1.addtime(t2);
		System.out.println(t3.getHrs()+":"+t3.getMin());
		

	}

}
