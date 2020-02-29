package com.weweibuy.webuy.auth.security;

import com.weweibuy.webuy.auth.core.config.eum.LoginResponseType;
import com.weweibuy.webuy.auth.core.config.properties.SecurityProperties;
import com.weweibuy.webuy.common.utils.JackJsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 登录失败的处理方法
 * @ClassName Ifsdf
 * @Description
 * @Author durenhao
 * @Date 2018/12/15 20:09
 **/
@Component
public class IAuthenticationFailureHandler extends SimpleUrlAuthenticationFailureHandler {

    @Autowired
    private SecurityProperties securityProperties;

    @Override
    public void onAuthenticationFailure(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
                                        AuthenticationException e) throws IOException, ServletException {
        if(LoginResponseType.REDIRECT.equals(securityProperties.getLoginResponseType())){
            super.onAuthenticationFailure(httpServletRequest, httpServletResponse, e);
        }else {
            httpServletResponse.setContentType("application/json;charset=UTF-8");
            httpServletResponse.getWriter().write(JackJsonUtils.write(e.getMessage()));
        }
    }
}
