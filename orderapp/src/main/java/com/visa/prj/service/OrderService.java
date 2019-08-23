package com.visa.prj.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.visa.prj.dao.CustomerDao;
import com.visa.prj.dao.OrderDao;
import com.visa.prj.dao.ProductDao;
import com.visa.prj.entity.Customer;
import com.visa.prj.entity.Item;
import com.visa.prj.entity.Order;
import com.visa.prj.entity.Product;

@Service
public class OrderService {
@Autowired
private ProductDao productDao;
@Autowired
private CustomerDao customerDao;
@Autowired
private OrderDao orderDao;
@Transactional
public int insertProduct(Product p)
{
	return productDao.addProduct(p);
}

public List<Product> fetchProducts()
{
	return productDao.getProducts();
}

public Product getById(int id)
{
	return productDao.GetProduct(id);
}

@Transactional
public void placeOrder(Order o)
{
	orderDao.placeOrder(o);
	double total = 0.0;
	List<Item> items = o.getItems();
	for(Item i:items)
	{
		total+=i.getAmount();
		Product p = getById(i.getProduct().getId());
		p.setCount(p.getCount()-i.getQty());
		
	}
	
	o.setTotal(total);
}

public List<Order> getOrders(Customer c)
{
	return orderDao.getOrders(c);
}

public Customer getCustomerById(String email)
{
	return customerDao.getCustomerByEmail(email);
}

@Transactional
public List<Item> createItem(String[] prds)
{List<Item> items = new ArrayList<>();
int total=0;
	for (String string : prds) {
		Product p = getById(Integer.parseInt(string));
		Item i= new Item();
		i.setProduct(p);
		i.setQty(1);
		i.setAmount(p.getPrice()*i.getQty());
		total+=i.getAmount();
		items.add(i);
	}
	return items;
}

}


