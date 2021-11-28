package org.arm.resource.mngt.service;

import java.util.List;

import org.arm.resource.mngt.entity.Task;
import org.arm.resource.mngt.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService implements ITaskService {

	@Autowired
	TaskRepository taskRepository;

	@Override
	public List<Task> getAllTask() {
		List<Task> taskList= taskRepository.findAll();
		if(taskList.isEmpty())
			throw new RuntimeException("Task is not available");
		return taskList;
	}

	@Override
	public void createTasks(Task tasks) {
		taskRepository.save(tasks);
		
	}
	
	@Override
	public List<Task> getByDurationLessThan(float availableHours) {
		List<Task> taskDuration=taskRepository.findByDurationLessThan(availableHours);
		if(taskDuration.isEmpty())
			throw new RuntimeException("Duration is not available");
		return taskDuration;
	}

	@Override
	public Task getById(int id) {
		return taskRepository.findById(id).get();
	}
}
