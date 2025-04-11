package com.notificationapi.examples;

import com.notificationapi.NotificationApi;
import com.notificationapi.model.NotificationRequest;
import com.notificationapi.model.User;

import java.util.HashMap;
import java.util.Map;

/**
 * Example usage of the NotificationAPI SDK.
 */
public class NotificationExample {
    public static void main(String[] args) {
        // Replace these with your actual client ID and secret
        String clientId = "your_client_id";
        String clientSecret = "your_client_secret";

        try (NotificationApi api = new NotificationApi(clientId, clientSecret)) {
            // Create a user
            User user = new User("user123")
                .setEmail("user@example.com")
                .setNumber("+15005550006");

            // Create merge tags
            Map<String, Object> mergeTags = new HashMap<>();
            mergeTags.put("comment", "Great post!");
            mergeTags.put("commentId", "comment123");

            // Create and send the notification request
            NotificationRequest request = new NotificationRequest("comment_notification", user)
                .setMergeTags(mergeTags);

            System.out.println("Sending notification request...");
            String response = api.send(request);
            System.out.println("Response: " + response);

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
} 