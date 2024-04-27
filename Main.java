package myrestaurant;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isLoggedIn = false;

        // Database for users
        String[][] users = {{"admin", "password1"}, {"pembeli", "password2"}};

        // List to hold restaurants
        List<Restaurant> restaurantList = new ArrayList<>();

        while (!isLoggedIn) {
            System.out.println("Masukkan username:");
            String inputUsername = scanner.nextLine();
            System.out.println("Masukkan password:");
            String inputPassword = scanner.nextLine();

            for (String[] user : users) {
                if (inputUsername.equals(user[0]) && inputPassword.equals(user[1])) {
                    System.out.println("Selamat datang, " + inputUsername + "!");

                    if (inputUsername.equals("admin")) {
                        System.out.println("Anda masuk sebagai admin.");
                        isLoggedIn = true;

                        System.out.println("Ingin membuat restoran baru? (ya/tidak)");
                        String response = scanner.nextLine();
                        if (response.equalsIgnoreCase("ya")) {
                            System.out.print("Masukkan nama restoran: ");
                            String restName = scanner.nextLine();
                            System.out.print("Masukkan alamat restoran: ");
                            String restAddress = scanner.nextLine();

                            // Create new restaurant
                            Restaurant newRestaurant = new Restaurant(restName, restAddress);
                            newRestaurant.createMenu(); // Create menu for the new restaurant
                            restaurantList.add(newRestaurant);

                            System.out.println("Restoran berhasil dibuat.");
                        }

                    } else {
                        System.out.println("Anda masuk sebagai pembeli.");
                        isLoggedIn = true;

                        // Display list of restaurants for buyers
                        System.out.println("Daftar restoran:");
                        for (int i = 0; i < restaurantList.size(); i++) {
                            System.out.println((i + 1) + ". " + restaurantList.get(i).name);
                        }

                        System.out.println("Pilih nomor restoran untuk melihat menunya:");
                        int choice = scanner.nextInt();
                        if (choice > 0 && choice <= restaurantList.size()) {
                            restaurantList.get(choice - 1).display(); // Display menu of selected restaurant
                        } else {
                            System.out.println("Pilihan tidak valid.");
                        }
                    }
                    break;
                }
            }

            if (!isLoggedIn) {
                System.out.println("Username atau password salah. Silakan coba lagi.");
            }
        }

        scanner.close();
    }
}
