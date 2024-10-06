package com.tns.fooddeliverysystem.entities;

// FoodItem class represents an item of food available for purchase
public class FoodItem {
    // Unique identifier for the food item
    private int id;

    // Name of the food item
    private String name;

    // Price of the food item
    private double price;

    /**
     * Constructor to initialize a FoodItem with a specific ID, name, and price.
     *
     * @param id    Unique ID of the food item.
     * @param name  Name of the food item.
     * @param price Price of the food item.
     */
    public FoodItem(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    /**
     * Gets the ID of the food item.
     *
     * @return The food item's ID.
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the ID of the food item.
     *
     * @param id The new ID for the food item.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets the name of the food item.
     *
     * @return The food item's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the food item.
     *
     * @param name The new name for the food item.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the price of the food item.
     *
     * @return The food item's price.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the price of the food item.
     *
     * @param price The new price for the food item.
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Returns a string representation of the FoodItem object, showing ID, name, and price.
     *
     * @return A formatted string representing the food item.
     */
    @Override
    public String toString() {
        return "FoodItem{id=" + id + ", name='" + name + "', price=" + price + '}';
    }
}
