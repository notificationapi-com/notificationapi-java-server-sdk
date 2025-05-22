package com.notificationapi.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Options {
    @JsonProperty("email")
    private EmailOptions email;
    @JsonProperty("apn")
    private ApnOptions apn;
    @JsonProperty("fcm")
    private FcmOptions fcm;

    public EmailOptions getEmail() { return email; }
    public Options setEmail(EmailOptions email) { this.email = email; return this; }
    public ApnOptions getApn() { return apn; }
    public Options setApn(ApnOptions apn) { this.apn = apn; return this; }
    public FcmOptions getFcm() { return fcm; }
    public Options setFcm(FcmOptions fcm) { this.fcm = fcm; return this; }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class EmailOptions {
        @JsonProperty("replyToAddresses")
        private List<String> replyToAddresses;
        @JsonProperty("ccAddresses")
        private List<String> ccAddresses;
        @JsonProperty("bccAddresses")
        private List<String> bccAddresses;
        @JsonProperty("fromName")
        private String fromName;
        @JsonProperty("fromAddress")
        private String fromAddress;
        @JsonProperty("attachments")
        private List<Attachment> attachments;
        public List<String> getReplyToAddresses() { return replyToAddresses; }
        public EmailOptions setReplyToAddresses(List<String> replyToAddresses) { this.replyToAddresses = replyToAddresses; return this; }
        public List<String> getCcAddresses() { return ccAddresses; }
        public EmailOptions setCcAddresses(List<String> ccAddresses) { this.ccAddresses = ccAddresses; return this; }
        public List<String> getBccAddresses() { return bccAddresses; }
        public EmailOptions setBccAddresses(List<String> bccAddresses) { this.bccAddresses = bccAddresses; return this; }
        public String getFromName() { return fromName; }
        public EmailOptions setFromName(String fromName) { this.fromName = fromName; return this; }
        public String getFromAddress() { return fromAddress; }
        public EmailOptions setFromAddress(String fromAddress) { this.fromAddress = fromAddress; return this; }
        public List<Attachment> getAttachments() { return attachments; }
        public EmailOptions setAttachments(List<Attachment> attachments) { this.attachments = attachments; return this; }
        @JsonInclude(JsonInclude.Include.NON_NULL)
        public static class Attachment {
            @JsonProperty("filename")
            private String filename;
            @JsonProperty("url")
            private String url;
            public String getFilename() { return filename; }
            public Attachment setFilename(String filename) { this.filename = filename; return this; }
            public String getUrl() { return url; }
            public Attachment setUrl(String url) { this.url = url; return this; }
        }
    }
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class ApnOptions {
        @JsonProperty("expiry")
        private Integer expiry;
        @JsonProperty("priority")
        private Integer priority;
        @JsonProperty("collapseId")
        private String collapseId;
        @JsonProperty("threadId")
        private String threadId;
        @JsonProperty("badge")
        private Integer badge;
        @JsonProperty("sound")
        private String sound;
        @JsonProperty("contentAvailable")
        private Boolean contentAvailable;
        public Integer getExpiry() { return expiry; }
        public ApnOptions setExpiry(Integer expiry) { this.expiry = expiry; return this; }
        public Integer getPriority() { return priority; }
        public ApnOptions setPriority(Integer priority) { this.priority = priority; return this; }
        public String getCollapseId() { return collapseId; }
        public ApnOptions setCollapseId(String collapseId) { this.collapseId = collapseId; return this; }
        public String getThreadId() { return threadId; }
        public ApnOptions setThreadId(String threadId) { this.threadId = threadId; return this; }
        public Integer getBadge() { return badge; }
        public ApnOptions setBadge(Integer badge) { this.badge = badge; return this; }
        public String getSound() { return sound; }
        public ApnOptions setSound(String sound) { this.sound = sound; return this; }
        public Boolean getContentAvailable() { return contentAvailable; }
        public ApnOptions setContentAvailable(Boolean contentAvailable) { this.contentAvailable = contentAvailable; return this; }
    }
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class FcmOptions {
        @JsonProperty("android")
        private AndroidOptions android;
        public AndroidOptions getAndroid() { return android; }
        public FcmOptions setAndroid(AndroidOptions android) { this.android = android; return this; }
        @JsonInclude(JsonInclude.Include.NON_NULL)
        public static class AndroidOptions {
            @JsonProperty("collapseKey")
            private String collapseKey;
            @JsonProperty("priority")
            private String priority;
            @JsonProperty("ttl")
            private Integer ttl;
            @JsonProperty("restrictedPackageName")
            private String restrictedPackageName;
            public String getCollapseKey() { return collapseKey; }
            public AndroidOptions setCollapseKey(String collapseKey) { this.collapseKey = collapseKey; return this; }
            public String getPriority() { return priority; }
            public AndroidOptions setPriority(String priority) { this.priority = priority; return this; }
            public Integer getTtl() { return ttl; }
            public AndroidOptions setTtl(Integer ttl) { this.ttl = ttl; return this; }
            public String getRestrictedPackageName() { return restrictedPackageName; }
            public AndroidOptions setRestrictedPackageName(String restrictedPackageName) { this.restrictedPackageName = restrictedPackageName; return this; }
        }
    }
} 