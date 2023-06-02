package com.tong.copilotdemo.domain.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tong.copilotdemo.domain.order.purchaseUnites.AmountVo;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Create by tong on 2022/10/14
 */
@Data
@Accessors(chain = true)
public class SellerReceivableBreakdownVo {

    @JsonProperty(value = "gross_amount")
    private AmountVo grossAmount;
    @JsonProperty(value = "paypal_fee")
    private AmountVo paypalFee;
    @JsonProperty(value = "platform_fees")
    private PlatformFeesVo platformFees;
    @JsonProperty(value = "net_amount")
    private AmountVo netAmount;

}
