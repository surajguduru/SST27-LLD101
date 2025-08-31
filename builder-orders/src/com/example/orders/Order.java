package com.example.orders;

import java.util.ArrayList;
import java.util.List;

/**
 * Telescoping constructors + setters. Allows invalid states.
 */
public class Order {
    private final String id;
    private final String customerEmail;
    private final List<OrderLine> lines = new ArrayList<>();
    private final Integer discountPercent; // 0..100 expected, but not enforced
    private final boolean expedited;
    private final String notes;


    public static class OrderBuilder {
        private String id;
        private String customerEmail;
        private List<OrderLine> lines = new ArrayList<>();
        private Integer discountPercent;
        private boolean expedited;
        private String notes;

        public OrderBuilder setId(String id) {
            this.id = id;
            return this;
        }

        public OrderBuilder setCustomerEmail(String customerEmail) {
            this.customerEmail = customerEmail;
            return this;
        }

        public OrderBuilder addLine(OrderLine line) {
            this.lines.add(line);
            return this;
        }

        public OrderBuilder setDiscountPercent(Integer discountPercent) {
            this.discountPercent = discountPercent;
            return this;
        }

        public OrderBuilder setExpedited(boolean expedited) {
            this.expedited = expedited;
            return this;
        }

        public OrderBuilder setNotes(String notes) {
            this.notes = notes;
            return this;
        }

        // Getters
        public String getId() { return id; }
        public String getCustomerEmail() { return customerEmail; }
        public List<OrderLine> getLines() { return lines; }
        public Integer getDiscountPercent() { return discountPercent; }
        public boolean isExpedited() { return expedited; }
        public String getNotes() { return notes; }

        public Order build() {
            // Validations
            Validation.isNullOrEmpty(id);
            Validation.isNullOrEmpty(customerEmail);
            Validation.hasAtLeastOneLineItem(this);
            Validation.isValidEmail(customerEmail);
            Validation.isValidDiscount(discountPercent);

            return new Order(this);
        }

        public OrderBuilder() {}
    }

    private Order(OrderBuilder builder) {
        this.id = builder.id;
        this.customerEmail = builder.customerEmail;
        this.lines.addAll(builder.lines); // defensive copy
        this.discountPercent = builder.discountPercent;
        this.expedited = builder.expedited;
        this.notes = builder.notes;
    }

    public String getId() { return id; }
    public String getCustomerEmail() { return customerEmail; }
    public List<OrderLine> getLines() { return new ArrayList<>(lines); }
    public Integer getDiscountPercent() { return discountPercent; }
    public boolean isExpedited() { return expedited; }
    public String getNotes() { return notes; }

    public int totalBeforeDiscount() {
        int sum = 0;
        for (OrderLine l : lines) sum += l.getQuantity() * l.getUnitPriceCents();
        return sum;
    }

    public int totalAfterDiscount() {
        int base = totalBeforeDiscount();
        if (discountPercent == null) return base;
        return base - (base * discountPercent / 100);
    }
}
