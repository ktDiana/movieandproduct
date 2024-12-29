package com.practice.movieandproduct.model;

import lombok.Getter;

@Getter
public class Product {
    private final String name;
    private final int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

}