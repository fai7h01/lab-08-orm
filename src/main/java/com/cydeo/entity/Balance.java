package com.cydeo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Data
public class Balance extends BaseEntity{

    private BigDecimal amount;
    @OneToOne
    private Customer customer;

}
