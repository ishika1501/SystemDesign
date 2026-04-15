package com.example.DiscountCouponPattern.DiscountCoupon;

import com.example.DiscountCouponPattern.product.Product;

public class PercentageCouponDecorator extends CouponDecorator{

    public PercentageCouponDecorator(Product product, int discountPercentage) {
        super(product, discountPercentage);
    }

    @Override
    public double getPrice() {
        double price = this.product.getCost();   // FIXED
        double priceAfterDiscount = price - (price * discountPercentage) / 100.0;

        System.out.println("Applying percentage coupon of " + discountPercentage
                + "% on " + product.getProductName()
                + ", original price : " + price
                + ", price after discount : " + priceAfterDiscount);

        return priceAfterDiscount;
    }

}
