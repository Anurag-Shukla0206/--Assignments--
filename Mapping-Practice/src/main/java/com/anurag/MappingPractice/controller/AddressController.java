package com.anurag.MappingPractice.controller;

import com.anurag.MappingPractice.model.Address;
import com.anurag.MappingPractice.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.web.bind.annotation.*;

@RestController
public class AddressController {

    @Autowired
    AddressService addressService;

    @GetMapping("address")
    public Iterable<Address> getAllAddress(){
        return addressService.getAllAddress();
    }


    @PostMapping("address")
    public void addAddress(@RequestBody Address address)
    {
        addressService.addAddress(address);
    }

    @PutMapping("address/update/of")
    public String updateAddress(@RequestParam("addressId") Long addressId,@RequestParam("addressState") String addressState){
        return addressService.updateAddress(addressId,addressState);
    }

    @DeleteMapping("address/delete/of")
    public String deleteAddress(@RequestParam("addressId") Long addressId){
        return addressService.deleteAddress(addressId);
    }

}
