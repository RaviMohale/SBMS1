package com.ravi.config;

import org.springframework.batch.item.ItemProcessor;

import com.ravi.entity.Customer;

public class CustomerProcessor implements ItemProcessor<Customer,Customer>{

	@Override
	public Customer process(Customer item) throws Exception {
		// logic
		return item;
	}

}
