package com.restaurant.system;

import java.util.Scanner;

public class PembeliMenu {
    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Pembeli Menu:");
            System.out.println("1. Lihat Restoran");
            System.out.println("2. Buat Pesanan");
            System.out.println("3. Lihat Pesanan");
            System.out.println("4. Kembali ke Login");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    RestaurantData.displayRestaurants();
                    break;
                case 2:
                    OrderData.createOrder();
                    break;
                case 3:
                    OrderData.displayOrders();
                    break;
                case 4:
                    return;  // Return to Login
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
