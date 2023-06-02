package com.tong.copilotdemo.domain.capturedPaymentDetails;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tong.copilotdemo.domain.order.purchaseUnites.AmountVo;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Created by tong on 2022/10/05
 */
@Data
@Accessors(chain = true)
public class SellerPayableBreakdownVo {

    @JsonProperty(value = "gross_amount")
    private AmountVo grossAmount;
    @JsonProperty(value = "paypal_fee")
    private AmountVo paypalFee;
    @JsonProperty(value = "net_amount")
    private AmountVo netAmount;
    @JsonProperty(value = "total_refunded_amount")
    private AmountVo totalRefundedAmount;

}
