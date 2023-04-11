package com.ladinProject.CoffeeShop.entities.abstracts;

import com.ladinProject.CoffeeShop.entities.concretes.Customer;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "FoodType")
@Table(name = "foods")
public abstract class Food {
	@Id
	@SequenceGenerator(name = "food=id" , sequenceName = "food_id" , allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "food_id")
	private int foodId;

	@Getter
	@Setter
	private String unitOf;

	@Getter
	@Setter
	private int foodUnitPrice;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Customer customer;

}
