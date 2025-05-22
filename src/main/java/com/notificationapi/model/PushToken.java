package com.notificationapi.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PushToken {
    @JsonProperty("type")
    private PushProvider type;

    @JsonProperty("token")
    private String token;

    @JsonProperty("device")
    private Device device;

    public PushProvider getType() { return type; }
    public PushToken setType(PushProvider type) { this.type = type; return this; }

    public String getToken() { return token; }
    public PushToken setToken(String token) { this.token = token; return this; }

    public Device getDevice() { return device; }
    public PushToken setDevice(Device device) { this.device = device; return this; }
} 