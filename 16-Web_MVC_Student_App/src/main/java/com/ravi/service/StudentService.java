package com.ravi.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ravi.binding.Student;
import com.ravi.entity.StudentEntity;
import com.ravi.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository repo;
	
	public boolean saveStudent(Student student) {
		System.out.println(student);
		StudentEntity entity = new StudentEntity();
		BeanUtils.copyProperties(student, entity);
		entity.setTimings(Arrays.toString(student.getTimings()));
		System.out.println(entity);
		repo.save(entity);
		return true;
	}
	
	public List<String>getCourses(){
		return Arrays.asList("Java","Python","Oracle","C++");
	}
	
	public List<String>getTiming(){
		return Arrays.asList("Morning","Afternoon","Evening");
	}
}
