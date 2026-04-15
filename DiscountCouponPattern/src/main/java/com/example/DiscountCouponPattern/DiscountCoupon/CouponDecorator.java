package com.example.DiscountCouponPattern.DiscountCoupon;

import com.example.DiscountCouponPattern.product.Product;

public abstract class CouponDecorator extends Product {
    Product product;
    int discountPercentage;

    public CouponDecorator(Product product, int discountPercentage) {
        super(product.getProductName(), product.getCost(), product.getType());
        this.product = product;
        this.discountPercentage = discountPercentage;
    }

    public abstract double getPrice();
}
