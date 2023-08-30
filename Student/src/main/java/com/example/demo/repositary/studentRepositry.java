package com.example.demo.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Student;

public interface studentRepositry extends JpaRepository<Student,Integer> {

}
