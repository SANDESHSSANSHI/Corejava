package com.tns.fooddeliverysystem.services;

import com.tns.fooddeliverysystem.entities.Customer;
import com.tns.fooddeliverysystem.entities.DeliveryPerson;
import com.tns.fooddeliverysystem.entities.Order;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Service class for managing orders, delivery persons, and order assignments
public class OrderService {
    // List to hold all orders
    private List<Order> orders = new ArrayList<>();
    // Map to store delivery persons by their ID
    private Map<Integer, DeliveryPerson> deliveryPersonMap = new HashMap<>();
    // Counter to generate unique order IDs
    private int nextOrderId = 1;

    /**
     * Creates a new order for a given customer and adds it to the list of orders.
     *
     * @param customer The customer placing the order.
     * @return The newly created order.
     */
    public Order createOrder(Customer customer) {
        Order order = new Order(nextOrderId++, customer);
        orders.add(order);
        return order;
    }

    /**
     * Assigns a delivery person to a specific order.
     *
     * @param orderId          The ID of the order to which the delivery person will be assigned.
     * @param deliveryPersonId The ID of the delivery person to be assigned.
     */
    public void assignDeliveryPersonToOrder(int orderId, int deliveryPersonId) {
        Order order = getOrderById(orderId);
        DeliveryPerson deliveryPerson = deliveryPersonMap.get(deliveryPersonId);

        if (order != null && deliveryPerson != null) {
            order.setDeliveryPerson(deliveryPerson);
            System.out.println("Delivery person assigned successfully!");
        } else if (order == null) {
            System.out.println("Order not found!");
        } else {
            System.out.println("Delivery person not found!");
        }
    }

    /**
     * Adds a new delivery person to the list of available delivery persons.
     *
     * @param deliveryPerson The delivery person to be added.
     */
    public void addDeliveryPerson(DeliveryPerson deliveryPerson) {
        deliveryPersonMap.put(deliveryPerson.getDeliveryPersonId(), deliveryPerson);
    }

    /**
     * Retrieves the list of all orders.
     *
     * @return The list of all orders.
     */
    public List<Order> getAllOrders() {
        return orders;
    }

    /**
     * Finds an order by its unique ID.
     *
     * @param orderId The ID of the order to be found.
     * @return The order with the specified ID, or null if not found.
     */
    private Order getOrderById(int orderId) {
        for (Order order : orders) {
            if (order.getOrderId() == orderId) {
                return order;
            }
        }
        return null;
    }
}
