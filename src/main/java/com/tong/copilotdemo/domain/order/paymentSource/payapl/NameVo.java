package com.tong.copilotdemo.domain.order.paymentSource.payapl;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Created by tong on 2022/10/05
 */
@Data
@Accessors(chain = true)
public class NameVo {

    @JsonProperty(value = "given_name")
    private String givenName;
    private String surname;

}
