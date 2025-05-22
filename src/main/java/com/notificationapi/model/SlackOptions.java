package com.notificationapi.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SlackOptions {
    @JsonProperty("text")
    private String text;
    @JsonProperty("blocks")
    private Object blocks;

    public String getText() { return text; }
    public SlackOptions setText(String text) { this.text = text; return this; }
    public Object getBlocks() { return blocks; }
    public SlackOptions setBlocks(Object blocks) { this.blocks = blocks; return this; }
} 