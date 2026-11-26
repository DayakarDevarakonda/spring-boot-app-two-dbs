package com.sba.two.dbs.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="tbl_customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

}
