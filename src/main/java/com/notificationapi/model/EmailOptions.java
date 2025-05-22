package com.notificationapi.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmailOptions {
    @JsonProperty("subject")
    private String subject;
    @JsonProperty("html")
    private String html;
    @JsonProperty("previewText")
    private String previewText;
    @JsonProperty("senderName")
    private String senderName;
    @JsonProperty("senderEmail")
    private String senderEmail;

    public String getSubject() { return subject; }
    public EmailOptions setSubject(String subject) { this.subject = subject; return this; }
    public String getHtml() { return html; }
    public EmailOptions setHtml(String html) { this.html = html; return this; }
    public String getPreviewText() { return previewText; }
    public EmailOptions setPreviewText(String previewText) { this.previewText = previewText; return this; }
    public String getSenderName() { return senderName; }
    public EmailOptions setSenderName(String senderName) { this.senderName = senderName; return this; }
    public String getSenderEmail() { return senderEmail; }
    public EmailOptions setSenderEmail(String senderEmail) { this.senderEmail = senderEmail; return this; }
} 