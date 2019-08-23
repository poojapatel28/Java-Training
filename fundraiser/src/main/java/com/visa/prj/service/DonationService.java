package com.visa.prj.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.visa.prj.dao.CampaignDao;
import com.visa.prj.dao.DonationDao;
import com.visa.prj.entity.Campaign;
import com.visa.prj.entity.Donation;

@Service
public class DonationService {

	@Autowired
	DonationDao donationDao;
	
	@Autowired
	CampaignDao campaignDao;
	
	public List<Donation> getAllDonations()
	{
		return donationDao.findAll();
	}
	
	public List<Donation> getDonationByCampaign(Campaign c)
	{
		return donationDao.findByCampaign(c);
	}
	
	@Transactional
	public int addDonation(Donation d)
	{
		Campaign c = getCampaignById(d.getCampaign().getId());
		c.setAmount(c.getAmountCollected()+d.getAmount());
		donationDao.save(d);
		return d.getId();
	}
	
	public Donation getDonationById(int id)
	{
		return donationDao.findById(id).get();
	}
	
	public Campaign getCampaignById(int id)
	{
		return campaignDao.findById(id).get();
	}
	
	public List<Campaign> getCampaigns()
	{
		return campaignDao.findAll();
	}
	
	@Transactional
	public int addCampaign(Campaign c)
	{
		campaignDao.save(c);
		return c.getId();
	}
	
	
}
