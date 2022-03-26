package com.example.demo.model;

import javax.persistence.*;


@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double price;
    @ManyToOne
    private Category categoryTag;

    public Product(String name, Category categoryTag) {
        this.name = name;
        this.categoryTag = categoryTag;
    }

    public Product() {
    }

    public Product( String name, Category categoryTag,double price) {
        this.name = name;
        this.categoryTag = categoryTag;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategoryTag() {
        return categoryTag;
    }

    public void setCategoryTag(Category categoryTag) {
        this.categoryTag = categoryTag;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

