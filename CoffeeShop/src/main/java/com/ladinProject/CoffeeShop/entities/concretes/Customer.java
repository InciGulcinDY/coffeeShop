package com.ladinProject.CoffeeShop.entities.concretes;

import java.util.List;

import com.ladinProject.CoffeeShop.entities.abstracts.Drink;
import com.ladinProject.CoffeeShop.entities.abstracts.Food;
import com.ladinProject.CoffeeShop.entities.abstracts.Person;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "customers")


@NoArgsConstructor
@AllArgsConstructor

public class Customer extends Person {
	@Id
	@SequenceGenerator(name = "customer_id" , sequenceName = "customer_id" , allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "customer_id")
	private int customerId;
	
	@Getter
	@Setter
	@ManyToMany
	private List<Coffee> coffeeFavorites;
	
	@Getter
	@Setter
	@ManyToMany
	private List<Food> foodFavorites;
	
	@Getter
	@Setter
	@ManyToMany
	private List<Tea> teaFavorites;
	
	@Getter
	@Setter
	@ManyToMany
	private List<Beverage> beverageFavorites;

}
