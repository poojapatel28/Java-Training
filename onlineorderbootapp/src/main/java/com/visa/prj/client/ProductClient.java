package com.visa.prj.client;

import java.util.Arrays;
import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.visa.prj.entity.Product;

public class ProductClient {

	public static void main(String[] args) {

		String uri = "http://localhost:8080/products";
		RestTemplate template = new RestTemplate();  //template  to make rest calls
		getProductJson(template,uri);
		getProductList(template,uri);
		addProduct(template, uri);
	}

	private static void addProduct(RestTemplate template, String uri) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		Product p = new Product(0,"Adidas","shoes",12000,1000);
		
		ResponseEntity<Product> responseEntity  = template.postForEntity(uri, p, Product.class);
		System.out.println(responseEntity.getStatusCode());
		System.out.println("Product saved: "+ responseEntity.getBody().getId());
		
	}

	private static void getProductList(RestTemplate template, String uri) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

		ResponseEntity<List<Product>> response = template.exchange(uri, HttpMethod.GET, null, new ParameterizedTypeReference<List<Product>>() {});
		
		System.out.println(response.getStatusCode());
		List<Product> prods = response.getBody();
		for(Product p:prods)
		{
			System.out.println(p.getName()+","+p.getPrice());
		}
		
	}

	private static void getProductJson(RestTemplate template, String uri) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		
		String productJson = template.getForObject(uri, String.class);
		System.out.println(productJson);
		
		
	}

}
