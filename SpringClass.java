package com.example.sb1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringClass {
	@GetMapping("/users")
	public String getUser() {
		return "USERNAME";
	}
}
