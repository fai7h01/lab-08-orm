package com.cydeo.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Address extends BaseEntity{

    private String name;
    private String street;
    private String zipCode;
    @ManyToOne
    private Customer customer;

}
