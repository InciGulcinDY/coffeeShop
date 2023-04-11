package com.ladinProject.CoffeeShop.business.abstracts;

import java.util.List;

import com.ladinProject.CoffeeShop.business.request.CreateCustomerRequest;
import com.ladinProject.CoffeeShop.business.request.FindCustomersAdressByNameRequest;
import com.ladinProject.CoffeeShop.business.request.UpdatePasswordforCustomerRequest;
import com.ladinProject.CoffeeShop.business.response.FindCustomersAdressByNameResponse;
import com.ladinProject.CoffeeShop.business.response.GetAllCustomersResponse;

public interface CustomerService {
	public List<GetAllCustomersResponse> getAll();

	public void createCustomer(CreateCustomerRequest createCustomerRequest);
	
	public void findCustomersAdressByNameRequest(FindCustomersAdressByNameRequest findCustomersAdressByNameRequest);
	
	public FindCustomersAdressByNameResponse findCustomersAdressByNameResponse(FindCustomersAdressByNameRequest findCustomersAdressByNameRequest);
	
	public UpdatePasswordforCustomerRequest updatePasswordforCustomerRequest(UpdatePasswordforCustomerRequest updatePasswordforCustomerRequest);

}
