package com.ladinProject.CoffeeShop.entities.concretes;

import com.ladinProject.CoffeeShop.entities.abstracts.Drink;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "coffees")

@AllArgsConstructor
@NoArgsConstructor
public class Coffee extends Drink {

	@Id
	@SequenceGenerator(name = "coffee_id" , sequenceName = "coffee_id" , allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "coffee_id")
	@Getter
	private int coffeeId;
	
	@Getter
	@Setter
	private String coffeeName;
	
	@Getter
	@Setter
	private boolean isWithMilk;
	
	@Getter
	@Setter
	private boolean isCold;
	
	@Getter
	@Setter
	private String brewingStyle;
	
	@Getter
	@Setter
	private int preperationDuration;
	
}
