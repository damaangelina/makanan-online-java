package com.restaurant.system;

public class Menu {
    private int id; // ID unik untuk setiap menu
    private String name;
    private double price;

    public Menu(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
