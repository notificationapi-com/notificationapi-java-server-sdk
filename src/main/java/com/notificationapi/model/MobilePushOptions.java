package com.notificationapi.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MobilePushOptions {
    @JsonProperty("title")
    private String title;
    @JsonProperty("message")
    private String message;

    public String getTitle() { return title; }
    public MobilePushOptions setTitle(String title) { this.title = title; return this; }
    public String getMessage() { return message; }
    public MobilePushOptions setMessage(String message) { this.message = message; return this; }
} 