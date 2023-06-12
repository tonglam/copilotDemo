// create a model class here
// create a model class called WebhookVerifyInVo.java with webhookId, transmission_id, transmission_time, transmission_sig, cert_url, auth_algo, webhook_event
 package com.tong.copilotdemo.domain;

 import lombok.Data;

 /**
  * Created by tong on 2023/06/07
  */
 @Data
 public class WebhookVerifyInVo {

     private String webhookId;

     private String transmissionId;

     private String transmissionTime;

     private String transmissionSig;

     private String certUrl;

     private String authAlgo;

     private String webhookEvent;
     
     public WebhookVerifyInVo() {
     }
     
     public String getWebhookId() {
         return webhookId;
     }
     
     public void setWebhookId(String webhookId) {
         this.webhookId = webhookId;
     }
     
     public String getTransmissionId() {
         return transmissionId;
     }
     
     public void setTransmissionId(String transmissionId) {
         this.transmissionId = transmissionId;
     }
     
}