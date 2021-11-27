package org.arm.resource.mngt.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	@Value("${config.message:Config Server is not working. Please check...}")
	private String msg;
	@GetMapping("/employees")
	List<Employee> all() {

		List<Employee> elist = new ArrayList<>();
		Employee e = new Employee();
	e.setName(msg);
		//e.setName("Ayan");
		elist.add(e);
		return elist;
	}
}


