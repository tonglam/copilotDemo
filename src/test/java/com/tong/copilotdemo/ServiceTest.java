package com.tong.copilotdemo;

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

    @Test
    void testCreateOrder(){
        this.paypalService.createOrder();
    }

}
