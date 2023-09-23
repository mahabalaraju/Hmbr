package com.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerDemo1Application {
@GetMapping("/")
public String asdf() {
	return "hello , you are listening to me";
}
	public static void main(String[] args) {
		SpringApplication.run(DockerDemo1Application.class, args);
	}

}
