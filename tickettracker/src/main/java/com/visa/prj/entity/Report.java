package com.visa.prj.entity;

public class Report {

	private int ticketId;
	private String ticketDesc;
	private Employee resolvedBy;
	private int timeTaken;
	public int getTicketId() {
		return ticketId;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	public String getTicketDesc() {
		return ticketDesc;
	}
	public void setTicketDesc(String ticketDesc) {
		this.ticketDesc = ticketDesc;
	}
	public Employee getResolvedBy() {
		return resolvedBy;
	}
	public void setResolvedBy(Employee resolvedBy) {
		this.resolvedBy = resolvedBy;
	}
	public int getTimeTaken() {
		return timeTaken;
	}
	public void setTimeTaken(int timeTaken) {
		this.timeTaken = timeTaken;
	}
}
