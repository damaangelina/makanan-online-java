package com.restaurant.system;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderData {
    private static List<Order> orders = new ArrayList<>();

    public static void createOrder() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Buat Pesanan:");
        System.out.print("Nama Pelanggan: ");
        String customerName = scanner.nextLine();

        System.out.print("Nama Restoran: ");
        String restaurantName = scanner.nextLine();

        System.out.print("Item Pesanan: ");
        String orderItem = scanner.nextLine();

        System.out.print("Jumlah: ");
        int quantity = scanner.nextInt();

        Order order = new Order(customerName, restaurantName, orderItem, quantity);
        orders.add(order);

        System.out.println("Pesanan berhasil dibuat!");
    }

    public static void displayOrders() {
        if (orders.isEmpty()) {
            System.out.println("Tidak ada pesanan.");
        } else {
            for (Order order : orders) {
                System.out.println("Pelanggan: " + order.getCustomerName());
                System.out.println("Restoran: " + order.getRestaurantName());
                System.out.println("Item: " + order.getOrderItem());
                System.out.println("Jumlah: " + order.getQuantity());
                System.out.println("Status: " + (order.isCompleted() ? "Selesai" : "Dalam Proses"));
                System.out.println();
            }
        }
    }
}
