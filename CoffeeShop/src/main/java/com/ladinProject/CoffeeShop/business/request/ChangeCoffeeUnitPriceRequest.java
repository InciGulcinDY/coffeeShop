package com.ladinProject.CoffeeShop.business.request;

import lombok.Data;

@Data
public class ChangeCoffeeUnitPriceRequest {
	private int coffeeUnitPrice;
	
	private String coffeeName;

	private boolean isWithMilk;

	private boolean isCold;

	private String brewingStyle;
}
