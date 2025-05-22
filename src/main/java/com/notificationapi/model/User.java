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

    @JsonProperty("pushTokens")
    private java.util.List<PushToken> pushTokens;

    @JsonProperty("webPushTokens")
    private java.util.List<WebPushToken> webPushTokens;

    @JsonProperty("timezone")
    private String timezone;

    @JsonProperty("lastSeenTime")
    private String lastSeenTime;

    @JsonProperty("slackChannelName")
    private String slackChannelName;

    @JsonProperty("slackToken")
    private SlackToken slackToken;

    @JsonProperty("updatedAt")
    private String updatedAt;

    @JsonProperty("createdAt")
    private String createdAt;

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

    public java.util.List<PushToken> getPushTokens() { return pushTokens; }
    public User setPushTokens(java.util.List<PushToken> pushTokens) { this.pushTokens = pushTokens; return this; }

    public java.util.List<WebPushToken> getWebPushTokens() { return webPushTokens; }
    public User setWebPushTokens(java.util.List<WebPushToken> webPushTokens) { this.webPushTokens = webPushTokens; return this; }

    public String getTimezone() { return timezone; }
    public User setTimezone(String timezone) { this.timezone = timezone; return this; }

    public String getLastSeenTime() { return lastSeenTime; }
    public User setLastSeenTime(String lastSeenTime) { this.lastSeenTime = lastSeenTime; return this; }

    public String getSlackChannelName() { return slackChannelName; }
    public User setSlackChannelName(String slackChannelName) { this.slackChannelName = slackChannelName; return this; }

    public SlackToken getSlackToken() { return slackToken; }
    public User setSlackToken(SlackToken slackToken) { this.slackToken = slackToken; return this; }

    public String getUpdatedAt() { return updatedAt; }
    public User setUpdatedAt(String updatedAt) { this.updatedAt = updatedAt; return this; }

    public String getCreatedAt() { return createdAt; }
    public User setCreatedAt(String createdAt) { this.createdAt = createdAt; return this; }
} 