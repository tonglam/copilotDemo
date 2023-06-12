package com.tong.copilotdemo.service.impl;

import com.tong.copilotdemo.constant.Constant;
import com.tong.copilotdemo.domain.CreateOrderInVo;
import com.tong.copilotdemo.domain.OrderOutVo;
import com.tong.copilotdemo.service.IPaypalService;
import com.tong.copilotdemo.util.HttpUtils;
import com.tong.copilotdemo.util.JsonUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * Created by tong on 2023/06/06
 */
@Service
public class PaypalServiceImpl implements IPaypalService {

    // use http post, get the result from server, and convert it to OrderOutVo
    @Override
    public OrderOutVo createOrder(CreateOrderInVo createOrderInVo) {
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

    // use http post, get the result from server, and convert it to OrderOutVo, use url: https://developer.paypal.com/api/orders/v2/#orders_get
    @Override
    public OrderOutVo showOrderDetails(String orderId) {
        try {
            String result = HttpUtils.httpGet(Constant.SHOW_ORDER_DETAIL + orderId).orElse("");
            if (StringUtils.isEmpty(result)) {
                return null;
            }
            return JsonUtils.json2obj(result, OrderOutVo.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    // use http post, get the result from server, and convert it to OrderOutVo, use url: https://developer.paypal.com/api/orders/v2/#orders_capture
    @Override
    public OrderOutVo captureOrderPayment(String orderId) {
        try {
            String result = HttpUtils.httpPost(Constant.CAPTURE_PAYMENT_FOR_ORDER + orderId + "/capture", "").orElse("");
            if (StringUtils.isEmpty(result)) {
                return null;
            }
            return JsonUtils.json2obj(result, OrderOutVo.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    // use http post, get the result from server, and convert it to OrderOutVo, use url: https://developer.paypal.com/api/orders/v2/#orders_get
    @Override
    public OrderOutVo capturedPaymentDetails(String orderId) {
        try {
            String result = HttpUtils.httpGet(Constant.SHOW_CAPTURED_PAYMENT_DETAILS + orderId).orElse("");
            if (StringUtils.isEmpty(result)) {
                return null;
            }
            return JsonUtils.json2obj(result, OrderOutVo.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    // use http post, get the result from server, and convert it to OrderOutVo, use url: https://developer.paypal.com/api/orders/v2/#orders_refund
    @Override
    public OrderOutVo refundCapturedPayment(String orderId) {
        try {
            String result = HttpUtils.httpPost(Constant.REFUND_CAPTURED_PAYMENT + orderId + "/refund", "").orElse("");
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
    public OrderOutVo refundDetails(String orderId) {
        return null;
    }

    // use http post, get the result from server, and convert it to OrderOutVo, use url: https://developer.paypal.com/api/orders/v2

}
