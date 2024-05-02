package com.restaurant.system;

public class OrderDetail {
    private Menu menu;
    private int quantity;
    private double totalPrice;

    public OrderDetail(Menu menu, int quantity) {
        this.menu = menu;
        this.quantity = quantity;
        this.totalPrice = menu.getPrice() * quantity;
    }

    public Menu getMenu() {
        return menu;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
