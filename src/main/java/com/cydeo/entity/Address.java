package com.cydeo.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String name;
    private String street;
    private String zipCode;

    @ManyToOne
    private Customer customer;

}
