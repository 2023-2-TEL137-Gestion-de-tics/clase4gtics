package com.example.clase4gtics.entity;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@Table(name="Products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ProductID")
    private int id;
    @Column(nullable = false)
    private String productname;
    private int supplierid;
    private int categoryid;
    private String quantityperunit;
    private BigDecimal unitprice;
    private int unitsinstock;
    private int unitsonorder;
    private int reorderlevel;
    @Column(nullable = false)
    private boolean discontinued;

}
