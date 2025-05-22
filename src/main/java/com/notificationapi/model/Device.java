package com.notificationapi.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Device {
    @JsonProperty("app_id")
    private String appId;

    @JsonProperty("ad_id")
    private String adId;

    @JsonProperty("device_id")
    private String deviceId;

    @JsonProperty("platform")
    private String platform;

    @JsonProperty("manufacturer")
    private String manufacturer;

    @JsonProperty("model")
    private String model;

    public String getAppId() { return appId; }
    public Device setAppId(String appId) { this.appId = appId; return this; }

    public String getAdId() { return adId; }
    public Device setAdId(String adId) { this.adId = adId; return this; }

    public String getDeviceId() { return deviceId; }
    public Device setDeviceId(String deviceId) { this.deviceId = deviceId; return this; }

    public String getPlatform() { return platform; }
    public Device setPlatform(String platform) { this.platform = platform; return this; }

    public String getManufacturer() { return manufacturer; }
    public Device setManufacturer(String manufacturer) { this.manufacturer = manufacturer; return this; }

    public String getModel() { return model; }
    public Device setModel(String model) { this.model = model; return this; }
} 