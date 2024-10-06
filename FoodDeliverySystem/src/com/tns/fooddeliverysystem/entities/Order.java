package com.tns.fooddeliverysystem.entities;

import java.util.HashMap;
import java.util.Map;

// Order class represents a customer's order, including items, status, and delivery details
public class Order {
    // Unique identifier for the order
    private int orderId;

    // Customer who placed the order
    private Customer customer;

    // Map of food items in the order and their quantities
    private Map<FoodItem, Integer> items;

    // Current status of the order (e.g., Pending, Delivered)
    private String status;

    // Delivery person assigned to the order
    private DeliveryPerson deliveryPerson;

    // Address where the order needs to be delivered
    private String deliveryAddress;

    /**
     * Constructor to initialize an Order with a specific ID and customer.
     *
     * @param orderId  Unique ID of the order.
     * @param customer Customer who placed the order.
     */
    public Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.items = new HashMap<>();  // Initialize with an empty list of items
        this.status = "Pending";       // Default status is "Pending"
        this.deliveryPerson = null;    // No delivery person assigned initially
        this.deliveryAddress = "";     // Default delivery address is empty
    }

    /**
     * Gets the order ID.
     *
     * @return The order's ID.
     */
    public int getOrderId() {
        return orderId;
    }

    /**
     * Sets the order ID.
     *
     * @param orderId The new ID for the order.
     */
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    /**
     * Gets the customer who placed the order.
     *
     * @return The customer associated with the order.
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Sets the customer who placed the order.
     *
     * @param customer The customer to associate with the order.
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * Gets the map of food items and their quantities in the order.
     *
     * @return The map of food items and quantities.
     */
    public Map<FoodItem, Integer> getItems() {
        return items;
    }

    /**
     * Adds a food item and its quantity to the order. If the item already exists, it updates the quantity.
     *
     * @param foodItem The food item to add.
     * @param quantity The quantity of the food item.
     */
    public void addItem(FoodItem foodItem, int quantity) {
        items.put(foodItem, items.getOrDefault(foodItem, 0) + quantity);
    }

    /**
     * Sets the items in the order.
     *
     * @param items A map of food items and their quantities to set for the order.
     */
    public void setItems(Map<FoodItem, Integer> items) {
        this.items = items;
    }

    /**
     * Gets the current status of the order.
     *
     * @return The order's status.
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the status of the order.
     *
     * @param status The new status for the order.
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Gets the delivery person assigned to the order.
     *
     * @return The delivery person assigned, or null if none assigned.
     */
    public DeliveryPerson getDeliveryPerson() {
        return deliveryPerson;
    }

    /**
     * Assigns a delivery person to the order.
     *
     * @param deliveryPerson The delivery person to assign.
     */
    public void setDeliveryPerson(DeliveryPerson deliveryPerson) {
        this.deliveryPerson = deliveryPerson;
    }

    /**
     * Gets the delivery address for the order.
     *
     * @return The delivery address.
     */
    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    /**
     * Sets the delivery address for the order.
     *
     * @param deliveryAddress The address to deliver the order to.
     */
    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    /**
     * Returns a string representation of the Order object, including order ID, customer, items, status, and delivery person.
     *
     * @return A formatted string representing the order.
     */
    @Override
    public String toString() {
        return "Order{orderId=" + orderId +
                ", customer=" + customer.getUsername() +
                ", items=" + items +
                ", status='" + status + '\'' +
                ", deliveryPerson=" + (deliveryPerson != null ? deliveryPerson.getName() : "Not Assigned") +
                '}';
    }
}
