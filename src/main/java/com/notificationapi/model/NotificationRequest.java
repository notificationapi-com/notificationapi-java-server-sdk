package com.notificationapi.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * Represents a notification request in the NotificationAPI system.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NotificationRequest {
    @JsonProperty("notificationId")
    private String notificationId;

    @JsonProperty("user")
    private User user;

    @JsonProperty("mergeTags")
    private Map<String, Object> mergeTags;

    @JsonProperty("type")
    private String type;

    @JsonProperty("to")
    private User to;

    @JsonProperty("forceChannels")
    private java.util.List<String> forceChannels;

    @JsonProperty("parameters")
    private Map<String, Object> parameters;

    @JsonProperty("secondaryId")
    private String secondaryId;

    @JsonProperty("templateId")
    private String templateId;

    @JsonProperty("subNotificationId")
    private String subNotificationId;

    @JsonProperty("options")
    private Options options;

    @JsonProperty("schedule")
    private String schedule;

    @JsonProperty("email")
    private EmailOptions email;

    @JsonProperty("inapp")
    private InAppOptions inapp;

    @JsonProperty("sms")
    private SmsOptions sms;

    @JsonProperty("call")
    private CallOptions call;

    @JsonProperty("web_push")
    private WebPushOptions webPush;

    @JsonProperty("mobile_push")
    private MobilePushOptions mobilePush;

    @JsonProperty("slack")
    private SlackOptions slack;

    /**
     * Default constructor for NotificationRequest.
     */
    public NotificationRequest() {
    }

    /**
     * Constructor with required fields.
     *
     * @param notificationId the notification template ID
     * @param user the user to send the notification to
     */
    public NotificationRequest(String notificationId, User user) {
        this.notificationId = notificationId;
        this.user = user;
    }

    /**
     * Gets the notification template ID.
     *
     * @return the notification template ID
     */
    public String getNotificationId() {
        return notificationId;
    }

    /**
     * Sets the notification template ID.
     *
     * @param notificationId the notification template ID to set
     * @return this NotificationRequest instance
     */
    public NotificationRequest setNotificationId(String notificationId) {
        this.notificationId = notificationId;
        return this;
    }

    /**
     * Gets the user to send the notification to.
     *
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets the user to send the notification to.
     *
     * @param user the user to set
     * @return this NotificationRequest instance
     */
    public NotificationRequest setUser(User user) {
        this.user = user;
        return this;
    }

    /**
     * Gets the merge tags for the notification.
     *
     * @return the merge tags
     */
    public Map<String, Object> getMergeTags() {
        return mergeTags;
    }

    /**
     * Sets the merge tags for the notification.
     *
     * @param mergeTags the merge tags to set
     * @return this NotificationRequest instance
     */
    public NotificationRequest setMergeTags(Map<String, Object> mergeTags) {
        this.mergeTags = mergeTags;
        return this;
    }

    /**
     * Gets the type of the notification.
     *
     * @return the type of the notification
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the type of the notification.
     *
     * @param type the type of the notification to set
     * @return this NotificationRequest instance
     */
    public NotificationRequest setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Gets the user to send the notification to.
     *
     * @return the user
     */
    public User getTo() {
        return to;
    }

    /**
     * Sets the user to send the notification to.
     *
     * @param to the user to set
     * @return this NotificationRequest instance
     */
    public NotificationRequest setTo(User to) {
        this.to = to;
        return this;
    }

    /**
     * Gets the force channels for the notification.
     *
     * @return the force channels
     */
    public java.util.List<String> getForceChannels() {
        return forceChannels;
    }

    /**
     * Sets the force channels for the notification.
     *
     * @param forceChannels the force channels to set
     * @return this NotificationRequest instance
     */
    public NotificationRequest setForceChannels(java.util.List<String> forceChannels) {
        this.forceChannels = forceChannels;
        return this;
    }

    /**
     * Gets the parameters for the notification.
     *
     * @return the parameters
     */
    public Map<String, Object> getParameters() {
        return parameters;
    }

    /**
     * Sets the parameters for the notification.
     *
     * @param parameters the parameters to set
     * @return this NotificationRequest instance
     */
    public NotificationRequest setParameters(Map<String, Object> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Gets the secondary ID for the notification.
     *
     * @return the secondary ID
     */
    public String getSecondaryId() {
        return secondaryId;
    }

    /**
     * Sets the secondary ID for the notification.
     *
     * @param secondaryId the secondary ID to set
     * @return this NotificationRequest instance
     */
    public NotificationRequest setSecondaryId(String secondaryId) {
        this.secondaryId = secondaryId;
        return this;
    }

    /**
     * Gets the template ID for the notification.
     *
     * @return the template ID
     */
    public String getTemplateId() {
        return templateId;
    }

    /**
     * Sets the template ID for the notification.
     *
     * @param templateId the template ID to set
     * @return this NotificationRequest instance
     */
    public NotificationRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * Gets the sub-notification ID for the notification.
     *
     * @return the sub-notification ID
     */
    public String getSubNotificationId() {
        return subNotificationId;
    }

    /**
     * Sets the sub-notification ID for the notification.
     *
     * @param subNotificationId the sub-notification ID to set
     * @return this NotificationRequest instance
     */
    public NotificationRequest setSubNotificationId(String subNotificationId) {
        this.subNotificationId = subNotificationId;
        return this;
    }

    /**
     * Gets the options for the notification.
     *
     * @return the options
     */
    public Options getOptions() {
        return options;
    }

    /**
     * Sets the options for the notification.
     *
     * @param options the options to set
     * @return this NotificationRequest instance
     */
    public NotificationRequest setOptions(Options options) {
        this.options = options;
        return this;
    }

    /**
     * Gets the schedule for the notification.
     *
     * @return the schedule
     */
    public String getSchedule() {
        return schedule;
    }

    /**
     * Sets the schedule for the notification.
     *
     * @param schedule the schedule to set
     * @return this NotificationRequest instance
     */
    public NotificationRequest setSchedule(String schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * Gets the email options for the notification.
     *
     * @return the email options
     */
    public EmailOptions getEmail() {
        return email;
    }

    /**
     * Sets the email options for the notification.
     *
     * @param email the email options to set
     * @return this NotificationRequest instance
     */
    public NotificationRequest setEmail(EmailOptions email) {
        this.email = email;
        return this;
    }

    /**
     * Gets the in-app options for the notification.
     *
     * @return the in-app options
     */
    public InAppOptions getInapp() {
        return inapp;
    }

    /**
     * Sets the in-app options for the notification.
     *
     * @param inapp the in-app options to set
     * @return this NotificationRequest instance
     */
    public NotificationRequest setInapp(InAppOptions inapp) {
        this.inapp = inapp;
        return this;
    }

    /**
     * Gets the SMS options for the notification.
     *
     * @return the SMS options
     */
    public SmsOptions getSms() {
        return sms;
    }

    /**
     * Sets the SMS options for the notification.
     *
     * @param sms the SMS options to set
     * @return this NotificationRequest instance
     */
    public NotificationRequest setSms(SmsOptions sms) {
        this.sms = sms;
        return this;
    }

    /**
     * Gets the call options for the notification.
     *
     * @return the call options
     */
    public CallOptions getCall() {
        return call;
    }

    /**
     * Sets the call options for the notification.
     *
     * @param call the call options to set
     * @return this NotificationRequest instance
     */
    public NotificationRequest setCall(CallOptions call) {
        this.call = call;
        return this;
    }

    /**
     * Gets the web push options for the notification.
     *
     * @return the web push options
     */
    public WebPushOptions getWebPush() {
        return webPush;
    }

    /**
     * Sets the web push options for the notification.
     *
     * @param webPush the web push options to set
     * @return this NotificationRequest instance
     */
    public NotificationRequest setWebPush(WebPushOptions webPush) {
        this.webPush = webPush;
        return this;
    }

    /**
     * Gets the mobile push options for the notification.
     *
     * @return the mobile push options
     */
    public MobilePushOptions getMobilePush() {
        return mobilePush;
    }

    /**
     * Sets the mobile push options for the notification.
     *
     * @param mobilePush the mobile push options to set
     * @return this NotificationRequest instance
     */
    public NotificationRequest setMobilePush(MobilePushOptions mobilePush) {
        this.mobilePush = mobilePush;
        return this;
    }

    /**
     * Gets the Slack options for the notification.
     *
     * @return the Slack options
     */
    public SlackOptions getSlack() {
        return slack;
    }

    /**
     * Sets the Slack options for the notification.
     *
     * @param slack the Slack options to set
     * @return this NotificationRequest instance
     */
    public NotificationRequest setSlack(SlackOptions slack) {
        this.slack = slack;
        return this;
    }
} 