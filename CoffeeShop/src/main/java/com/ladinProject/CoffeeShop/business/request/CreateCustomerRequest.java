package com.ladinProject.CoffeeShop.business.request;

import java.time.LocalDate;

import lombok.Data;

@Data

public class CreateCustomerRequest {
	private String firstname;
	private String lastname;
	private String birthday;
	private String nationalId;
	private String email;
	private String adress;
	private String password;
	private LocalDate dayOfBirth;

}
