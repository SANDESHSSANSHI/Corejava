package com.tns.fooddeliverysystem.services;

import com.tns.fooddeliverysystem.entities.Customer;
import java.util.ArrayList;
import java.util.List;

// Service class for managing customer-related operations
public class CustomerService {
    // List to hold all customers
    private List<Customer> customerList = new ArrayList<>();

    /**
     * Adds a new customer to the list.
     *
     * @param customer The customer to be added.
     */
    public void addCustomer(Customer customer) {
        customerList.add(customer);
        System.out.println("Customer created successfully!");
    }

    /**
     * Retrieves a customer by their unique user ID.
     *
     * @param userId The ID of the customer to be retrieved.
     * @return The customer with the specified user ID, or null if not found.
     */
    public Customer getCustomer(int userId) {
        for (Customer customer : customerList) {
            if (customer.getUserId() == userId) {
                return customer;
            }
        }
        return null;
    }

    /**
     * Gets the list of all customers.
     *
     * @return The list of all customers.
     */
    public List<Customer> getCustomers() {
        return customerList;
    }
}
