package com.tong.copilotdemo;

import com.google.common.collect.Lists;
import com.tong.copilotdemo.domain.CreateOrderInVo;
import com.tong.copilotdemo.domain.OrderOutVo;
import com.tong.copilotdemo.domain.order.ApplicationContextVo;
import com.tong.copilotdemo.domain.order.purchaseUnites.AmountVo;
import com.tong.copilotdemo.domain.order.purchaseUnites.PurchaseUnitsVo;
import com.tong.copilotdemo.service.IPaypalService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by tong on 2023/05/31
 */
// create a junit test class name "ServiceTest", and add a test method named "testCreateOrder"
public class ServiceTest extends CopilotDemoApplicationTests {

    @Autowired
    private IPaypalService paypalService;

    // text createOrder use paypalService.createOrder
    @Test
    void createOrder() {
        // create a createOrderInVo object, and set some value
        CreateOrderInVo createOrderInVo = new CreateOrderInVo();
        // create a PurchaseUnitsVo object, and set some value
        PurchaseUnitsVo purchaseUnitsVo = new PurchaseUnitsVo();
        // set purchaseUnitsVo to createOrderInVo
        createOrderInVo.setPurchaseUnits(Lists.newArrayList(purchaseUnitsVo));
        // create a AmountVo object, and set some value
        AmountVo amountVo = new AmountVo();
        amountVo.setCurrencyCode("USD");
        amountVo.setValue("100.00");
        // set amountVo to purchaseUnitsVo
        purchaseUnitsVo.setAmount(amountVo);
        // set purchaseUnitsVo to createOrderInVo
        createOrderInVo.setPurchaseUnits(Lists.newArrayList(purchaseUnitsVo));
        // set application_context object, and set some value
        createOrderInVo.setApplicationContext(new ApplicationContextVo());
        createOrderInVo.getApplicationContext().setReturnUrl("https://www.baidu.com");
        createOrderInVo.getApplicationContext().setCancelUrl("https://www.baidu.com");
        // set intent to createOrderInVo
        createOrderInVo.setIntent("CAPTURE");
        // use paypalService.createOrder, and assert it
        OrderOutVo order = paypalService.createOrder(createOrderInVo);
        System.out.println(order);



    }


}
