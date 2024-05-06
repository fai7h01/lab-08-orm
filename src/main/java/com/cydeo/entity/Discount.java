package com.cydeo.entity;

import com.cydeo.enums.DiscountType;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Data
public class Discount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private BigDecimal discount;

    @Enumerated(EnumType.STRING)
    private DiscountType discountType;

}
