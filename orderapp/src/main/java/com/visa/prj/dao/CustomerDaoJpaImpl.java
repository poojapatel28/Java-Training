package com.visa.prj.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.visa.prj.entity.Customer;
@Repository
public class CustomerDaoJpaImpl implements CustomerDao {

	@PersistenceContext
	EntityManager em;
	
	@Override
	public Customer getCustomerByEmail(String email) {
		// TODO Auto-generated method stub
		return em.find(Customer.class, email);
	}

}
