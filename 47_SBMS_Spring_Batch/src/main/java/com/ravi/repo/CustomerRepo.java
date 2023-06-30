package com.ravi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ravi.entity.Customer;

public interface CustomerRepo  extends JpaRepository<Customer, Integer>{

}
