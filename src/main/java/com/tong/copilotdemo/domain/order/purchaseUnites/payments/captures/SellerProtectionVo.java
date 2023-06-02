package com.tong.copilotdemo.domain.order.purchaseUnites.payments.captures;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Created by tong on 2022/10/05
 */
@Data
@Accessors(chain = true)
public class SellerProtectionVo {

    private String status;

}
