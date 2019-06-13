package com.sharma.nk.ecom.resources;

public class CustomerNotFoundException extends RuntimeException {

	private String message;

	CustomerNotFoundException() {
		super();
	}

	CustomerNotFoundException(String message) {
		super(message);
		this.message = message;
	}
}
