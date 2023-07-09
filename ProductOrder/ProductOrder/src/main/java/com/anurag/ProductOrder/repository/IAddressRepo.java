package com.anurag.ProductOrder.repository;

import com.anurag.ProductOrder.model.Address;
import com.anurag.ProductOrder.service.AddressService;
import org.springframework.data.repository.CrudRepository;

public interface IAddressRepo extends CrudRepository<Address,Long> {

}
