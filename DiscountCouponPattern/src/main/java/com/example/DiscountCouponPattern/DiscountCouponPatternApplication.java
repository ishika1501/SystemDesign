package com.example.DiscountCouponPattern;

import com.example.DiscountCouponPattern.product.Product;
import com.example.DiscountCouponPattern.product.ProductType;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DiscountCouponPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscountCouponPatternApplication.class, args);

		Product item1 = new Product("Fan", 1500.00, ProductType.ELECTRONICS);
		Product item2 = new Product("Office Chair", 6000.00, ProductType.FURNITURE);
		Product item3 = new Product("Omega3-Tabs", 600.00, ProductType.PHARMACY);

		ShoppingCart cart = new ShoppingCart();
		cart.addToCart(item1);
		cart.addToCart(item2);
		cart.addToCart(item3);

		System.out.println("\n===>>> Total Price after discount: " + cart.getTotalPrice());

	}

}
