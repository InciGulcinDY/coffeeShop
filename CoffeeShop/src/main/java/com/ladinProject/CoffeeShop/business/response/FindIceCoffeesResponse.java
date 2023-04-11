package com.ladinProject.CoffeeShop.business.response;

import lombok.Data;

@Data


public class FindIceCoffeesResponse {

	private int drinkUnitPrice;
	private String coffeeName;
	private boolean isWithMilk;
	private String brewingStyle;
	private int preperationDuration;

}
