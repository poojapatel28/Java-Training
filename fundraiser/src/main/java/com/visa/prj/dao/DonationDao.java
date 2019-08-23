package com.visa.prj.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.visa.prj.entity.Campaign;
import com.visa.prj.entity.Donation;

public interface DonationDao extends JpaRepository<Donation, Integer> {

	public List<Donation> findByCampaign(Campaign c);
	
}
