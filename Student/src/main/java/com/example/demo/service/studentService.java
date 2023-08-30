package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repositary.studentRepositry;
@Service
public class studentService {
@Autowired
 studentRepositry studentRepo;
	public List<Student> allStudents() {
		
		return studentRepo.findAll();
	}
	public Student addStudents(Student student) {
		
		return studentRepo.save(student);
	}
	public void deleteStudent(Integer id) {
		
		 studentRepo.deleteById(id);;
	}
	public Student updateStudent(Student student,int id) {
		
		student.setId(id);
		
		return studentRepo.save(student);
	}

}
