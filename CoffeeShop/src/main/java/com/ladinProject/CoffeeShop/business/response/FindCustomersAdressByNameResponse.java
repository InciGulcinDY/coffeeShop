package com.ladinProject.CoffeeShop.business.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FindCustomersAdressByNameResponse {

	private String firstname;
	private String lastname;
	private String birthday;
	private String nationalId;
	private String email;
	private int birthyear;
	private String adress;
	private String password;

}
