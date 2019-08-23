package com.visa.prj.dao;

import java.util.List;

import com.visa.prj.entity.Employee;
import com.visa.prj.entity.Ticket;

public interface TicketDao {

	void createTicket(Ticket t);
	List<Ticket> getAllTickets();
	Ticket getTicketById(int id);
	void updateTicket(Ticket t);
	void addEmployee(Employee e);
	public Employee getEmployeeById(int id);
	int getTurnAroundTime(int id);
}
