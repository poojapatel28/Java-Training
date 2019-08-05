package com.visa.prj.rto;

public class RTO {
	
	private String area;
	private String rtoCode;
	public RTO(String area, String rtoCode) {
		super();
		this.area = area;
		this.rtoCode = rtoCode;
	}
	public RTO() {
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getRtoCode() {
		return rtoCode;
	}
	public void setRtoCode(String rtoCode) {
		this.rtoCode = rtoCode;
	}
	

}
