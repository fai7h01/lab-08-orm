package com.cydeo.entity;

import com.cydeo.enums.PaymentMethod;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Data
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal paidPrice;

    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;


}
