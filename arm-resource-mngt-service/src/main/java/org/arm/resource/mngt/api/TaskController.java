package org.arm.resource.mngt.api;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.arm.resource.mngt.entity.Priority;
import org.arm.resource.mngt.entity.Resource;
import org.arm.resource.mngt.entity.Status;
import org.arm.resource.mngt.entity.Task;
import org.arm.resource.mngt.service.ITaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {
	@Autowired
	private ITaskService taskService;
	
	@GetMapping("/task")
	public List<Task> allTask(){
		return taskService.getAllTask();
	}
	
//	@GetMapping("/task/create")
//	public void createTask(){
//		Task task = new Task();
//		task.setCreateDate(new Timestamp(new Date().getTime()));
//		task.setDuration(10);
//		task.setEndDate(new Timestamp(new Date().getTime() + 15*86400 ));
//		task.setStartDate(new Timestamp(new Date().getTime()));
//		task.setIsDeleted(0);
//		task.setPriority(Priority.MEDIUM);
//		task.setStatus(Status.IN_PROGRESS);
//		task.setTaskName("Task5");
//		task.setTaskOwner("Test");
//		taskService.createTasks(task);
//	}
	
	@GetMapping("/task/availableHours/{availableHours}")
	ResponseEntity<List<Task>> findByDurationLessThan(@PathVariable("availableHours") float availableHours){
		List<Task> taskList=taskService.getByDurationLessThan(availableHours);
		HttpHeaders headers = new HttpHeaders();
		headers.add("desc", "Get Brandlist By Name");
		return ResponseEntity.ok().headers(headers).body(taskList);
	
	}
}
