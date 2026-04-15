package com.example.DiscountCouponPattern.DiscountCoupon;

import com.example.DiscountCouponPattern.product.Product;
import com.example.DiscountCouponPattern.product.ProductType;

import java.util.ArrayList;
import java.util.List;

public class TypeCouponDecorator extends  CouponDecorator {
    static List<ProductType> eligibleTypes = new ArrayList<>();
    static {
        eligibleTypes.add(ProductType.FURNITURE);
        eligibleTypes.add(ProductType.ELECTRONICS);
    }

    public TypeCouponDecorator(Product product, int percentage) {
        super(product, percentage);
    }


    @Override
    public double getPrice() {
        double price;

        if (this.product instanceof CouponDecorator) {
            price = ((CouponDecorator) this.product).getPrice();
        } else {
            price = this.product.getCost();
        }

        if (eligibleTypes.contains(this.product.getType())) {
            double priceAfterDiscount =
                    price - (price * discountPercentage) / 100.0;

            System.out.println("Applying specific product type coupon of "
                    + discountPercentage + "% on "
                    + product.getProductName()
                    + ", original price : " + price
                    + ", price after discount : " + priceAfterDiscount);

            return priceAfterDiscount;
        }

        return price;
    }
}

