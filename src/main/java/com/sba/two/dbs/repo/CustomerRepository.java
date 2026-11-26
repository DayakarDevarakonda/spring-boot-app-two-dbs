package com.sba.two.dbs.repo;

import com.sba.two.dbs.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
