package com.sba.two.dbs.repo;

import com.sba.two.dbs.entities.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product,Long> {
}
