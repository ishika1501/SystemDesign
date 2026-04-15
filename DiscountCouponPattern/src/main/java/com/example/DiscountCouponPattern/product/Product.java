package com.example.DiscountCouponPattern.product;

public class Product {
    String productName;
    ProductType type;
    Double cost;

    public Product(String name, Double cost, ProductType type) {
        this.cost=cost;
        this.productName=name;
        this.type=type;
    }


    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public ProductType getType() {
        return type;
    }

    public void setType(ProductType type) {
        this.type = type;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }
}
