package com.Spring.Demo.Spring1Project;

import com.Spring.Demo.Spring1Project.Model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@SpringBootApplication
public class Spring1ProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring1ProjectApplication.class, args);
	}


}
