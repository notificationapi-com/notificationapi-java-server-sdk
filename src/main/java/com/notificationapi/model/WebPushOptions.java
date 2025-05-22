package com.notificationapi.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WebPushOptions {
    @JsonProperty("title")
    private String title;
    @JsonProperty("message")
    private String message;
    @JsonProperty("icon")
    private String icon;
    @JsonProperty("url")
    private String url;

    public String getTitle() { return title; }
    public WebPushOptions setTitle(String title) { this.title = title; return this; }
    public String getMessage() { return message; }
    public WebPushOptions setMessage(String message) { this.message = message; return this; }
    public String getIcon() { return icon; }
    public WebPushOptions setIcon(String icon) { this.icon = icon; return this; }
    public String getUrl() { return url; }
    public WebPushOptions setUrl(String url) { this.url = url; return this; }
} 