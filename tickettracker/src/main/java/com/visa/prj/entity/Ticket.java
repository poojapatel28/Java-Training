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
@Table(name="tickets")
public class Ticket {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ticket_id")
	private int id;
	@Column(name="ticket_desc")
	private String desc;
	@Column(name="resolve_text")
	private String resolveText;
	@ManyToOne
	@JoinColumn(name="resolved_by")
	private Employee resolvedBy;
	@ManyToOne
	@JoinColumn(name="raised_by")
	private Employee raisedBy;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="raised_date")
	private Date raisedDate = new Date();
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="resolved_date")
	private Date resolvedDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getResolveText() {
		return resolveText;
	}
	public void setResolveText(String resolveText) {
		this.resolveText = resolveText;
	}
	public Employee getResolvedBy() {
		return resolvedBy;
	}
	public void setResolvedBy(Employee resolvedBy) {
		this.resolvedBy = resolvedBy;
	}
	public Employee getRaisedBy() {
		return raisedBy;
	}
	public void setRaisedBy(Employee raisedBy) {
		this.raisedBy = raisedBy;
	}
	public Date getRaisedDate() {
		return raisedDate;
	}
	public void setRaisedDate(Date raisedDate) {
		this.raisedDate = raisedDate;
	}
	public Date getResolvedDate() {
		return resolvedDate;
	}
	public void setResolvedDate(Date resolvedDate) {
		this.resolvedDate = resolvedDate;
	}
	
	

}
