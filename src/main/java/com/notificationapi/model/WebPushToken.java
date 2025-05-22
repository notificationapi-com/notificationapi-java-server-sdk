package com.notificationapi.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WebPushToken {
    @JsonProperty("sub")
    private PushSubscription sub;

    public PushSubscription getSub() { return sub; }
    public WebPushToken setSub(PushSubscription sub) { this.sub = sub; return this; }
} 