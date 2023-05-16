package com.ravi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ravi.entity.Course;

public interface CourseRepo  extends JpaRepository<Course, Integer>{

}
