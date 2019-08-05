package com.visa.prj.rto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class RTOClient {
	
	public static void main(String[] args)
	{
		HashMap<String, String> map = new HashMap<>();
		map.put("KA-01","Koramangala");
		map.put("KA-02","Rajajinagar");
		map.put("KA-03","Indiranagar");
		map.put("KA-04","Yeshwanthpur");
		map.put( "KA-05","Jayanagar");
		map.put("KA-50","Yelahanka");
		map.put( "KA-51","Electronics City");
		map.put("KA-52","Nelamangala");
		map.put("KA-53","K.R.Puram");
		map.put("KA-54","Nagamangala");
		map.put("KA-55","Mysore East");
		map.put("KA-56","Basavakalyan");
		map.put("KA-57","Shantinagar");
		
		ArrayList<String> l1 = new ArrayList<String>();
		l1.add("KA-55-AB-4555");
		l1.add("KA-01-EF-4444");
		l1.add("KA-04-AB-9000");
		l1.add("KA-56-200");
		l1.add("KA-50-T-3111");
	    l1.add("KA-02-AG-9243");	
		
ArrayList<String> l2 = new ArrayList<String>();
	 l2.add("KA-57-DE-111");
	 l2.add("KA-51-A-9");
	 l2.add("KA-04-500");
     l2.add("KA-02-L-41");

ArrayList<String> l3 = new ArrayList<String>();

	l3.add("KA-57-DE-111");
	 l3.add("KA-51-A-9");
	 l3.add("KA-04-500");
	 l3.add("KA-02-L-41");
	 l3.add("KA-57-AB-9011");
		
		sort(l1,map);
		sort(l2,map);
		sort(l3,map);
		
	}
	
	public static void sort(ArrayList<String> l,HashMap<String,String> map)
	{
		Map<String, String> m = new HashMap<>();
		for(String s:l)
		{
			String temp = s.substring(0, 5);
			//System.out.println(temp);
			m.put(s,map.get(temp));	
		}
		
		List<Map.Entry<String, String>> li = new LinkedList<Map.Entry<String,String>>(m.entrySet());
		
		Collections.sort(li,new Comparator<Map.Entry<String,String>>() { 
            public int compare(Map.Entry<String, String> o1,  
                    Map.Entry<String, String> o2) 
 { 
     return (o1.getValue()).compareTo(o2.getValue()); 
 } 
});
	for(Map.Entry<String, String> ele:li)
	{
		System.out.println(ele.getKey());
	}
		
		
		
		
		
	}

}
