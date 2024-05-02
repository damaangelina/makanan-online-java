package com.restaurant.system;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("| ================================================ |");
            System.out.println("| Halo Selamat Datang di Aplikasi Pemesanan Online |");
            System.out.println("| ================================================ |");
            System.out.println("| Pilih Login sebagai:                             |");
            System.out.println("| 1. Admin                                         |");
            System.out.println("| 2. Pembeli                                       |");
            System.out.println("| 3. Keluar                                        |");
            System.out.println("| ================================================ |");
            System.out.print("Masukkan pilihan anda: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    AdminMenu adminMenu = new AdminMenu();
                    adminMenu.displayMenu();
                    break;
                case 2:
                    PembeliMenu pembeliMenu = new PembeliMenu();
                    pembeliMenu.displayMenu();
                    break;
                case 3:
                    System.out.println("| ================================================ |");
                    System.out.println("|           Terima kasih! Sampai jumpa.            |");
                    System.out.println("| ================================================ |");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid!! Silakan coba lagi.");
            }
        }
    }
}
