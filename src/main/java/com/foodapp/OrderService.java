package com.foodapp;

public class OrderService {
    public String placeOrder(String item, int quantity) {
        if (item == null || item.isEmpty()) {
            return "FAILURE: Item name cannot be empty";
        }
        if (quantity <= 0) {
            return "FAILURE: Quantity must be greater than zero";
        }
        return "SUCCESS: Order placed for " + quantity + " " + item + "(s)";
    }
}