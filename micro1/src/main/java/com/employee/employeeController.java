package com.employee;

import java.util.Arrays;
import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class employeeController {
@GetMapping("/")
public ResponseEntity<model> getall() {
	List<model> getall= Arrays.asList(new model(1,"mahabalaraju", 29000,"java devoloper"),
			new model(2,"mahabalaraju", 29000,"java devoloper"));
return new ResponseEntity(getall,HttpStatus.OK);
}
}
