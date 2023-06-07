package com.tong.copilotdemo.service;

import com.tong.copilotdemo.domain.CreateOrderInVo;
import com.tong.copilotdemo.domain.OrderOutVo;

/**
 * Created by tong on 2023/05/31
 */
public interface IPaypalService {

    // 根据https://developer.paypal.com/api/rest/，生成接口
    //- createOrder：下单接口，使用
    //- showOrderDetails：支付查询接口
    //- captureOrderPayment：收款接口
    //- capturedPaymentDetails：收款查询接口
    //- refundCapturedPayment：退款接口
    //- refundDetails：退款查询接口


     // create some code below, for public method named 'createOrder', input in CreateOrderInVo, output in OrderOutVo
    OrderOutVo createOrder(CreateOrderInVo createOrderInVo);

    // crete some code below, for public method named 'showOrderDetails', input in String, output in OrderOutVo







}
