package com.tns.fooddeliverysystem.entities;

// Abstract class representing a generic user with common properties
public abstract class User {
    // Unique identifier for the user
    private int userId;

    // Username of the user
    private String username;

    // Contact number of the user
    private long contactNo;

    /**
     * Constructor to initialize a User with an ID, username, and contact number.
     *
     * @param userId    Unique ID of the user.
     * @param username  Name of the user.
     * @param contactNo Contact number of the user.
     */
    public User(int userId, String username, long contactNo) {
        this.userId = userId;
        this.username = username;
        this.contactNo = contactNo;
    }

    /**
     * Gets the user ID.
     *
     * @return The user's ID.
     */
    public int getUserId() {
        return userId;
    }

    /**
     * Sets the user ID.
     *
     * @param userId The new ID for the user.
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

    /**
     * Gets the username of the user.
     *
     * @return The username.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the username of the user.
     *
     * @param username The new username.
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Gets the contact number of the user.
     *
     * @return The contact number.
     */
    public long getContactNo() {
        return contactNo;
    }

    /**
     * Sets the contact number of the user.
     *
     * @param contactNo The new contact number.
     */
    public void setContactNo(long contactNo) {
        this.contactNo = contactNo;
    }

    /**
     * Returns a string representation of the User object, including its ID, username, and contact number.
     *
     * @return A formatted string representing the user.
     */
    @Override
    public String toString() {
        return "User{userId=" + userId + ", username='" + username + "', contactNo=" + contactNo + '}';
    }
}
