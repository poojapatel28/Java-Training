package com.visa.prj.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.visa.prj.entity.Customer;
import com.visa.prj.entity.Product;
import com.visa.prj.service.OrderService;

@RestController
public class CustomerController {

	@Autowired
	OrderService os;
	@GetMapping("customers")
	public @ResponseBody List<Customer> getAllCustomers()
	{
		return os.getAllCustomer();
	}
	
	@GetMapping("customers/{id}")
	public @ResponseBody Customer getProductById(@PathVariable("id") String id)
	{
		return os.getByEmail(id);
	}
	
	@PostMapping("customers")
	public ResponseEntity< Customer> addProduct(@RequestBody Customer c)
	{
		os.SaveCustomer(c);
		return new ResponseEntity<>(c,HttpStatus.CREATED); //201 status code
	}
}
