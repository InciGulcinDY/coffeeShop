package com.ladinProject.CoffeeShop.business.request;

import lombok.Data;

@Data
public class CreateCoffeeByBaristaRequest {

	private String unitOf;
	private int drinkUnitPrice;
	private String coffeeName;
	private boolean isWithMilk;
	private boolean isCold;
	private String brewingStyle;
	private int preperationDuration;
}
