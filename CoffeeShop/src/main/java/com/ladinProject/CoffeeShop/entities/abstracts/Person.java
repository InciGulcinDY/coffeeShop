package com.ladinProject.CoffeeShop.entities.abstracts;

import java.time.LocalDate;
import java.time.Period;

import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Transient;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@MappedSuperclass

@NoArgsConstructor
@NotNull

public abstract class Person {

	@Setter
	@Getter
	private String firstname;
	
	@Setter
	@Getter
	private String lastname;

	@Getter
	private String nationalId;

	@Setter
	@Getter
	private String email;

	@Setter
	@Getter
	private String adress;

	@Getter
	@Setter
	private String password;

	@Setter
	@Getter
	private LocalDate dayOfBirth;

	@Transient
	private int age;

	public Integer getAge() {

		return Period.between(dayOfBirth, LocalDate.now()).getYears();
	}

}
