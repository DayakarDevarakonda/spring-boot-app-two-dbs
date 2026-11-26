package com.sba.two.dbs.controller;

import com.sba.two.dbs.entities.Customer;
import com.sba.two.dbs.entities.Product;
import com.sba.two.dbs.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @PostMapping("/customer")
    public Customer saveCustomer(@RequestBody Customer customer) {
        return productService.saveCustomer(customer);
    }

    @PostMapping("/product")
    public Product saveProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    @GetMapping("/customers")
    public List<Customer> getCustomers() {
        return productService.getCustomers();
    }

    @GetMapping("/products")
    public List<Product> getProducts() {
        return productService.getProducts();
    }
}
