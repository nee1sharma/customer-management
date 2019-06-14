package com.sharma.nk.ecom.services;

import com.sharma.nk.ecom.models.Address;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class AddressServiceImpl implements AddressService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AddressServiceImpl.class);


    @Override
    public int addNewAddress(int customerId, Address address) {
        LOGGER.debug("Add new address of customerId {}", customerId);
        return 0;
    }

    @Override
    public Set<Address> removeAllAddresses(int customerId) {
        LOGGER.debug("Remove all addresses of customerId {}", customerId);

        return null;
    }

    @Override
    public Set<Address> getAllAddresses(int customerId) {
        LOGGER.debug("Get all addresses of customerId {}", customerId);

        return null;
    }

    @Override
    public Address getCustomerAddressById(int customerId, int addressId) {
        LOGGER.debug("Get address of customerId {} by addressId {}", customerId, addressId);

        return null;
    }

    @Override
    public Address updateAddress(int customerId, int addressId, Address address) {
        LOGGER.debug("Update address of customerId {} by addressId {}", customerId, addressId);

        return null;
    }

    @Override
    public Address removeAddressById(int customerId, int addressId) {
        LOGGER.debug("Remove address of customerId {} by addressId {}", customerId, addressId);

        return null;
    }
}
