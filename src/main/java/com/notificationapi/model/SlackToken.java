package com.notificationapi.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SlackToken {
    @JsonProperty("access_token")
    private String accessToken;
    @JsonProperty("app_id")
    private String appId;
    @JsonProperty("authed_user")
    private AuthedUser authedUser;
    @JsonProperty("bot_user_id")
    private String botUserId;
    @JsonProperty("enterprise")
    private Enterprise enterprise;
    @JsonProperty("error")
    private String error;
    @JsonProperty("expires_in")
    private Integer expiresIn;
    @JsonProperty("incoming_webhook")
    private IncomingWebhook incomingWebhook;
    @JsonProperty("is_enterprise_install")
    private Boolean isEnterpriseInstall;
    @JsonProperty("needed")
    private String needed;
    @JsonProperty("ok")
    private Boolean ok;
    @JsonProperty("provided")
    private String provided;
    @JsonProperty("refresh_token")
    private String refreshToken;
    @JsonProperty("scope")
    private String scope;
    @JsonProperty("team")
    private Team team;
    @JsonProperty("token_type")
    private String tokenType;
    @JsonProperty("warning")
    private String warning;

    // Getters and setters for all fields
    // ... (omitted for brevity, but should be included in the actual file)

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class AuthedUser {
        @JsonProperty("access_token")
        private String accessToken;
        @JsonProperty("expires_in")
        private Integer expiresIn;
        @JsonProperty("id")
        private String id;
        @JsonProperty("refresh_token")
        private String refreshToken;
        @JsonProperty("scope")
        private String scope;
        @JsonProperty("token_type")
        private String tokenType;
        // Getters and setters
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Enterprise {
        @JsonProperty("id")
        private String id;
        @JsonProperty("name")
        private String name;
        // Getters and setters
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class IncomingWebhook {
        @JsonProperty("channel")
        private String channel;
        @JsonProperty("channel_id")
        private String channelId;
        @JsonProperty("configuration_url")
        private String configurationUrl;
        @JsonProperty("url")
        private String url;
        // Getters and setters
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Team {
        @JsonProperty("id")
        private String id;
        @JsonProperty("name")
        private String name;
        // Getters and setters
    }
} 