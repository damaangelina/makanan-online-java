package com.restaurant.system;

public class Order {
    private String customerName;
    private String restaurantName;
    private String orderItem;
    private int quantity;
    private boolean completed;

    public Order(String customerName, String restaurantName, String orderItem, int quantity) {
        this.customerName = customerName;
        this.restaurantName = restaurantName;
        this.orderItem = orderItem;
        this.quantity = quantity;
        this.completed = false;  // Default status
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public String getOrderItem() {
        return orderItem;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
