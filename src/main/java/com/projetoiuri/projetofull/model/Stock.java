package com.projetoiuri.projetofull.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Stock {

    @Id
    @GeneratedValue
    private Long id;
    private String product;
    private String productQ;
    private String price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getProductQ() {
        return productQ;
    }

    public void setProductQ(String productQ) {
        this.productQ = productQ;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
