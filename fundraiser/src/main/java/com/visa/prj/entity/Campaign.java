package com.visa.prj.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="campaigns")
public class Campaign {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String title;
	private String description;
	@JsonFormat(pattern="dd-MM-yyyy")
	private Date deadline;
	public Campaign() {
		
	}
	public Campaign(int id, String title, String description, Date deadline, double amount, String status,
			double amountCollected) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.deadline = deadline;
		this.amount = amount;
		this.status = status;
		this.amountCollected = amountCollected;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String desc) {
		this.description = desc;
	}
	public Date getDeadline() {
		return deadline;
	}
	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getAmountCollected() {
		return amountCollected;
	}
	public void setAmountCollected(double amountCollected) {
		this.amountCollected = amountCollected;
	}
	private double amount;
	private String status;
	@Column(name="amount_collected")
	private double amountCollected;
	
	
	
}
