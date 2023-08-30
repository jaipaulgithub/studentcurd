package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.studentService;

@RestController
public class studentController {

	@Autowired
	
	private studentService studentSer;
	@RequestMapping("/getAll")
	public List<Student> getallStudents(){
		
		
		return studentSer.allStudents();
	}
	@RequestMapping("/add")
	public Student addStudent(@RequestBody Student student) {
		
	
		return studentSer.addStudents(student);
	}
	@RequestMapping("/delete/{id}")
	public void deleteById(@PathVariable Integer id) {
		
		
		 studentSer.deleteStudent(id);
		
	}
	@RequestMapping("update/{id}")
	public Student update(@RequestBody Student student,@PathVariable int id) {
		
		return studentSer.updateStudent(student,id);
		
	}
}
