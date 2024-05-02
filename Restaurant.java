package com.restaurant.system;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private String name;
    private String address;
    private List<Menu> menus;

    public Restaurant(String name, String address) {
        this.name = name;
        this.address = address;
        this.menus = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public List<Menu> getMenus() {
        return menus;
    }

    public void addMenu(Menu menu) {
        menus.add(menu);
    }

    public Menu findMenuById(int id) {
        // Mencari menu berdasarkan ID
        for (Menu menu : menus) {
            if (menu.getId() == id) {
                return menu;
            }
        }
        return null; // Jika tidak ditemukan
    }
}
