package com.tong.copilotdemo.domain.refund;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tong.copilotdemo.domain.order.purchaseUnites.AmountVo;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Created by tong on 2022/10/05
 */
@Data
@Accessors(chain = true)
public class RefundCapturedPaymentsBodyVo {

    private AmountVo amount;
    @JsonProperty(value = "note_to_payer")
    private String noteToPayer;

}
