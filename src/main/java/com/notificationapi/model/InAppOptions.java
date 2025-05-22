package com.notificationapi.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class InAppOptions {
    @JsonProperty("title")
    private String title;
    @JsonProperty("url")
    private String url;
    @JsonProperty("image")
    private String image;

    public String getTitle() { return title; }
    public InAppOptions setTitle(String title) { this.title = title; return this; }
    public String getUrl() { return url; }
    public InAppOptions setUrl(String url) { this.url = url; return this; }
    public String getImage() { return image; }
    public InAppOptions setImage(String image) { this.image = image; return this; }
} 