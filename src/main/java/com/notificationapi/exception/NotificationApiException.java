package com.notificationapi.exception;

/**
 * Custom exception class for NotificationAPI SDK errors.
 */
public class NotificationApiException extends RuntimeException {
    private final int statusCode;

    /**
     * Constructs a new NotificationApiException with the specified message.
     *
     * @param message the error message
     */
    public NotificationApiException(String message) {
        super(message);
        this.statusCode = 0;
    }

    /**
     * Constructs a new NotificationApiException with the specified message and HTTP status code.
     *
     * @param message the error message
     * @param statusCode the HTTP status code
     */
    public NotificationApiException(String message, int statusCode) {
        super(message);
        this.statusCode = statusCode;
    }

    /**
     * Constructs a new NotificationApiException with the specified message and cause.
     *
     * @param message the error message
     * @param cause the cause of the error
     */
    public NotificationApiException(String message, Throwable cause) {
        super(message, cause);
        this.statusCode = 0;
    }

    /**
     * Gets the HTTP status code associated with this exception.
     *
     * @return the HTTP status code
     */
    public int getStatusCode() {
        return statusCode;
    }
} 