package com.tns.fooddeliverysystem.entities;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    // Map to store food items and their quantities in the cart
    private Map<FoodItem, Integer> items;

    // Constructor to initialize an empty cart
    public Cart() {
        this.items = new HashMap<>();
    }

    /**
     * Adds a food item to the cart with the specified quantity.
     * If the item is already in the cart, it updates the quantity.
     *
     * @param foodItem The food item to be added.
     * @param quantity The quantity of the food item.
     */
    public void addItem(FoodItem foodItem, int quantity) {
        items.put(foodItem, items.getOrDefault(foodItem, 0) + quantity);
    }

    /**
     * Removes a food item from the cart.
     *
     * @param foodItem The food item to be removed.
     */
    public void removeItem(FoodItem foodItem) {
        items.remove(foodItem);
    }

    /**
     * Returns the map of food items and their quantities in the cart.
     *
     * @return A map containing food items and their corresponding quantities.
     */
    public Map<FoodItem, Integer> getItems() {
        return items;
    }

    /**
     * Provides a string representation of the cart, listing each food item,
     * its quantity, individual cost, and the total cost of the cart.
     *
     * @return A formatted string representing the contents of the cart.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        double totalCost = 0;
        
        // Iterate through the cart items to build the string representation
        for (Map.Entry<FoodItem, Integer> entry : items.entrySet()) {
            FoodItem item = entry.getKey();
            int quantity = entry.getValue();
            double cost = item.getPrice() * quantity;
            totalCost += cost;
            
            // Append details of each item in the cart
            sb.append("Food Item: ").append(item.getName())
              .append(", Quantity: ").append(quantity)
              .append(", Cost: Rs. ").append(cost).append("\n");
        }
        
        // Append the total cost of all items in the cart
        sb.append("Total Cost: Rs. ").append(totalCost);
        return sb.toString();
    }
}
