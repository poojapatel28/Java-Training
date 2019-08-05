package com.visa.day1_proj1.client;

import com.visa.day1_proj1.entity.Mobile;
import com.visa.day1_proj1.entity.Product;
import com.visa.day1_proj1.util.SQLUtil;

public class SQLClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String CREATE_SQL = SQLUtil.generateCreateSQL(Product.class);
		System.out.println(CREATE_SQL);
		Product p = new Product(120,"iPhone XR",78900) {
			
			@Override
			public boolean isExpensive() {
				// TODO Auto-generated method stub
				return false;
			}
		};
		
		
		String INSERT_SQL = SQLUtil.generateInsertSQL(p);
		System.out.println(INSERT_SQL);

	}

}
