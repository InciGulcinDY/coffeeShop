package com.ladinProject.CoffeeShop.business.response;

import lombok.Data;

@Data
public class FindCoffeesWithMilkResponse {
	private int drinkUnitPrice;
	private String coffeeName;
	private boolean isCold;
	private String brewingStyle;
	private int preperationDuration;
}
