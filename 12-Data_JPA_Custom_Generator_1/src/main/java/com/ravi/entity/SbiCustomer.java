package com.ravi.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name ="Sbi_customer")
@Data
public class SbiCustomer {
	@Id
	private String customerId;
	private String customerName;
	private String customerCity;

}
