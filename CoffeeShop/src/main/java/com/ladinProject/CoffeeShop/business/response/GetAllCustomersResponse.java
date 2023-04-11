package com.ladinProject.CoffeeShop.business.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllCustomersResponse {

	private String customerFirstname;
	private String customerLastname;
	private String email;
	private String adress;

}
