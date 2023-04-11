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
@Table(name = "baristas")

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Barista extends Person {
	
	@Id
	@SequenceGenerator(name = "baristaId" , sequenceName = "baristaId" , allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "baristaId")
	private int baristaId;

	private String title;
	private int salary;
	private int tip;
	private int bonus;
	private int tax;
	private int point;
	private String shift;
	private int saleAmount;

}
