package com.ladinProject.CoffeeShop.entities.abstracts;

import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@MappedSuperclass

@Data

@AllArgsConstructor
@NoArgsConstructor
public abstract class Drink {

	private String unitOf;
	
	private int drinkUnitPrice;
	

	

}
