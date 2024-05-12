package com.cydeo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class CartItem extends BaseEntity{

    private Integer quantity;

    @ManyToOne
    private Cart cart;

    @ManyToOne
    private Product product;



}
