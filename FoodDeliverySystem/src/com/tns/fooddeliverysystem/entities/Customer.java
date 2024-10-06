package com.tns.fooddeliverysystem.entities;

// Customer class extends the User class to include a shopping cart for food items
public class Customer extends User {
    // Each customer has a cart to hold the food items they wish to order
    private Cart cart;

    /**
     * Constructor to create a new customer with a unique user ID, username, and contact number.
     * Initializes the customer's cart to an empty cart.
     *
     * @param userId    Unique identifier for the customer.
     * @param username  Name of the customer.
     * @param contactNo Contact number of the customer.
     */
    public Customer(int userId, String username, long contactNo) {
        super(userId, username, contactNo);
        this.cart = new Cart(); // Initialize an empty cart for the customer
    }

    /**
     * Gets the cart associated with the customer.
     *
     * @return The customer's cart containing food items.
     */
    public Cart getCart() {
        return cart;
    }

    /**
     * Sets a new cart for the customer. This can be used to replace the current cart.
     *
     * @param cart The new cart to be associated with the customer.
     */
    public void setCart(Cart cart) {
        this.cart = cart;
    }
}
