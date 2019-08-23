package com.visa.prj.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.visa.prj.dao.TicketDao;
import com.visa.prj.entity.Employee;
import com.visa.prj.entity.Ticket;

@Service
public class TicketService {
	
	@Autowired
	private TicketDao ticketDao;
	
	public List<Ticket> getAllOpenTickets()
	{
		return ticketDao.getAllTickets();
	}
	@Transactional
	public void raiseTicket(Ticket t)
	{
		ticketDao.createTicket(t);
	}
	
	public Ticket getTicketById(int id)
	{
		return ticketDao.getTicketById(id);
	}
	@Transactional
	public void updateTicket(Ticket t)
	{
		ticketDao.updateTicket(t);
	}
	
	@Transactional
	public void insertEmployee(Employee e)
	{
		ticketDao.addEmployee(e);
	}
	
	public Employee getEmpById(int id)
	{
		return ticketDao.getEmployeeById(id);
	}
	
	

}
