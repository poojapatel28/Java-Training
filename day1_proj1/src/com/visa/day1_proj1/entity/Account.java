package com.visa.day1_proj1.entity;
/**
 * This is a class to represent account business data.
 * It allows to credit/debit amount
 * @author root
 * @version 1.0
 */
public class Account {
	
	private double balance; //instance variable
	/**
	 * method to credit amount into account
	 * @param amt amount to be credited
	 */
	private static int count;
	public Account()
	{
		count++;
	}
	public void deposit(double amt) //instance method
	{
		this.balance +=amt;
	}
	/**
	 * method to return the current balance in account
	 * @return the current balance
	 */
	public double getBalance()
	{
		return this.balance;
	}
	
	public static int getCount()
	{
		return count;
	}

}
