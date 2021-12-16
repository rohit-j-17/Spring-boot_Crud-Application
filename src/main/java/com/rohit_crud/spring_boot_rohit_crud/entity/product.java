package com.rohit_crud.spring_boot_rohit_crud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PRODUCT")


public class product {
    @Id
    @GeneratedValue

    private int id;
    private String name;
    private int quantity;
    private double price;

}
