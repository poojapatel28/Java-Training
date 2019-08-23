package com.visa.prj.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.visa.prj.entity.Campaign;
import com.visa.prj.entity.Donation;
import com.visa.prj.service.DonationService;

@RestController
public class CampaignController {
	@Autowired
	DonationService ds;
	
	@GetMapping("campaigns")
	public @ResponseBody List<Campaign> getAllCampaigns()
	{
		return ds.getCampaigns();
	}
	
//	@GetMapping("donations/{campaign}")
//	public @ResponseBody List<Donation> getDonationsByCampaign()
//	{
//		return ds.getDonationByCampaign(campaign);
//	}
	
	@PostMapping("campaigns")
	public ResponseEntity<Campaign> addDonation(@RequestBody Campaign d )
	{
		ds.addCampaign(d);
		return new ResponseEntity<Campaign>(d,HttpStatus.CREATED);
	}
	
	@GetMapping("campaigns/{id}")
	public @ResponseBody Campaign getDonationById(@PathVariable("id") int id)
	{
		return ds.getCampaignById(id);
	}
	
}
