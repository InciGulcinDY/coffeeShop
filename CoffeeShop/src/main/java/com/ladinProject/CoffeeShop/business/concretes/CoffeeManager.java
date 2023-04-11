package com.ladinProject.CoffeeShop.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ladinProject.CoffeeShop.business.abstracts.CoffeeService;
import com.ladinProject.CoffeeShop.business.response.FindCoffeesWithMilkResponse;
import com.ladinProject.CoffeeShop.business.response.FindHotCoffeesResponse;
import com.ladinProject.CoffeeShop.business.response.FindIceCoffeesResponse;
import com.ladinProject.CoffeeShop.business.response.GetAllCoffeesByBaristaResponse;
import com.ladinProject.CoffeeShop.business.response.GetAllCoffeesByCustomerResponse;
import com.ladinProject.CoffeeShop.dataAccess.abstracts.CoffeeRepository;
import com.ladinProject.CoffeeShop.entities.concretes.Coffee;

@Service

public class CoffeeManager implements CoffeeService {

	private CoffeeRepository coffeeRepository;
	
	@Autowired
	public CoffeeManager(CoffeeRepository coffeeRepository) {
		super();
		this.coffeeRepository = coffeeRepository;
	}

	@Override
	public List<GetAllCoffeesByCustomerResponse> getAllByCustomer() {

		List<Coffee> coffees = coffeeRepository.findAll();
		ArrayList<GetAllCoffeesByCustomerResponse> allCoffeesByCustomerResponse = new ArrayList<GetAllCoffeesByCustomerResponse>();

		for (Coffee coffee : coffees) {
			GetAllCoffeesByCustomerResponse responseItem = new GetAllCoffeesByCustomerResponse();
			responseItem.setBrewingStyle(coffee.getBrewingStyle());
			responseItem.setCoffeeName(coffee.getCoffeeName());
			responseItem.setCold(coffee.isCold());
			responseItem.setDrinkUnitPrice(coffee.getDrinkUnitPrice());
			responseItem.setPreperationDuration(coffee.getPreperationDuration());
			responseItem.setWithMilk(coffee.isWithMilk());
			
			allCoffeesByCustomerResponse.add(responseItem);
		}
		return allCoffeesByCustomerResponse;
	}

	@Override
	public List<GetAllCoffeesByBaristaResponse> getAllByBarista() {
		List<Coffee> coffees = coffeeRepository.findAll();
		ArrayList<GetAllCoffeesByBaristaResponse> allCoffeesByBaristaResponses = new ArrayList<GetAllCoffeesByBaristaResponse>();

		for (Coffee coffee : coffees) {
			GetAllCoffeesByBaristaResponse responseItem = new GetAllCoffeesByBaristaResponse();
			responseItem.setBrewingStyle(coffee.getBrewingStyle());
			responseItem.setCoffeeName(coffee.getCoffeeName());
			responseItem.setCold(coffee.isCold());
			responseItem.setDrinkUnitPrice(coffee.getDrinkUnitPrice());
			responseItem.setPreperationDuration(coffee.getPreperationDuration());
			responseItem.setWithMilk(coffee.isWithMilk());
			
			allCoffeesByBaristaResponses.add(responseItem);
		}

		return allCoffeesByBaristaResponses;
	}

	@Override
	public void CreateCoffeeByBaristaRequest(
			com.ladinProject.CoffeeShop.business.request.CreateCoffeeByBaristaRequest createCoffeeByBaristaRequest) {
		Coffee coffee = new Coffee();
		coffee.setBrewingStyle(createCoffeeByBaristaRequest.getBrewingStyle());
		coffee.setCoffeeName(createCoffeeByBaristaRequest.getCoffeeName());
		coffee.setCold(createCoffeeByBaristaRequest.isCold());
		coffee.setDrinkUnitPrice(createCoffeeByBaristaRequest.getDrinkUnitPrice());
		coffee.setPreperationDuration(createCoffeeByBaristaRequest.getPreperationDuration());
		coffee.setUnitOf(createCoffeeByBaristaRequest.getUnitOf());
		coffee.setWithMilk(createCoffeeByBaristaRequest.isWithMilk());

		coffeeRepository.save(coffee);

	}

	@Override
	public List<FindCoffeesWithMilkResponse> findCoffeesWithMilk() {
		List<Coffee> coffees = coffeeRepository.findAll();
		ArrayList<FindCoffeesWithMilkResponse> findCoffeesWithMilkResponses = new ArrayList<FindCoffeesWithMilkResponse>();
		
		for (Coffee coffee : coffees) {
			FindCoffeesWithMilkResponse responseItem = new FindCoffeesWithMilkResponse();
			if(coffee.isWithMilk()) {
				responseItem.setBrewingStyle(coffee.getBrewingStyle());
				responseItem.setCoffeeName(coffee.getCoffeeName());
				responseItem.setCold(coffee.isCold());
				responseItem.setDrinkUnitPrice(coffee.getDrinkUnitPrice());
				responseItem.setPreperationDuration(coffee.getPreperationDuration());
			}
			findCoffeesWithMilkResponses.add(responseItem);
		}
		
		return findCoffeesWithMilk();
	}

	@Override
	public List<FindIceCoffeesResponse> findIceCoffeesResponses() {
		List<Coffee> coffees = coffeeRepository.findAll();
		ArrayList<FindIceCoffeesResponse> findIceCoffeesResponses = new ArrayList<FindIceCoffeesResponse>();
		
		for (Coffee coffee : coffees) {
			FindIceCoffeesResponse responseItem = new FindIceCoffeesResponse();
			
			if(coffee.isCold()) {
				responseItem.setBrewingStyle(coffee.getBrewingStyle());
				responseItem.setCoffeeName(coffee.getCoffeeName());
				responseItem.setDrinkUnitPrice(coffee.getDrinkUnitPrice());
				responseItem.setPreperationDuration(coffee.getPreperationDuration());
				responseItem.setWithMilk(coffee.isWithMilk());
			}
			
			findIceCoffeesResponses.add(responseItem);
		}
		return findIceCoffeesResponses();
	}

	@Override
	public List<FindHotCoffeesResponse> findHotCoffeesResponses() {
		
		List<Coffee> coffees = coffeeRepository.findAll();
		ArrayList<FindHotCoffeesResponse> findHotCoffeesResponses = new ArrayList<FindHotCoffeesResponse>();
		
		for (Coffee coffee : coffees) {
			
			FindHotCoffeesResponse responseItem = new FindHotCoffeesResponse();
			
			if(!coffee.isCold()) {
				responseItem.setBrewingStyle(coffee.getBrewingStyle());
				responseItem.setCoffeeName(coffee.getCoffeeName());
				responseItem.setDrinkUnitPrice(coffee.getDrinkUnitPrice());
				responseItem.setPreperationDuration(coffee.getPreperationDuration());
				responseItem.setWithMilk(coffee.isWithMilk());
			}
			findHotCoffeesResponses.add(responseItem);
		}
				
		return findHotCoffeesResponses();
	}

	@Override
	public void ChangeCoffeeUnitPriceRequest(
			com.ladinProject.CoffeeShop.business.request.ChangeCoffeeUnitPriceRequest changeCoffeeUnitPriceRequest) {
		
		List<Coffee> coffees = coffeeRepository.findAll();
		Coffee coffee = new Coffee();
		
		for (Coffee coffee2 : coffees) {
			if(coffee2.getCoffeeName().equals(changeCoffeeUnitPriceRequest.getCoffeeName()) & coffee2.getBrewingStyle().equals(changeCoffeeUnitPriceRequest.getBrewingStyle())) {
				coffee2.setDrinkUnitPrice(changeCoffeeUnitPriceRequest.getCoffeeUnitPrice());
			}
		}
		coffeeRepository.save(coffee);
	}
}
