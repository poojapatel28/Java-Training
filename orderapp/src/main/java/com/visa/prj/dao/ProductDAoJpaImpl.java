package com.visa.prj.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.visa.prj.entity.Product;
@Repository
public class ProductDAoJpaImpl implements ProductDao {

	@PersistenceContext
	private EntityManager em;
	@Override
	public List<Product> getProducts() {
		
		return null;
	}

	@Override
	public Product GetProduct(int id) {
		
		return em.find(Product.class, id); //select query. May raise Data Access Exception
	}

	@Override
	public int addProduct(Product p) {
		em.persist(p);
		return p.getId(); //insert query
	}

}
