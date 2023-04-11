package com.ladinProject.CoffeeShop.entities.concretes;

import com.ladinProject.CoffeeShop.entities.abstracts.Person;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table (name = "shop_owner")

@Data
@NoArgsConstructor
@AllArgsConstructor

public class ShopOwner extends Person {
	@Id
	@SequenceGenerator(name = "owner_id" , sequenceName = "owner_id" , allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "owner_id")
	private int ownerId;

	private int monthlyProfit;
	private int incomeTax;

}
