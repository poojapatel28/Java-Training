package com.visa.prj.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.visa.prj.entity.Customer;
import com.visa.prj.entity.Order;

@Repository
public class OrderDaoJpaImpl implements OrderDao{

	@PersistenceContext
	private EntityManager em;

	@Override
	public void placeOrder(Order o) {
		// TODO Auto-generated method stub
		em.persist(o);
	}

	@Override
	public List<Order> getOrders(Customer c) {
		// TODO Auto-generated method stub
		if(c==null)
		{
			String jpql = "from Order";
			TypedQuery<Order> query = em.createQuery(jpql,Order.class);
			return query.getResultList();
		}
		else
		{
			String jpql = "from Order o where o.customer = :c ";
			TypedQuery<Order> query = em.createQuery(jpql,Order.class);
			query.setParameter("c", c);
			return query.getResultList();
		}
	}
	
	
	
}
