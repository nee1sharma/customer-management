package com.sharma.nk.ecom.services;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sharma.nk.ecom.models.Customer;
import com.sharma.nk.ecom.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	private static final Logger LOGGER = LoggerFactory.getLogger(CustomerServiceImpl.class);

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public int addNewCustomer(Customer customer) {
		LOGGER.debug("Save new customer");
		return customerRepository.save(customer).getCustomerId();
	}

	@Override
	public Optional<Customer> findCustomerById(int customerId) {
		LOGGER.debug("Find customer by id {}", customerId);
		return customerRepository.findById(customerId);
	}

	@Override
	public List<Customer> findAllCustomers() {
		LOGGER.debug("Find all customers");
		return customerRepository.findAll();
	}

}
