package com.visa.day1_proj1.util;

import java.util.Arrays;

public class ArrayUtil {
	
	public static int getsum(int[] elems)
	{
		int sum=0;
		for(int i=0;i<elems.length;i++)
		{
			sum+=elems[i];
		}
		return sum;
	}
	
	public static int getCount(int[] elems, int no)
	{
		int sum=0;
		for(int i=0;i<elems.length;i++)
		{
			if(elems[i]==no)
				sum++;
		}
		return sum;
	}
	
	public static void sort(int[] elems)
	{
		Arrays.sort(elems);
	}
	

}
