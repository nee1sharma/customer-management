package com.sharma.nk.ecom.resources;


import com.sharma.nk.ecom.models.Address;
import com.sharma.nk.ecom.services.AddressService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/customers/{customerId}/addresses")
public class AddressResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(AddressResource.class);

    @Autowired
    private AddressService addressService;


    @GetMapping
    public ResponseEntity<Set<Address>> getAllAddresses(@PathVariable("customerId") int customerId) {
        LOGGER.debug("Get address of customerId {}", customerId);

        Set<Address> allAddresses = addressService.getAllAddresses(customerId);

        return ResponseEntity.ok(allAddresses);
    }

    @GetMapping("/{addressId}")
    public ResponseEntity<Address> getCustomerAddressById(@PathVariable("customerId") int customerId, @PathVariable(
            "addressId") int addressId) {
        LOGGER.debug("Get address of customerId {} by addressId {}", customerId, addressId);

        Address customerAddressById = addressService.getCustomerAddressById(customerId, addressId);

        return ResponseEntity.ok(customerAddressById);
    }

    @PostMapping
    public ResponseEntity<Integer> addNewAddress(@PathVariable("customerId") int customerId, @RequestBody Address address) {
        LOGGER.debug("Adding new address of customerId {}", customerId);

        int addressId = addressService.addNewAddress(customerId, address);

        return ResponseEntity.ok(addressId);
    }

    @PutMapping("/{addressId}")
    public ResponseEntity<Address> updateAddress(@PathVariable("customerId") int customerId,
                                                 @PathVariable("addressId") int addressId, @RequestBody Address address) {
        LOGGER.debug("Update address of customerId {} of addressId {}", customerId, addressId);

        Address previousAddress = addressService.updateAddress(customerId, addressId, address);

        return ResponseEntity.ok(previousAddress);
    }

    @DeleteMapping("/{addressId}")
    public ResponseEntity<Address> removeAddressById(@PathVariable("customerId") int customerId,
                                                     @PathVariable("addressId") int addressId) {
        LOGGER.debug("Remove one address of customerId {} by addressId {}", customerId, addressId);

        Address removedAddress = addressService.removeAddressById(customerId, addressId);

        return ResponseEntity.ok(removedAddress);
    }

    @DeleteMapping()
    public ResponseEntity<Set<Address>> removeAllAddresses(@PathVariable("customerId") int customerId) {
        LOGGER.debug("Remove all addresses of customerId {}", customerId);

        Set<Address> removedAddresses = addressService.removeAllAddresses(customerId);

        return ResponseEntity.ok(removedAddresses);
    }
}
