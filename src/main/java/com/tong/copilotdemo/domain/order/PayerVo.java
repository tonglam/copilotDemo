package com.tong.copilotdemo.domain.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tong.copilotdemo.domain.order.paymentSource.payapl.AddressVo;
import com.tong.copilotdemo.domain.order.paymentSource.payapl.NameVo;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Created by tong on 2022/10/05
 */
@Data
@Accessors(chain = true)
public class PayerVo {

    private NameVo name;
    @JsonProperty(value = "email_address")
    private String emailAddress;
    @JsonProperty(value = "payer_id")
    private String payerId;
    private AddressVo address;

}
