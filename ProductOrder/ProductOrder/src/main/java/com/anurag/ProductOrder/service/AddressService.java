package com.anurag.ProductOrder.service;

import com.anurag.ProductOrder.model.Address;
import com.anurag.ProductOrder.repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    IAddressRepo addressRepo;

    public Iterable<Address> getAllAddress() {
        return addressRepo.findAll();
    }

    public Address getAddressbyid(Long addId) {

        Optional<Address> optional= addressRepo.findById(addId);

        if(optional.isPresent()){
            return optional.get();
        }
        return null;
    }

    public String addAddress(Address address) {
        addressRepo.save(address);
        return "Address Added";
    }
}
