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
@Table(name = "tea")

public class Tea extends Drink{

	@Id
	@SequenceGenerator(name = "tea_id" , sequenceName = "tea_id" , allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "tea_id")
	private int teaId;
	
	@Getter
	@Setter
	private String teaName;
	
	@Getter
	@Setter
	private boolean isCold;
	

}
