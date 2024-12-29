package com.practice.movieandproduct.controller;

import com.practice.movieandproduct.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    List<Product> products = List.of(
            new Product("Apple", 450),
            new Product("Banana", 700),
            new Product("Carrot", 300),
            new Product("Tomato", 600),
            new Product("Orange", 800),
            new Product("Cucumber", 400),
            new Product("Grapes", 1200),
            new Product("Potato", 200),
            new Product("Beef", 4500),
            new Product("Chicken", 2000),
            new Product("Pork", 3000),
            new Product("Milk", 500),
            new Product("Cheese", 1500),
            new Product("Yogurt", 800)
    );

    //   /products?from=500&to=1000  - все товары от 500 до 1000
    //   /products?from=500          - все товары от 500
    //   /products?to=1000           - все товары до 1000
    //   /products                   - все товары
    //  Сервис не нужно создавать

//    @GetMapping("/test")
//    public void test(@RequestParam List<String> names) {
//        System.out.println(names);
//    }

    @GetMapping()
    public List<Product> findAll(@RequestParam(defaultValue = "0") Integer from,
                                 @RequestParam(defaultValue = Integer.MAX_VALUE + "") Integer to) {
        return products.stream()
                .filter(product -> (from == null) || product.getPrice() >= from)
                .filter(product -> product.getPrice() <= to)
                .toList();
    }
}