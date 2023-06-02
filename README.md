# Copilot演示DEMO
## 1. 项目介绍
本项目是一个基于Copilot的演示项目，用于演示Copilot的使用方法。
目标：通过Copilot生成的代码，实现paypal支付的六个主要接口：下单、下单查询、收款、收款查询、退款和退款查询，调通paypal支付原子接口并封装成应用接口。copilot实现controller层、api层、服务层、domain层和相关工具类。
## 2. 流程
### 2.1. 生成工具类：HttpClientUtil
### 2.2. 生成接口：IPaypalService，包括：
- createOrder：下单接口
- showOrderDetails：支付查询接口
- captureOrderPayment：收款接口
- capturedPaymentDetails：收款查询接口
- refundCapturedPayment：退款接口
- refundDetails：退款查询接口
### 2.3. 生成接口对应实现类：PaypalServiceImpl
### 2.4. 生成controller：PaypalController
### 2.5. 生成api：PaypalApi
### 2.6. 生成dao层
## 3. 单元测试
使用JUnit，创建并完成相关单元测试。