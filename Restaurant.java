package myrestaurant;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Restaurant {
    String name;
    String address;
    Menu menu;

    // Constructor
    public Restaurant(String name, String address) {
        this.name = name;
        this.address = address;
        this.menu = new Menu();
    }

    // Method to create menu
    public void createMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of food items: ");
        int numFoodItems = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < numFoodItems; i++) {
            System.out.print("Enter name of food item " + (i + 1) + ": ");
            String name = scanner.nextLine();
            System.out.print("Enter price of food item " + (i + 1) + ": ");
            double price = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
            menu.addFoodItem(new FoodItem(name, price));
        }

        System.out.print("Enter number of drinks: ");
        int numDrinks = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < numDrinks; i++) {
            System.out.print("Enter name of drink " + (i + 1) + ": ");
            String name = scanner.nextLine();
            System.out.print("Enter price of drink " + (i + 1) + ": ");
            double price = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
            menu.addDrink(new Drink(name, price));
        }
    }

    public void display() {
        System.out.println("Restaurant Name: " + name);
        System.out.println("Restaurant Address: " + address);
        System.out.println("Menu:");
        System.out.println("Food Items:");
        for (FoodItem item : menu.foodItems) {
            System.out.println("- " + item.name + ": $" + item.price);
        }
        System.out.println("Drinks:");
        for (Drink item : menu.drinks) {
            System.out.println("- " + item.name + ": $" + item.price);
        }
    }

    // Inner class: Menu
    class Menu {
        List<FoodItem> foodItems = new ArrayList<>();
        List<Drink> drinks = new ArrayList<>();

        public void addFoodItem(FoodItem foodItem) {
            foodItems.add(foodItem);
        }

        public void addDrink(Drink drink) {
            drinks.add(drink);
        }
    }

    // Inner class: FoodItem
    class FoodItem {
        String name;
        double price;

        public FoodItem(String name, double price) {
            this.name = name;
            this.price = price;
        }
    }

    // Inner class: Drink
    class Drink {
        String name;
        double price;

        public Drink(String name, double price) {
            this.name = name;
            this.price = price;
        }
    }
}
