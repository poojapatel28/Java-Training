package com.visa.prj.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.visa.prj.entity.Employee;
import com.visa.prj.entity.Ticket;

@Repository
public class TicketDaoJpaImpl implements TicketDao {

	@PersistenceContext
	EntityManager em;
	@Override
	public void createTicket(Ticket t) { 
		em.persist(t);
	}

	@Override
	public List<Ticket> getAllTickets() {
		
		String jpql = "from Ticket t where t.resolvedDate is null";
		TypedQuery<Ticket> query = em.createQuery(jpql, Ticket.class);
		return query.getResultList();
		
	}

	@Override
	public Ticket getTicketById(int id) {
		
		return em.find(Ticket.class, id);
	}

	@Override
	public void updateTicket(Ticket t) {
		em.merge(t);

	}
	@Override
	public void addEmployee(Employee e)
	{
		em.persist(e);
	}
	@Override
	public Employee getEmployeeById(int id)
	{
		return em.find(Employee.class, id);
	}
	
	@Override
	public int getTurnAroundTime(int id)
	{
		
		return 0;
	}

}
