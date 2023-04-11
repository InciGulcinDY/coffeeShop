package com.ladinProject.CoffeeShop.entities.concretes;

import com.ladinProject.CoffeeShop.entities.abstracts.Food;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@DiscriminatorValue(value = "Pastry")

@Data
public class Pastry extends Food {
	private String pastryName;

}
