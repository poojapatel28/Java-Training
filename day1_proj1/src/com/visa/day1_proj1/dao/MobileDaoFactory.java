package com.visa.day1_proj1.dao;

import java.util.ResourceBundle;

import com.visa.day1_proj1.dao.impl.MobileDaoDbImpl;

public class MobileDaoFactory {
	private static String NAME = "";
	
 static {
	 		ResourceBundle res = ResourceBundle.getBundle("database");
    		NAME = res.getString("MOBILE_CLASS").trim();
	}

	public static MobileDao getMobileDao()
	{
//		return new MobileDaoDbImpl();
		try {
			return (MobileDao) Class.forName(NAME).newInstance();		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		
		return null;
	}
}
