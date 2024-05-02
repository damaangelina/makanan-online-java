package com.restaurant.system;

import java.util.Scanner;

public class Main {
    private static final String ADMIN_PASSWORD = "admin123"; // Kata sandi admin
    private static final String PEMBELI_PASSWORD = "pembeli123"; // Kata sandi pembeli

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
            scanner.nextLine(); // Mengonsumsi newline

            switch (choice) {
                case 1:
                    if (validatePassword(scanner, "admin")) {
                        AdminMenu adminMenu = new AdminMenu();
                        adminMenu.displayMenu();
                    } else {
                        System.out.println("Kata sandi salah! Akses ditolak.");
                    }
                    break;
                case 2:
                    if (validatePassword(scanner, "pembeli")) {
                        PembeliMenu pembeliMenu = new PembeliMenu();
                        pembeliMenu.displayMenu();
                    } else {
                        System.out.println("Kata sandi salah! Akses ditolak.");
                    }
                    break;
                case 3:
                    System.out.println("| ================================================ |");
                    System.out.println("|           Terima kasih! Sampai jumpa.            |");
                    System.out.println("| ================================================ |");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid! Silakan coba lagi.");
            }
        }
    }

    // Metode untuk memvalidasi kata sandi berdasarkan tipe pengguna
    private static boolean validatePassword(Scanner scanner, String userType) {
        System.out.print("Masukkan kata sandi untuk " + userType + ": ");
        String password = scanner.nextLine();

        if (userType.equals("admin")) {
            return password.equals(ADMIN_PASSWORD);
        } else if (userType.equals("pembeli")) {
            return password.equals(PEMBELI_PASSWORD);
        }

        return false;
    }
}
