package com.example.order.domain;


import javax.persistence.*;
import java.util.List;

@Entity
public class Order {
    @Id
    @GeneratedValue
    private Long id;

    @OneToMany(cascade = CascadeType.ALL)
    private List<OrderItem> products;

    public Order(Long id) {
        this.id = id;
    }

    public Order() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<OrderItem> getProducts() {
        return products;
    }

    public void addProduct(OrderItem product) {
        this.products.add(product);
    }
}
