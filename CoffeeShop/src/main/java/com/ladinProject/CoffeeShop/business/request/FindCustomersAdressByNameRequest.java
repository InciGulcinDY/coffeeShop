package com.ladinProject.CoffeeShop.business.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FindCustomersAdressByNameRequest {
	private String firstname;
	private String lastname;
	private String adress;

}
