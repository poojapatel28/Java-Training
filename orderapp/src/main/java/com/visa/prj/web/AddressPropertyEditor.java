package com.visa.prj.web;

import java.beans.PropertyEditorSupport;

import com.visa.prj.entity.Address;

public class AddressPropertyEditor extends PropertyEditorSupport {
	
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		String[] str = text.split(",");
		Address addr = new Address(Integer.parseInt(str[0]), str[1], str[2], str[3]);
		setValue(addr); //assign it to @RequestParam/@ModelAttribute binding. 
	}
	
	@Override
	public String getAsText() {
		Address a =(Address) getValue();
		return a.toString();
	 }

}
