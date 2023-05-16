package com.ravi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ravi.entity.StudentEntity;

public interface StudentRepository  extends JpaRepository<StudentEntity, Integer>{

}
