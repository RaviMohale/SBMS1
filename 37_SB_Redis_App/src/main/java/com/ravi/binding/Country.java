package com.ravi.binding;

import java.io.Serializable;

import lombok.Data;

@Data
public class Country implements Serializable {
	private Integer srNo;
	private String name;
	private String countryCode;

}
