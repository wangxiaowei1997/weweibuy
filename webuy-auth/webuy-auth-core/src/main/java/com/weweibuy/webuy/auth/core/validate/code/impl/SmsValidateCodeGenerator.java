package com.weweibuy.webuy.auth.core.validate.code.impl;

import com.weweibuy.webuy.auth.core.config.properties.SecurityProperties;
import com.weweibuy.webuy.auth.core.model.vo.ValidateCode;
import com.weweibuy.webuy.auth.core.validate.code.ValidateCodeGenerator;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName SmsValidateCodeGenerator
 * @Description
 * @Author durenhao
 * @Date 2018/12/16 9:42
 **/
@Component
public class SmsValidateCodeGenerator implements ValidateCodeGenerator {

    @Autowired
    private SecurityProperties securityProperties;

    @Override
    public ValidateCode generator() {
        return new ValidateCode(RandomStringUtils.randomNumeric(securityProperties.getValidateCode().getLength()),
                securityProperties.getValidateCode().getExpireTime());
    }
}
