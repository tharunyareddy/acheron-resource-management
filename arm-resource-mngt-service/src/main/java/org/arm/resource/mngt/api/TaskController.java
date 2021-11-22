package org.arm.resource.mngt.api;

import java.util.List;

import org.arm.resource.mngt.entity.Task;
import org.arm.resource.mngt.service.ITaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {
	@Autowired
	private ITaskService taskService;
	
	@GetMapping("/task")
	public List<Task> allT(){
		return taskService.getAllTask();
	}
}
