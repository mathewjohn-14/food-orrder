package com.foodapp;

import static org.junit.Assert.*;
import org.junit.Test;

public class OrderServiceTest {
    OrderService service = new OrderService();

    @Test
    public void testSuccessfulOrder() {
        assertEquals("SUCCESS: Order placed for 2 Pizza(s)", service.placeOrder("Pizza", 2));
    }

    @Test
    public void testEmptyItemFailure() {
        assertEquals("FAILURE: Item name cannot be empty", service.placeOrder("", 1));
    }

    @Test
    public void testInvalidQuantityFailure() {
        assertEquals("FAILURE: Quantity must be greater than zero", service.placeOrder("Burger", 0));
    }
}