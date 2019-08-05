package com.visa.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcProductDao {
	public Product findById(int id)
	{
		Product p= null;
		//Connection c = JdbcUtil.getConnection();
		try(Connection c = JdbcUtil.getConnection()) {
			Statement st = c.createStatement();
			ResultSet rs = st.executeQuery("select * from 'Product' where product_id = "+ id);
			
			if(rs.next())
			{
				p = mapRow(rs);
				
			}
			}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return p;
	}


	private Product mapRow(ResultSet rs) throws SQLException {
		Product p;
		p = new Product();
		p.setId(rs.getInt("product_id"));
		p.setName(rs.getString("product_name"));
		p.setPrice(rs.getFloat("product_price"));
		p.setQoh(rs.getInt("product_qoh"));
		return p;
	}
	
	
	public List<Product> findAll()
	{
		List<Product> li = new ArrayList<Product>();
		
		try(Connection c = JdbcUtil.getConnection()) {
			Statement st = c.createStatement();
			ResultSet rs = st.executeQuery("select * from product");
			while(rs.next())
			{
				Product p = mapRow(rs);
				li.add(p);
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return li;
	}
	
	public Product save(Product toBeSaved)
	{
try(Connection c = JdbcUtil.getConnection()) {
			PreparedStatement pst = c.prepareStatement("insert into product(product_name,product_price,product_qoh) values(?,?,?)",Statement.RETURN_GENERATED_KEYS);
			pst.setString(1, toBeSaved.getName());
			pst.setFloat(2, toBeSaved.getPrice());
			pst.setInt(3, toBeSaved.getQoh());
			
			pst.executeUpdate();
			ResultSet keys = pst.getGeneratedKeys();
			if(keys.next())
			{
				toBeSaved.setId(keys.getInt(1));
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

return toBeSaved;
		
		
		
	}
	
	
}
