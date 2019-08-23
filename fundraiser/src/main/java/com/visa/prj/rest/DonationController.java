package com.visa.prj.rest;

import java.util.List;

import org.hibernate.validator.constraints.pl.PESEL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.visa.prj.entity.Donation;
import com.visa.prj.service.DonationService;

@RestController
public class DonationController {

	@Autowired
	DonationService ds;
	
	@GetMapping("donations")
	public @ResponseBody List<Donation> getAllDonations()
	{
		return ds.getAllDonations();
	}
	
//	@GetMapping("donations/{campaign}")
//	public @ResponseBody List<Donation> getDonationsByCampaign()
//	{
//		return ds.getDonationByCampaign(campaign);
//	}
	
	@PostMapping("donations")
	public ResponseEntity<Donation> addDonation(@RequestBody Donation d )
	{
		ds.addDonation(d);
		return new ResponseEntity<Donation>(d,HttpStatus.CREATED);
	}
	
	@GetMapping("donations/{id}")
	public @ResponseBody Donation getDonationById(@PathVariable("id") int id)
	{
		return ds.getDonationById(id);
	}
}
