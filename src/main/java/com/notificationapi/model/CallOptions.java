package com.notificationapi.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CallOptions {
    @JsonProperty("message")
    private String message;

    public String getMessage() { return message; }
    public CallOptions setMessage(String message) { this.message = message; return this; }
} 