package com.tns.fooddeliverysystem.entities;

import java.util.ArrayList;
import java.util.List;

// Restaurant class represents a restaurant with a unique ID, name, and a menu of food items
public class Restaurant {
    // Unique identifier for the restaurant
    private int id;

    // Name of the restaurant
    private String name;

    // List of food items available in the restaurant's menu
    private List<FoodItem> menu;

    /**
     * Constructor to initialize a Restaurant with a specific ID and name.
     *
     * @param id   Unique ID of the restaurant.
     * @param name Name of the restaurant.
     */
    public Restaurant(int id, String name) {
        this.id = id;
        this.name = name;
        this.menu = new ArrayList<>();  // Initialize with an empty menu
    }

    /**
     * Gets the restaurant's ID.
     *
     * @return The restaurant's ID.
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the restaurant's ID.
     *
     * @param id The new ID for the restaurant.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets the name of the restaurant.
     *
     * @return The restaurant's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the restaurant.
     *
     * @param name The new name for the restaurant.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the menu of food items available in the restaurant.
     *
     * @return The list of food items in the menu.
     */
    public List<FoodItem> getMenu() {
        return menu;
    }

    /**
     * Sets the menu of the restaurant.
     *
     * @param menu The list of food items to set as the restaurant's menu.
     */
    public void setMenu(List<FoodItem> menu) {
        this.menu = menu;
    }

    /**
     * Adds a food item to the restaurant's menu.
     *
     * @param foodItem The food item to add to the menu.
     */
    public void addFoodItem(FoodItem foodItem) {
        menu.add(foodItem);
    }

    /**
     * Removes a food item from the restaurant's menu by its ID.
     *
     * @param foodItemId The ID of the food item to remove.
     */
    public void removeFoodItem(int foodItemId) {
        menu.removeIf(item -> item.getId() == foodItemId);  // Removes item if the ID matches
    }

    /**
     * Returns a string representation of the Restaurant object, including its ID, name, and menu.
     *
     * @return A formatted string representing the restaurant.
     */
    @Override
    public String toString() {
        return "Restaurant{id=" + id + ", name='" + name + "', menu=" + menu + '}';
    }
}
