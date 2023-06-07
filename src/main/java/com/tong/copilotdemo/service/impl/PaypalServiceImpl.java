package com.tong.copilotdemo.service.impl;

import com.tong.copilotdemo.constant.Constant;
import com.tong.copilotdemo.domain.CreateOrderInVo;
import com.tong.copilotdemo.domain.OrderOutVo;
import com.tong.copilotdemo.service.IPaypalService;
import com.tong.copilotdemo.util.HttpUtils;
import com.tong.copilotdemo.util.JsonUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;

/**
 * Created by tong on 2023/06/06
 */
public class PaypalServiceImpl implements IPaypalService {

    @Override
    public OrderOutVo createOrder(CreateOrderInVo createOrderInVo) {
        // use http post, get the result from server, and convert it to OrderOutVo
        try {
            String result = HttpUtils.httpPost(Constant.CREATE_ORDER, JsonUtils.obj2json(createOrderInVo)).orElse("");
            if (StringUtils.isEmpty(result)) {
                return null;
            }
            return JsonUtils.json2obj(result, OrderOutVo.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public OrderOutVo showOrderDetails(String orderId) {
        // use http post, get the result from server, and convert it to OrderOutVo
        return null;
    }

}
