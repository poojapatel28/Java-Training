package com.visa.day1_proj1.client;

import com.visa.day1_proj1.dao.MobileDao;
import com.visa.day1_proj1.dao.MobileDaoFactory;
import com.visa.day1_proj1.dao.impl.MobileDaoDbImpl;
import com.visa.day1_proj1.entity.Mobile;

public class MobileClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile m=new Mobile();
		MobileDao mobileDao = MobileDaoFactory.getMobileDao();
		mobileDao.addMobile(m);

	}

}
