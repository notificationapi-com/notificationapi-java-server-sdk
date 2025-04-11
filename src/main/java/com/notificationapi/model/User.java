package com.notificationapi.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a user in the NotificationAPI system.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User {
    @JsonProperty("id")
    private String id;

    @JsonProperty("email")
    private String email;

    @JsonProperty("number")
    private String number;

    /**
     * Default constructor for User.
     */
    public User() {
    }

    /**
     * Constructor with required fields.
     *
     * @param id User identifier
     */
    public User(String id) {
        this.id = id;
    }

    /**
     * Gets the user ID.
     *
     * @return the user ID
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the user ID.
     *
     * @param id the user ID to set
     * @return this User instance
     */
    public User setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Gets the user's email.
     *
     * @return the user's email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the user's email.
     *
     * @param email the email to set
     * @return this User instance
     */
    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * Gets the user's phone number.
     *
     * @return the user's phone number
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the user's phone number.
     *
     * @param number the phone number to set
     * @return this User instance
     */
    public User setNumber(String number) {
        this.number = number;
        return this;
    }
} 