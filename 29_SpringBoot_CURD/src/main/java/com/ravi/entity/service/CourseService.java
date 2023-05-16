package com.ravi.entity.service;

import java.util.List;

import com.ravi.entity.Course;

public interface CourseService {
	
	public String upsert(Course course);
	
	public Course getById(Integer cid);
	
	List<Course> getAllCourse();
	
	public String deleteById(Integer cid);
	

}
