package com.example.DiscountCouponPattern;

import com.example.DiscountCouponPattern.DiscountCoupon.CouponDecorator;
import com.example.DiscountCouponPattern.DiscountCoupon.PercentageCouponDecorator;
import com.example.DiscountCouponPattern.DiscountCoupon.TypeCouponDecorator;
import com.example.DiscountCouponPattern.product.Product;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Product> productList;
    public ShoppingCart() {
        productList = new ArrayList<>();
    }

    public void addToCart(Product product){
        Product productWithEligibleDiscount =
                new TypeCouponDecorator(new PercentageCouponDecorator(product, 20), 10);
        productList.add(productWithEligibleDiscount);
    }

    public double getTotalPrice() {
        double totalPrice = 0;

        for (Product product : productList) {
            if (product instanceof CouponDecorator) {
                totalPrice += ((CouponDecorator) product).getPrice();
            } else {
                totalPrice += product.getCost();
            }
        }

        return totalPrice;
    }

}
