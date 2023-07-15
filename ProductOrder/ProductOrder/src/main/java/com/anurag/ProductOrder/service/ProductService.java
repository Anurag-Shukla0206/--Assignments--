package com.anurag.ProductOrder.service;

import com.anurag.ProductOrder.model.Product;
import com.anurag.ProductOrder.repository.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    IProductRepo productRepo;
    public Iterable<Product> getAllProduct() {
        return productRepo.findAll();
    }

    public Iterable<Product> getAllProductbyCategory(String category) {

        return productRepo.getAllProductbyCategory(category);
    }

    public String addProduct(Product product) {
        productRepo.save(product );
        return "product Added";
    }

    public String DeleteProduct(Long productId) {
        if (productRepo.existsById(productId)) {
            productRepo.deleteById(productId);
            return "product deleted";
        } else {
            return "productId does not exist";
        }
    }
}
