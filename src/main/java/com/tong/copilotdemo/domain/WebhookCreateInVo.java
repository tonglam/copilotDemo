package com.tong.copilotdemo.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tong.copilotdemo.domain.webhook.EventTypeVo;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * Create by tong on 2022/10/14
 */
@Data
@Accessors(chain = true)
public class WebhookCreateInVo {

    private String id;
    private String url;
    @JsonProperty(value = "event_types")
    private List<EventTypeVo> eventTypes;

}
