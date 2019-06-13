package com.sharma.nk.ecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sharma.nk.ecom.models.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
