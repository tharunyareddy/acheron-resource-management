package org.arm.resource.mngt.service;

import java.util.List;

import org.arm.resource.mngt.entity.Resource;
import org.arm.resource.mngt.repository.ResourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResourceService implements IResourceService {

	@Autowired
	private ResourceRepository resourceRepository;

	@Override
	public void save(Resource resource) {
		resourceRepository.save(resource);
	}

	public List<Resource> findAll() {
		List<Resource> resourceList = resourceRepository.findAll();
		if (resourceList.isEmpty())
			throw new RuntimeException("Resource Not Available.. ");
		return resourceList;
	}

	@Override
	public List<Resource> findResourceWithoutTaskAssigned() {

		List<Resource> allResource = resourceRepository.getResourceWithoutTaskAssigned();
		if (allResource.isEmpty())
			throw new RuntimeException("no resource Available.. ");
		return allResource;
	}

	@Override
	public Resource getById(int id) {
		return resourceRepository.findById(id).get();
	}
}
