package org.arm.resource.mngt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;


@EnableEurekaClient
@SpringBootApplication
public class ArmRMSApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArmRMSApplication.class, args);
	}


}
