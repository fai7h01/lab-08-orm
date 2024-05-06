package com.cydeo.entity;

import com.cydeo.enums.CartState;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private CartState cartState;

    @ManyToOne
    private Customer customer;

    @ManyToOne
    private Discount discount;



}
