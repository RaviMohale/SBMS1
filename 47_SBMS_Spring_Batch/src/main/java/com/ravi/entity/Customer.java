package com.ravi.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Customer_Info")
public class Customer {
	@Id
	private Integer id;
	private String firstName;
	private String lastName;
	private String gender;
	private String company;
	private String occupation;

}
