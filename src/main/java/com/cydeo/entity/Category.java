package com.cydeo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Category extends BaseEntity{

    private String name;
}
