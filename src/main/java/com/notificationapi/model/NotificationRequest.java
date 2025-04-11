package com.notificationapi.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * Represents a notification request in the NotificationAPI system.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NotificationRequest {
    @JsonProperty("notificationId")
    private String notificationId;

    @JsonProperty("user")
    private User user;

    @JsonProperty("mergeTags")
    private Map<String, Object> mergeTags;

    /**
     * Default constructor for NotificationRequest.
     */
    public NotificationRequest() {
    }

    /**
     * Constructor with required fields.
     *
     * @param notificationId the notification template ID
     * @param user the user to send the notification to
     */
    public NotificationRequest(String notificationId, User user) {
        this.notificationId = notificationId;
        this.user = user;
    }

    /**
     * Gets the notification template ID.
     *
     * @return the notification template ID
     */
    public String getNotificationId() {
        return notificationId;
    }

    /**
     * Sets the notification template ID.
     *
     * @param notificationId the notification template ID to set
     * @return this NotificationRequest instance
     */
    public NotificationRequest setNotificationId(String notificationId) {
        this.notificationId = notificationId;
        return this;
    }

    /**
     * Gets the user to send the notification to.
     *
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets the user to send the notification to.
     *
     * @param user the user to set
     * @return this NotificationRequest instance
     */
    public NotificationRequest setUser(User user) {
        this.user = user;
        return this;
    }

    /**
     * Gets the merge tags for the notification.
     *
     * @return the merge tags
     */
    public Map<String, Object> getMergeTags() {
        return mergeTags;
    }

    /**
     * Sets the merge tags for the notification.
     *
     * @param mergeTags the merge tags to set
     * @return this NotificationRequest instance
     */
    public NotificationRequest setMergeTags(Map<String, Object> mergeTags) {
        this.mergeTags = mergeTags;
        return this;
    }
} 