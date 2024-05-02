package com.restaurant.system;

import java.util.Scanner;

public class AdminMenu {
    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("| ================================================ |");
            System.out.println("|                      Admin Menu                  |");
            System.out.println("| ================================================ |");
            System.out.println("| 1. Lihat Restoran                                |");
            System.out.println("| 2. Tambah Restoran                               |");
            System.out.println("| 3. Hapus Restoran                                |");
            System.out.println("| 4. Kembali ke Login                              |");
            System.out.println("| ================================================ |");
            System.out.println("Masukkan Pilihan Anda: ");

            int choice = scanner.nextInt();
            System.out.println("");

            switch (choice) {
                case 1:
                    RestaurantData.displayRestaurants();
                    break;
                case 2:
                    RestaurantData.addRestaurant();
                    break;
                case 3:
                    RestaurantData.deleteRestaurant();
                    break;
                case 4:
                    return;  // Return to Login
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
