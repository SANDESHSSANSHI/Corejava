package com.tns.fooddeliverysystem.entities;

// DeliveryPerson class represents a person responsible for delivering orders
public class DeliveryPerson {
    // Unique identifier for the delivery person
    private int deliveryPersonId;

    // Name of the delivery person
    private String name;

    // Contact number of the delivery person
    private long contactNo;

    /**
     * Constructor to initialize a DeliveryPerson with a specific ID, name, and contact number.
     *
     * @param deliveryPersonId Unique ID for the delivery person.
     * @param name             Name of the delivery person.
     * @param contactNo        Contact number of the delivery person.
     */
    public DeliveryPerson(int deliveryPersonId, String name, long contactNo) {
        this.deliveryPersonId = deliveryPersonId;
        this.name = name;
        this.contactNo = contactNo;
    }

    /**
     * Gets the ID of the delivery person.
     *
     * @return The delivery person's ID.
     */
    public int getDeliveryPersonId() {
        return deliveryPersonId;
    }

    /**
     * Sets the ID of the delivery person.
     *
     * @param deliveryPersonId The new ID for the delivery person.
     */
    public void setDeliveryPersonId(int deliveryPersonId) {
        this.deliveryPersonId = deliveryPersonId;
    }

    /**
     * Gets the name of the delivery person.
     *
     * @return The delivery person's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the delivery person.
     *
     * @param name The new name for the delivery person.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the contact number of the delivery person.
     *
     * @return The delivery person's contact number.
     */
    public long getContactNo() {
        return contactNo;
    }

    /**
     * Sets the contact number of the delivery person.
     *
     * @param contactNo The new contact number for the delivery person.
     */
    public void setContactNo(long contactNo) {
        this.contactNo = contactNo;
    }

    /**
     * Returns a string representation of the DeliveryPerson object, showing ID, name, and contact number.
     *
     * @return A formatted string representing the delivery person.
     */
    @Override
    public String toString() {
        return "DeliveryPerson{deliveryPersonId=" + deliveryPersonId + ", name='" + name + "', contactNo=" + contactNo + '}';
    }
}
