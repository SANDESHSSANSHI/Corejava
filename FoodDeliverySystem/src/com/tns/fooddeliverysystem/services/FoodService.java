package com.tns.fooddeliverysystem.services;

import com.tns.fooddeliverysystem.entities.FoodItem;
import com.tns.fooddeliverysystem.entities.Restaurant;

import java.util.ArrayList;
import java.util.List;

// Service class for managing food-related operations, including restaurants and their menus
public class FoodService {
    // List to hold all restaurants
    private List<Restaurant> restaurants = new ArrayList<>();

    /**
     * Adds a new restaurant to the list.
     *
     * @param restaurant The restaurant to be added.
     */
    public void addRestaurant(Restaurant restaurant) {
        restaurants.add(restaurant);
    }

    /**
     * Adds a food item to a specific restaurant's menu.
     *
     * @param restaurantId The ID of the restaurant to which the food item will be added.
     * @param foodItem     The food item to be added.
     */
    public void addFoodItemToRestaurant(int restaurantId, FoodItem foodItem) {
        Restaurant restaurant = getRestaurantById(restaurantId);
        if (restaurant != null) {
            restaurant.addFoodItem(foodItem);
            System.out.println("Food item added successfully!");
        } else {
            System.out.println("Restaurant not found!");
        }
    }

    /**
     * Removes a food item from a specific restaurant's menu.
     *
     * @param restaurantId The ID of the restaurant from which the food item will be removed.
     * @param foodItemId   The ID of the food item to be removed.
     */
    public void removeFoodItemFromRestaurant(int restaurantId, int foodItemId) {
        Restaurant restaurant = getRestaurantById(restaurantId);
        if (restaurant != null) {
            restaurant.removeFoodItem(foodItemId);
            System.out.println("Food item removed successfully!");
        } else {
            System.out.println("Restaurant not found!");
        }
    }

    /**
     * Retrieves a restaurant by its unique ID.
     *
     * @param id The ID of the restaurant to be retrieved.
     * @return The restaurant with the specified ID, or null if not found.
     */
    public Restaurant getRestaurantById(int id) {
        for (Restaurant restaurant : restaurants) {
            if (restaurant.getId() == id) {
                return restaurant;
            }
        }
        return null;
    }

    /**
     * Gets the list of all restaurants.
     *
     * @return The list of all restaurants.
     */
    public List<Restaurant> getAllRestaurants() {
        return restaurants;
    }
}
