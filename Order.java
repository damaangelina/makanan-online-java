package com.restaurant.system;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Order {
    private String customerName;
    private Restaurant restaurant;
    private List<OrderDetail> orderDetails;
    private double totalPrice;
    private double distance; // jarak ke lokasi antar

    public Order(String customerName, Restaurant restaurant, List<OrderDetail> orderDetails, double distance) {
        this.customerName = customerName;
        this.restaurant = restaurant;
        this.orderDetails = orderDetails;
        this.totalPrice = calculateTotalPrice();
        this.distance = distance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public double getDistance() {
        return distance;
    }

    private double calculateTotalPrice() {
        double total = 0;
        for (OrderDetail detail : orderDetails) {
            total += detail.getTotalPrice();
        }
        return total;
    }

    public boolean isCompleted() {
        // logika untuk mengetahui apakah pesanan sudah selesai
        return false;
    }
}
