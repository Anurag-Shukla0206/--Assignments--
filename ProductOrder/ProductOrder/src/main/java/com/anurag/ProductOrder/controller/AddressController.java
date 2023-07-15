package com.anurag.ProductOrder.controller;

import com.anurag.ProductOrder.model.Address;
import com.anurag.ProductOrder.service.AddressService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class AddressController {

    @Autowired
    AddressService addressService;

    @GetMapping("address")
    public Iterable<Address> getAllAddress() {
        return addressService.getAllAddress();
    }

    @GetMapping("addresswithid")
    public Address getAddressbyid(@RequestParam("id") Long addId) {
        return addressService.getAddressbyid(addId);
    }

    @PostMapping("address")
    public String addAddress(@RequestBody @Valid Address address) {
        return addressService.addAddress(address);
    }

}
