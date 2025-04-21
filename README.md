# NotificationAPI Java Server SDK

This is the official Java Server SDK for [NotificationAPI](https://www.notificationapi.com), making it easy to send notifications from your Java applications.

## Installation

Add the following dependency to your project's `pom.xml`:

```xml
<dependency>
    <groupId>com.notificationapi</groupId>
    <artifactId>notificationapi-java-server-sdk</artifactId>
    <version>0.1.0</version>
</dependency>
```

## Usage

Here's a simple example of how to use the SDK:

```java
import com.notificationapi.NotificationApi;
import com.notificationapi.model.NotificationRequest;
import com.notificationapi.model.User;

// Initialize the client with default base URL (https://api.notificationapi.com)
NotificationApi api = new NotificationApi("your_client_id", "your_client_secret");

// Or initialize with a custom base URL (e.g., EU region)
NotificationApi apiEu = new NotificationApi("your_client_id", "your_client_secret", "https://api.eu.notificationapi.com");

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

// Send the notification
String response = api.send(request);
```

### Error Handling

The SDK throws two types of exceptions:

1. `IllegalArgumentException`: When required parameters are missing or invalid
2. `NotificationApiException`: When there's an error communicating with the API

Example error handling:

```java
try {
    api.send(request);
} catch (IllegalArgumentException e) {
    // Handle invalid parameters
    System.err.println("Invalid parameters: " + e.getMessage());
} catch (NotificationApiException e) {
    // Handle API errors
    System.err.println("API error: " + e.getMessage());
    System.err.println("Status code: " + e.getStatusCode());
}
```

### Resource Management

The SDK implements `AutoCloseable`, so it's recommended to use it with try-with-resources:

```java
try (NotificationApi api = new NotificationApi(clientId, clientSecret)) {
    api.send(request);
} catch (Exception e) {
    // Handle exceptions
}
```

## Requirements

- Java 11 or later
- Maven or Gradle build system
