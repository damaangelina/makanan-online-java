package com.restaurant.system;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RestaurantData {
    private static List<Restaurant> restaurants = new ArrayList<>();

    public static void displayRestaurants() {
        if (restaurants.isEmpty()) {
            System.out.println("Tidak ada restoran yang tersedia.");
        } else {
            for (Restaurant restaurant : restaurants) {
                System.out.println("Nama: " + restaurant.getName());
                System.out.println("Alamat: " + restaurant.getAddress());
                System.out.println("Menu:");
                for (Menu menu : restaurant.getMenus()) {
                    System.out.println("  " + menu.getName() + " - " + menu.getPrice());
                }
                System.out.println();
            }
        }
    }

    public static void addRestaurant() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tambah Restoran:");
        System.out.print("Nama: ");
        String name = scanner.nextLine();
        System.out.print("Alamat: ");
        String address = scanner.nextLine();
        Restaurant restaurant = new Restaurant(name, address);
        restaurants.add(restaurant);
        System.out.println("Restoran berhasil ditambahkan!");
    }

    public static void deleteRestaurant() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hapus Restoran:");
        System.out.print("Nama: ");
        String name = scanner.nextLine();
        Restaurant toRemove = null;

        for (Restaurant restaurant : restaurants) {
            if (restaurant.getName().equals(name)) {
                toRemove = restaurant;
                break;
            }
        }

        if (toRemove != null) {
            restaurants.remove(toRemove);
            System.out.println("Restoran berhasil dihapus!");
        } else {
            System.out.println("Restoran tidak ditemukan!");
        }
    }
}
