package com.example.sb1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sb1.model.Student;

@RestController
@RequestMapping("/student")
public class SpringBootApplicationController {
	Map<String, Student> studentMap = new HashMap<>();
	
	@GetMapping("/name")
	public String getName() {
		return "VASU";
	}
	
	@GetMapping("/students")
	public Collection<Student> getStudents() {
		return studentMap.values();
	}
	
	@PostMapping("/addStudent")
	public boolean addStudent(@RequestBody Student student) {
		studentMap.put(student.getId(), student);
		return true;
	}
	
	@PutMapping("/update/{id}")
	public boolean getStudents(@PathVariable String id, @RequestBody Student student) {
		
		studentMap.put(id, student);
		return true;
	}

}
