package com.example.sb1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sb1.model.Student;

@RestController
@RequestMapping("/student")
public class SpringBootApplicationController {
	Map<Integer, Student> studentMap = new HashMap<>();
	
	@GetMapping
	public String getName() {
		return "VASU";
	}
	
	@PostMapping
	public int addStudent() {
		return 1;
	/*@GetMapping("/students")
	public List<Map<Integer, Student>> getStudents() {
		List<Map<Integer, Student>> studentList = new ArrayList<>();
		
		return studentList;*/
	}

}
