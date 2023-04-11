package com.ladinProject.CoffeeShop.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ladinProject.CoffeeShop.business.abstracts.CustomerService;
import com.ladinProject.CoffeeShop.business.request.CreateCustomerRequest;
import com.ladinProject.CoffeeShop.business.request.FindCustomersAdressByNameRequest;
import com.ladinProject.CoffeeShop.business.request.UpdatePasswordforCustomerRequest;
import com.ladinProject.CoffeeShop.business.response.FindCustomersAdressByNameResponse;
import com.ladinProject.CoffeeShop.business.response.GetAllCustomersResponse;
import com.ladinProject.CoffeeShop.dataAccess.abstracts.CustomerRepository;
import com.ladinProject.CoffeeShop.entities.concretes.Customer;

@Service
public class CustomerManager implements CustomerService {

	private CustomerRepository customerRepository;

	@Autowired
	public CustomerManager(CustomerRepository customerRepository) {
		super();
		this.customerRepository = customerRepository;
	}

	@Override
	public List<GetAllCustomersResponse> getAll() {

		List<Customer> customers = customerRepository.findAll();
		List<GetAllCustomersResponse> customerResponse = new ArrayList<GetAllCustomersResponse>();

		for (Customer customer : customers) {
			GetAllCustomersResponse responseItem = new GetAllCustomersResponse();

			responseItem.setCustomerFirstname(customer.getFirstname());
			responseItem.setCustomerLastname(customer.getLastname());
			responseItem.setAdress(customer.getAdress());
			responseItem.setEmail(customer.getEmail());
			customerResponse.add(responseItem);
		}

		return customerResponse;
	}

	@Override
	public void createCustomer(CreateCustomerRequest createCustomerRequest) {
		Customer customer = new Customer();
		Random random = new Random();

		customer.setAdress(createCustomerRequest.getAdress());
		customer.setEmail(createCustomerRequest.getEmail());
		customer.setFirstname(createCustomerRequest.getFirstname());
		customer.setLastname(createCustomerRequest.getLastname());
		customer.setPassword(random.toString());
		customer.setDayOfBirth(createCustomerRequest.getDayOfBirth());

		customerRepository.save(customer);

	}

	@Override
	public void findCustomersAdressByNameRequest(FindCustomersAdressByNameRequest findCustomersAdressByNameRequest) {

	}

	@Override
	public FindCustomersAdressByNameResponse findCustomersAdressByNameResponse(
			FindCustomersAdressByNameRequest findCustomersAdressByNameRequest) {

		List<Customer> customers = customerRepository.findAll();
		FindCustomersAdressByNameResponse responseItem = new FindCustomersAdressByNameResponse();
		for (Customer customer : customers) {

			if (customer.getFirstname().equals(findCustomersAdressByNameRequest.getFirstname())
					|| customer.getLastname().equals(findCustomersAdressByNameRequest.getLastname())) {
				responseItem.setFirstname(customer.getFirstname());
				responseItem.setFirstname(customer.getLastname());
				responseItem.setAdress(customer.getAdress());
			}
		}

		return responseItem;
	}

	@Override
	public UpdatePasswordforCustomerRequest updatePasswordforCustomerRequest(
			UpdatePasswordforCustomerRequest updatePasswordforCustomerRequest) {
		
		//Business Rules for Password:
		//Write!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		
		
		List<Customer> customers = customerRepository.findAll();

		for (Customer customer : customers) {
			if (updatePasswordforCustomerRequest.getEmail().equals(customer.getEmail())
					|| (updatePasswordforCustomerRequest.getFirstname().equals(customer.getFirstname())
							&& updatePasswordforCustomerRequest.getLastname().equals(customer.getLastname()))) {
				
				customer.setPassword(updatePasswordforCustomerRequest.getPassword());

			}
		}

		return null;
	}

}
