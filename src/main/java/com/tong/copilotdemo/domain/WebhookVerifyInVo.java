package com.tong.copilotdemo.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WebhookVerifyInVo {

    @JsonProperty(value = "webhook_id")
    private String webhookId;
    @JsonProperty(value = "transmission_id")
    private String transmissionId;
    @JsonProperty(value = "transmission_time")
    private String transmissionTime;
    @JsonProperty(value = "transmission_sig")
    private String transmissionSig;
    @JsonProperty(value = "cert_url")
    private String certUrl;
    @JsonProperty(value = "auth_algo")
    private String authAlgo;
    @JsonProperty(value = "webhook_event")
    private WebhookEventDataVo webhookEvent;

    // define constructor, getter and setter for all the fields of this class

    public String getWebhookId() {
        return webhookId;
    }

    public void setWebhookId(String webhookId) {
        this.webhookId = webhookId;
    }

    // transmissionId
    public String getTransmissionId() {
        return transmissionId;
    }

    // transmissionTime
    public


}
