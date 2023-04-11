package com.ladinProject.CoffeeShop.webApiControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ladinProject.CoffeeShop.business.abstracts.CoffeeService;
import com.ladinProject.CoffeeShop.business.response.GetAllCoffeesByBaristaResponse;
import com.ladinProject.CoffeeShop.business.response.GetAllCoffeesByCustomerResponse;

@RestController
@RequestMapping("/api/coffee")

public class CoffeeControllers {
	private CoffeeService coffeeService;

	@Autowired
	public CoffeeControllers(CoffeeService coffeeService) {
		super();
		this.coffeeService = coffeeService;
	}
	
	@GetMapping("/getallbycustomer")
	public List<GetAllCoffeesByCustomerResponse> getAllCoffeesByCustomerResponses(){
		return coffeeService.getAllByCustomer();
	}
	
	@GetMapping("/getallbybarista")
	public List<GetAllCoffeesByBaristaResponse> getAllCoffeesByBaristaResponses(){
		return coffeeService.getAllByBarista();
	}
	
	@GetMapping("/createbybarista")
	public void CreateCoffeeByBaristaRequest(com.ladinProject.CoffeeShop.business.request.CreateCoffeeByBaristaRequest createCoffeeByBaristaRequest) {
		coffeeService.CreateCoffeeByBaristaRequest(createCoffeeByBaristaRequest);
	}
	

}
