package com.ladinProject.CoffeeShop.business.abstracts;

import java.util.List;

import com.ladinProject.CoffeeShop.business.request.CreateCoffeeByBaristaRequest;
import com.ladinProject.CoffeeShop.business.response.FindCoffeesWithMilkResponse;
import com.ladinProject.CoffeeShop.business.response.FindHotCoffeesResponse;
import com.ladinProject.CoffeeShop.business.response.FindIceCoffeesResponse;
import com.ladinProject.CoffeeShop.business.response.GetAllCoffeesByBaristaResponse;
import com.ladinProject.CoffeeShop.business.response.GetAllCoffeesByCustomerResponse;



public interface CoffeeService {
	public List<GetAllCoffeesByCustomerResponse> getAllByCustomer();
	
	public List<GetAllCoffeesByBaristaResponse> getAllByBarista();
	
	public void CreateCoffeeByBaristaRequest(CreateCoffeeByBaristaRequest createCoffeeByBaristaRequest); 
	
	public List<FindCoffeesWithMilkResponse> findCoffeesWithMilk();
	
	public List<FindIceCoffeesResponse> findIceCoffeesResponses();
	
	public List<FindHotCoffeesResponse> findHotCoffeesResponses();
	
	public void ChangeCoffeeUnitPriceRequest(com.ladinProject.CoffeeShop.business.request.ChangeCoffeeUnitPriceRequest changeCoffeeUnitPriceRequest);
	

}
