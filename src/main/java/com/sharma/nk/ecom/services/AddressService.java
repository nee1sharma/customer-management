package com.sharma.nk.ecom.services;

import com.sharma.nk.ecom.models.Address;

import java.util.Set;

public interface AddressService {

    int addNewAddress(int customerId, Address address);

    Set<Address> removeAllAddresses(int customerId);

    Set<Address> getAllAddresses(int customerId);

    Address getCustomerAddressById(int customerId, int addressId);

    Address updateAddress(int customerId, int addressId, Address address);

    Address removeAddressById(int customerId, int addressId);

}
