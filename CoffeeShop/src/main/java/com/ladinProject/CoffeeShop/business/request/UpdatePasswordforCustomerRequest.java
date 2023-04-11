package com.ladinProject.CoffeeShop.business.request;

import lombok.Data;

@Data
public class UpdatePasswordforCustomerRequest {
	private String email;
	private String firstname;
	private String lastname;
	private String password;
}
