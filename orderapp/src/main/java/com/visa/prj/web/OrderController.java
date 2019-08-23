package com.visa.prj.web;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.visa.prj.entity.Item;
import com.visa.prj.entity.Order;
import com.visa.prj.entity.Product;
import com.visa.prj.service.OrderService;

@Controller
public class OrderController {
	
	
	@Autowired
	OrderService os;
	
	@RequestMapping("cart.do")
	public String addToCart(HttpServletRequest req)
	{
		List<Item> items = new ArrayList<>();
		items = os.createItem(req.getParameterValues("prds"));
		Order o= new Order();
		o.setItems(items);
		o.setOrderDate(new Date());
		HttpSession ses = req.getSession(false);
		o.setCustomer(os.getCustomerById(ses.getAttribute("user").toString()));
		os.placeOrder(o);
		
		return "index.jsp";
	}

}
