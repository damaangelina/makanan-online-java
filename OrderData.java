package com.restaurant.system;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderData {
    private static List<Order> orders = new ArrayList<>();

    public static void createOrder() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("| ================================================ |");
        System.out.println("| Buat Pesanan:                                    |");
        System.out.print("| Nama Pelanggan: ");
        String customerName = scanner.nextLine();

        System.out.print("| Nama Restoran: ");
        String restaurantName = scanner.nextLine();

        // Temukan restoran berdasarkan nama
        Restaurant restaurant = findRestaurantByName(restaurantName);

        if (restaurant == null) {
            System.out.println("Restoran tidak ditemukan.");
            return;
        }

        List<OrderDetail> orderDetails = new ArrayList<>();
        boolean addMoreItems = true;

        while (addMoreItems) {
            System.out.print("| ID Menu: ");
            int menuId = scanner.nextInt();
            scanner.nextLine(); // Mengonsumsi newline

            Menu menu = restaurant.findMenuById(menuId);

            if (menu == null) {
                System.out.println("Menu dengan ID " + menuId + " tidak ditemukan.");
                continue;
            }

            System.out.print("| Jumlah: ");
            int quantity = scanner.nextInt();
            scanner.nextLine(); // Mengonsumsi newline

            orderDetails.add(new OrderDetail(menu, quantity));

            System.out.print("| Tambahkan item lagi? (ya/tidak): ");
            String choice = scanner.nextLine();
            addMoreItems = choice.equalsIgnoreCase("ya");
        }

        System.out.print("| Jarak ke lokasi antar (km): ");
        double distance = scanner.nextDouble();

        Order order = new Order(customerName, restaurant, orderDetails, distance);
        orders.add(order);

        System.out.println("| ================================================ |");
        System.out.println("|              Pesanan berhasil dibuat!            |");
        System.out.println("| ================================================ |");
    }

    private static Restaurant findRestaurantByName(String name) {
        // Cari restoran dengan nama yang sesuai
        for (Restaurant restaurant : RestaurantData.getRestaurants()) {
            if (restaurant.getName().equalsIgnoreCase(name)) {
                return restaurant;
            }
        }
        return null; // Jika tidak ditemukan
    }

    public static void displayOrders() {
        if (orders.isEmpty()) {
            System.out.println("| ================================================ |");
            System.out.println("|              Tidak ada pesanan!!                 |");
            System.out.println("| ================================================ |");
        } else {
            for (Order order : orders) {
                System.out.println("| ================================================ |");
                System.out.println("| Pelanggan: " + order.getCustomerName());
                System.out.println("| Restoran: " + order.getRestaurant().getName());
                System.out.println("| Jarak ke lokasi antar: " + order.getDistance() + " km");
                System.out.println("| Total Harga: " + order.getTotalPrice());
                System.out.println("| Detail Pesanan:");
                for (OrderDetail detail : order.getOrderDetails()) {
                    System.out.println("|   Menu: " + detail.getMenu().getName() + ", Kuantitas: " + detail.getQuantity() + ", Harga: " + detail.getTotalPrice());
                }
                System.out.println("| Status: " + (order.isCompleted() ? "Selesai" : "Dalam Proses"));
                System.out.println("| ================================================ |");
            }
        }
    }
}
