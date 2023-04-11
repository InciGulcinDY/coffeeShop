package com.ladinProject.CoffeeShop.entities.concretes;

import com.ladinProject.CoffeeShop.entities.abstracts.Drink;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "beverages")

public class Beverage extends Drink {

	@Id
	@SequenceGenerator(name = "beverage_id" , sequenceName = "beverage_id" , allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "beverage_id")
	private int beverageId;
	
	@Getter
	@Setter
	private String beverageName;
	

}
