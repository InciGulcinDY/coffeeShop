package com.ladinProject.CoffeeShop.business.response;

import lombok.Data;

@Data
public class GetAllCoffeesByCustomerResponse {

	private int drinkUnitPrice;
	private String coffeeName;
	private boolean isWithMilk;
	private boolean isCold;
	private String brewingStyle;
	private int preperationDuration;

}
