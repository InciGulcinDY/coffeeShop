package com.ladinProject.CoffeeShop.webApiControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ladinProject.CoffeeShop.business.abstracts.CustomerService;
import com.ladinProject.CoffeeShop.business.request.CreateCustomerRequest;
import com.ladinProject.CoffeeShop.business.request.FindCustomersAdressByNameRequest;
import com.ladinProject.CoffeeShop.business.request.UpdatePasswordforCustomerRequest;
import com.ladinProject.CoffeeShop.business.response.FindCustomersAdressByNameResponse;
import com.ladinProject.CoffeeShop.business.response.GetAllCustomersResponse;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

	private CustomerService customerService;

	@Autowired
	public CustomerController(CustomerService customerService) {
		this.customerService = customerService;
	}

	@GetMapping("/getall")
	public List<GetAllCustomersResponse> getAll() {
		return customerService.getAll();
	}

	@GetMapping("/createcustomerrequest")
	public void createCustomer(CreateCustomerRequest createCustomerRequest) {
		customerService.createCustomer(createCustomerRequest);
	}

	@GetMapping("/findcustomersadressbynamerequest")
	public void findCustomersAdressByNameRequest(FindCustomersAdressByNameRequest findCustomersAdressByNameRequest,
			String firstname, String lastname) {

		findCustomersAdressByNameRequest.setFirstname(firstname);
		findCustomersAdressByNameRequest.setLastname(lastname);

		customerService.findCustomersAdressByNameRequest(findCustomersAdressByNameRequest);
	}

	@GetMapping("/findcustomersadressbynameresponse")
	public FindCustomersAdressByNameResponse findCustomersAdressByNameResponse(
			FindCustomersAdressByNameRequest findCustomersAdressByNameRequest) {

		return customerService.findCustomersAdressByNameResponse(findCustomersAdressByNameRequest);

	}

	@GetMapping("/updatecustomerpasswordrequest")
	public UpdatePasswordforCustomerRequest updatePasswordforCustomerRequest(
			UpdatePasswordforCustomerRequest updatePasswordforCustomerRequest) {

		return customerService.updatePasswordforCustomerRequest(updatePasswordforCustomerRequest);
	}

}
