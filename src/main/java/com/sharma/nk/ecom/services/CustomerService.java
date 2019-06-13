package com.sharma.nk.ecom.services;

import java.util.List;
import java.util.Optional;

import com.sharma.nk.ecom.models.Customer;

public interface CustomerService {

	int addNewCustomer(Customer customer);
	Optional<Customer> findCustomerById(int customerId);
	List<Customer> findAllCustomers();
	
}
