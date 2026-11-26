package com.sba.two.dbs.service;

import com.sba.two.dbs.entities.Customer;
import com.sba.two.dbs.entities.Product;
import com.sba.two.dbs.repo.CustomerRepository;
import com.sba.two.dbs.repo.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final CustomerRepository customerRepo;
    private final ProductRepository productRepo;

    public Customer saveCustomer(Customer customer) {
        return customerRepo.save(customer);
    }

    public Product saveProduct(Product product) {
        return productRepo.save(product);
    }

    public List<Product> getProducts() {
        return productRepo.findAll();
    }

    public List<Customer> getCustomers() {
        return customerRepo.findAll();
    }

}
