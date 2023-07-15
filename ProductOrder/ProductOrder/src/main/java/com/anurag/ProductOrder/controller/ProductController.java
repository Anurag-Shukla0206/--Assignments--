package com.anurag.ProductOrder.controller;

import com.anurag.ProductOrder.model.Address;
import com.anurag.ProductOrder.model.Product;
import com.anurag.ProductOrder.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("product")
    public Iterable<Product> getAllProduct(){
        return productService.getAllProduct();
    }


    @GetMapping("productwithcategory")
    public Iterable<Product> getProductbyCategory(@RequestParam("category") String category)
    {
        return productService.getAllProductbyCategory(category);
    }

    @PostMapping("product")
    public String addProduct(@RequestBody @Valid Product product)
    {
        return productService.addProduct(product);
    }

    @DeleteMapping("product")

    public String DeleteProduct(@RequestParam("id") Long productId)
    {
        return productService.DeleteProduct(productId);
    }
}
