package com.restaurant.system;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RestaurantData {
    private static List<Restaurant> restaurants = new ArrayList<>();

    public static void displayRestaurants() {
        if (restaurants.isEmpty()) {
            System.out.println("");
            System.out.println("Tidak ada restoran yang tersedia.");
        } else {
            for (Restaurant restaurant : restaurants) {
                System.out.println("");
                System.out.println("Nama: " + restaurant.getName());
                System.out.println("Alamat: " + restaurant.getAddress());
                if (restaurant.getMenus().isEmpty()) {
                    System.out.println("Tidak ada menu yang tersedia.");
                } else {
                    System.out.println("Menu:");
                    for (Menu menu : restaurant.getMenus()) {
                        System.out.println("  " + menu.getName() + " - Rp" + menu.getPrice());
                    }
                }
                System.out.println();
            }
        }
    }

    public static void addRestaurant() {
    Scanner scanner = new Scanner(System.in);
        System.out.println("");
    System.out.println("Tambah Restoran:");
    System.out.print("Nama: ");
    String name = scanner.nextLine().trim();
    if (name.isEmpty()) {
        System.out.println("Nama restoran tidak boleh kosong.");
        return;
    }

    System.out.print("Alamat: ");
    String address = scanner.nextLine().trim();
    if (address.isEmpty()) {
        System.out.println("Alamat tidak boleh kosong.");
        return;
    }

    Restaurant restaurant = new Restaurant(name, address);

    System.out.println("Tambahkan menu untuk restoran ini. Ketik 'selesai' untuk selesai.");
    while (true) {
        System.out.print("Nama Menu (atau 'selesai' untuk selesai): ");
        String menuName = scanner.nextLine().trim();
        if (menuName.equalsIgnoreCase("selesai")) {
            break;
        }

        if (menuName.isEmpty()) {
            System.out.println("Nama menu tidak boleh kosong.");
            continue;
        }

        System.out.print("Harga Menu: ");
        double menuPrice;
        try {
            menuPrice = Double.parseDouble(scanner.nextLine().trim());
            if (menuPrice <= 0) {
                System.out.println("Harga harus lebih dari nol.");
                continue;
            }
        } catch (NumberFormatException e) {
            System.out.println("Harga tidak valid. Coba lagi.");
            continue;
        }


        int menuId = restaurant.getMenus().size() + 1; // ID menu bisa berupa nomor urut dari 1
        Menu menu = new Menu(menuId, menuName, menuPrice);
        restaurant.addMenu(menu);
    }

    restaurants.add(restaurant);
    System.out.println("");
    System.out.println("Restoran berhasil ditambahkan!");
}

    public static void deleteRestaurant() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hapus Restoran:");
        System.out.print("Nama: ");
        String name = scanner.nextLine().trim();

        Restaurant toRemove = null;
        for (Restaurant restaurant : restaurants) {
            if (restaurant.getName().equalsIgnoreCase(name)) {
                toRemove = restaurant;
                break;
            }
        }

        if (toRemove != null) {
            System.out.print("Apakah Anda yakin ingin menghapus restoran \"" + name + "\"? (ya/tidak): ");
            String confirmation = scanner.nextLine().trim();
            if (confirmation.equalsIgnoreCase("ya")) {
                restaurants.remove(toRemove);
                System.out.println("Restoran berhasil dihapus!");
            } else {
                System.out.println("Penghapusan restoran dibatalkan.");
            }
        } else {
            System.out.println("Restoran tidak ditemukan!");
        }
    }

    public static List<Restaurant> getRestaurants() {
        return restaurants; // Mengembalikan daftar restoran
    }
}
