package com.example.orders;

import com.example.orders.Order.OrderBuilder;

public class Validation {
    public static void isNullOrEmpty(String str) {
        if (str == null || str.trim().isEmpty()) {
            throw new IllegalArgumentException("String is null or empty");
        }
    }

    public static void hasAtLeastOneLineItem(OrderBuilder order) {
        if (order.getLines().isEmpty()) {
            throw new IllegalArgumentException("Order must have at least one line item");
        }
    }

    public static void isValidEmail(String email) {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Invalid email address");
        }
    }   

    public static void isValidDiscount(Integer discountPercent) {
        if (discountPercent != null && (discountPercent < 0 || discountPercent > 100)) {
            throw new IllegalArgumentException("Discount percent must be between 0 and 100");
        }
    }


}
