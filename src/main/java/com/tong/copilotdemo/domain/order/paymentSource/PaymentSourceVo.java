package com.tong.copilotdemo.domain.order.paymentSource;

import com.tong.copilotdemo.domain.order.paymentSource.payapl.PaypalVo;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Created by tong on 2022/10/05
 */
@Data
@Accessors(chain = true)
public class PaymentSourceVo {

    private PaypalVo paypal;

}
