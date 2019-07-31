package com.visa.day1_proj1.entity;

public class Time {
	
	public int getHrs() {
		return hrs;
	}
	public void setHrs(int hrs) {
		this.hrs = hrs;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public Time(int hrs, int min) {
		// TODO Auto-generated constructor stub
		this.hrs=hrs;
		this.min=min;
	}
	private int hrs;
	private int min;
	
public static Time addTime(Time t1, Time t2)
{
	int m=t1.getMin()+t2.getMin();
	int h= t1.getHrs()+t2.getHrs();
	if(m>=60)
	{
		m=m-60;
		h+=1;	
	}
	Time t=new Time(h,m);
	return t;
}

public Time addtime(Time t1)
{
	int m=t1.getMin()+this.getMin();
	int h= t1.getHrs()+this.getHrs();
	if(m>=60)
	{
		m=m-60;
		h+=1;	
	}
	Time t=new Time(h,m);
	return t;
}

}
