package com.tns.fooddeliverysystem.application;

import com.tns.fooddeliverysystem.entities.*;
import com.tns.fooddeliverysystem.services.*;

import java.util.List;
import java.util.Scanner;

public class FoodDeliverySystem {
    // Initialize services for customers, food items, and orders
    private static CustomerService customerService = new CustomerService();
    private static FoodService foodService = new FoodService();
    private static OrderService orderService = new OrderService();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Main loop to select between Admin and Customer menus
        while (true) {
            System.out.println("1. Admin Menu");
            System.out.println("2. Customer Menu");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    adminMenu(); // Access admin options
                    break;
                case 2:
                    customerMenu(); // Access customer options
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return; // Exit the application
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    // Admin menu options
    private static void adminMenu() {
        while (true) {
            System.out.println("Admin Menu:");
            System.out.println("1. Add Restaurant");
            System.out.println("2. Add Food Item to Restaurant");
            System.out.println("3. Remove Food Item from Restaurant");
            System.out.println("4. View Restaurants and Menus");
            System.out.println("5. View Orders");
            System.out.println("6. Add Delivery Person");
            System.out.println("7. Assign Delivery Person to Order");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    addRestaurant();
                    break;
                case 2:
                    addFoodItemToRestaurant();
                    break;
                case 3:
                    removeFoodItemFromRestaurant();
                    break;
                case 4:
                    viewRestaurantsAndMenus();
                    break;
                case 5:
                    viewOrders();
                    break;
                case 6:
                    addDeliveryPerson();
                    break;
                case 7:
                    assignDeliveryPersonToOrder();
                    break;
                case 8:
                    System.out.println("Exiting Admin Module");
                    return; // Exit to main menu
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    // Customer menu options
    private static void customerMenu() {
        while (true) {
            System.out.println("Customer Menu:");
            System.out.println("1. Add Customer");
            System.out.println("2. View Food Items");
            System.out.println("3. Add Food to Cart");
            System.out.println("4. View Cart");
            System.out.println("5. Place Order");
            System.out.println("6. View Orders");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    addCustomer();
                    break;
                case 2:
                    viewFoodItems();
                    break;
                case 3:
                    addFoodToCart();
                    break;
                case 4:
                    viewCart();
                    break;
                case 5:
                    placeOrder();
                    break;
                case 6:
                    viewOrders();
                    break;
                case 7:
                    System.out.println("Exiting Customer Module");
                    return; // Exit to main menu
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    // Add a new restaurant
    private static void addRestaurant() {
        System.out.print("Enter Restaurant ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.print("Enter Restaurant Name: ");
        String name = scanner.nextLine();
        Restaurant restaurant = new Restaurant(id, name);
        foodService.addRestaurant(restaurant);
        System.out.println("Restaurant added successfully!");
    }

    // Add a new food item to a restaurant's menu
    private static void addFoodItemToRestaurant() {
        System.out.print("Enter Restaurant ID: ");
        int restaurantId = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.print("Enter Food Item ID: ");
        int foodItemId = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.print("Enter Food Item Name: ");
        String foodItemName = scanner.nextLine();
        System.out.print("Enter Food Item Price: ");
        double foodItemPrice = scanner.nextDouble();
        FoodItem foodItem = new FoodItem(foodItemId, foodItemName, foodItemPrice);
        foodService.addFoodItemToRestaurant(restaurantId, foodItem);
    }

    // Remove a food item from a restaurant's menu
    private static void removeFoodItemFromRestaurant() {
        System.out.print("Enter Restaurant ID: ");
        int restaurantId = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.print("Enter Food Item ID: ");
        int foodItemId = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        foodService.removeFoodItemFromRestaurant(restaurantId, foodItemId);
    }

    // Display all restaurants and their menus
    private static void viewRestaurantsAndMenus() {
        System.out.println("Restaurants and Menus:");
        List<Restaurant> restaurants = foodService.getAllRestaurants();
        for (Restaurant restaurant : restaurants) {
            System.out.println(restaurant);
        }
    }

    // Display all orders
    private static void viewOrders() {
        System.out.println("Orders:");
        List<Order> orders = orderService.getAllOrders();
        for (Order order : orders) {
            System.out.println(order);
        }
    }

    // Add a new delivery person
    private static void addDeliveryPerson() {
        System.out.print("Enter Delivery Person ID: ");
        int deliveryPersonId = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.print("Enter Delivery Person Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Contact No.: ");
        long contactNo = scanner.nextLong();
        DeliveryPerson deliveryPerson = new DeliveryPerson(deliveryPersonId, name, contactNo);
        orderService.addDeliveryPerson(deliveryPerson);
        System.out.println("Delivery person added successfully!");
    }

    // Assign a delivery person to an order
    private static void assignDeliveryPersonToOrder() {
        System.out.print("Enter Order ID: ");
        int orderId = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.print("Enter Delivery Person ID: ");
        int deliveryPersonId = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        orderService.assignDeliveryPersonToOrder(orderId, deliveryPersonId);
    }

    // Add a new customer
    private static void addCustomer() {
        System.out.print("Enter User ID: ");
        int userId = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.print("Enter Username: ");
        String username = scanner.nextLine();
        System.out.print("Enter Contact No.: ");
        long contactNo = scanner.nextLong();
        Customer customer = new Customer(userId, username, contactNo);
        customerService.addCustomer(customer);
    }

    // Display available food items (reuse restaurant menu display)
    private static void viewFoodItems() {
        viewRestaurantsAndMenus();
    }

    // Add a food item to the customer's cart
    private static void addFoodToCart() {
        System.out.print("Enter Customer ID: ");
        int customerId = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        Customer customer = customerService.getCustomer(customerId);
        if (customer != null) {
            System.out.print("Enter Restaurant ID: ");
            int restaurantId = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            System.out.print("Enter Food Item ID: ");
            int foodItemId = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            System.out.print("Enter Quantity: ");
            int quantity = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            Restaurant restaurant = foodService.getRestaurantById(restaurantId);
            if (restaurant != null) {
                FoodItem foodItem = restaurant.getMenu().stream()
                    .filter(item -> item.getId() == foodItemId)
                    .findFirst()
                    .orElse(null);
                if (foodItem != null) {
                    customer.getCart().addItem(foodItem, quantity);
                    System.out.println("Food item added to cart successfully!");
                } else {
                    System.out.println("Food item not found!");
                }
            } else {
                System.out.println("Restaurant not found!");
            }
        } else {
            System.out.println("Customer not found!");
        }
    }

    // Display the contents of the customer's cart
    private static void viewCart() {
        System.out.print("Enter Customer ID: ");
        int customerId = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        Customer customer = customerService.getCustomer(customerId);
        if (customer != null) {
            System.out.println("Cart:");
            System.out.println(customer.getCart());
        } else {
            System.out.println("Customer not found!");
        }
    }

    // Place an order for the customer
    private static void placeOrder() {
        System.out.print("Enter Customer ID: ");
        int customerId = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        Customer customer = customerService.getCustomer(customerId);
        if (customer != null) {
            Order order = orderService.createOrder(customer);
            order.setDeliveryAddress("Default Address"); // Set a default address or prompt for it
            System.out.println("Order placed successfully!");
            customer.getCart().getItems().forEach((item, quantity) -> order.addItem(item, quantity));
            customer.getCart().getItems().clear(); // Clear cart after placing the order
        } else {
            System.out.println("Customer not found!");
        }
    }
}
