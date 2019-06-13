package com.sharma.nk.ecom.resources;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.sharma.nk.ecom.models.Customer;

@RestController
@RequestMapping("/customers")
public class CustomersResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomersResource.class);

    @GetMapping
    public ResponseEntity<List<Customer>> getAllCustomers() {
        LOGGER.debug("Get All Customers");
        return ResponseEntity.ok(new ArrayList<>());
    }

    @PostMapping
    public ResponseEntity<Integer> createNewCustomer(@RequestBody Customer customer) {
        LOGGER.debug("Create new customer with id");

        int customerId = customer.getCustomerId();
        return ResponseEntity.ok(customerId);
    }

}
