package com.sharma.nk.ecom.resources;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.sharma.nk.ecom.models.Customer;
import com.sharma.nk.ecom.services.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomersResource {

	private static final Logger LOGGER = LoggerFactory.getLogger(CustomersResource.class);

	@Autowired
	private CustomerService customerService;

	@GetMapping
	public ResponseEntity<List<Customer>> getAllCustomers() {
		LOGGER.debug("Get All Customers");
        List<Customer> allCustomers = customerService.findAllCustomers();
        return ResponseEntity.ok(allCustomers);
	}

	@GetMapping("/{customerId}")
	public ResponseEntity<Customer> getCustomerById(@PathVariable("customerId") int customerId) {
		LOGGER.debug("Get customer by id {}", customerId);
		Customer customer = customerService.findCustomerById(customerId).orElseThrow(()->new RuntimeException("with id "+customerId));
		return ResponseEntity.ok(customer);
	}

	@PostMapping
	public ResponseEntity<Integer> createNewCustomer(@RequestBody Customer customer) {
		LOGGER.debug("Create new customer");
		int customerId = customerService.addNewCustomer(customer);
		return ResponseEntity.ok(customerId);
	}

}
