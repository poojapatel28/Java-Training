package com.visa.prj.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="donations")
public class Donation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="donar_name")
	private String name;
	private double amount;
	@Temporal(TemporalType.TIMESTAMP)
	private Date date= new Date();
	
	public Donation() {
		super();
	}
	public Donation(int id, String name, double amount, Date date, String status, Campaign campaign) {
		super();
		this.id = id;
		this.name = name;
		this.amount = amount;
		this.date = date;
		this.status = status;
		this.campaign = campaign;
	}
	private String status;
	@ManyToOne
	@JoinColumn(name="campaign_associated")
	private Campaign campaign;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Campaign getCampaign() {
		return campaign;
	}
	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}
	
	
	

}
