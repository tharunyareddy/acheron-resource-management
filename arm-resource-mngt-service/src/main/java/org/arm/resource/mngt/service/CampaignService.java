package org.arm.resource.mngt.service;

import java.util.List;

import org.arm.resource.mngt.entity.Campaign;
import org.arm.resource.mngt.repository.CampaignRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CampaignService implements ICampaignService {
@Autowired
CampaignRepository campaignRepository;

public List<Campaign> getAllCampaign() {
	campaignRepository.findAll().forEach(System.out:: println);;
	return campaignRepository.findAll();

}

}
