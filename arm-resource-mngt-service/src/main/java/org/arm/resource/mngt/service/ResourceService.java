package org.arm.resource.mngt.service;

import java.util.List;

import org.arm.resource.mngt.entity.Resource;
import org.arm.resource.mngt.repository.ResourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResourceService implements IResourceService{
	
	@Autowired
	private ResourceRepository repourceRepository;

	
	@Override
	public void save(Resource resource) {
		repourceRepository.save(resource);
	}

	public List<Resource> findAll() {
		return repourceRepository.findAll();
	}


}
