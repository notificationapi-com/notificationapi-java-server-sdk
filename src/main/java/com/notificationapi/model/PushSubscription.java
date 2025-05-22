package com.notificationapi.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PushSubscription {
    @JsonProperty("endpoint")
    private String endpoint;

    @JsonProperty("keys")
    private Keys keys;

    public String getEndpoint() { return endpoint; }
    public PushSubscription setEndpoint(String endpoint) { this.endpoint = endpoint; return this; }

    public Keys getKeys() { return keys; }
    public PushSubscription setKeys(Keys keys) { this.keys = keys; return this; }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Keys {
        @JsonProperty("p256dh")
        private String p256dh;
        @JsonProperty("auth")
        private String auth;

        public String getP256dh() { return p256dh; }
        public Keys setP256dh(String p256dh) { this.p256dh = p256dh; return this; }

        public String getAuth() { return auth; }
        public Keys setAuth(String auth) { this.auth = auth; return this; }
    }
} 