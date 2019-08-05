package com.visa.prj.triplet;

import java.util.ArrayList;
import java.util.List;

public class TripletClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {2,3,4,5,7};
		
		List<ArrayList<Integer>> res = new ArrayList<>();
		
		int left=0;
		int right=array.length-1;
		
		for(int i=array.length-1;i>=0;i--)
		{
			right=i-1;
			left=0;
			while(left<right)
			{
				if(array[left]+array[right]==array[i])
				{
					ArrayList<Integer> arr = new ArrayList<>();
					arr.add(array[left]);
					arr.add(array[right]);
					arr.add(array[i]);
					res.add(arr);
					left++;
					right--;
				}
				else if(array[left]+array[right]>array[i])
				{
					right--;
				}
				else
				{
					left++;
				}
			}
		}
		
		for(List i : res)
		{
			System.out.println(i);
		}
		
	}

}
