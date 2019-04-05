package com.weweibuy.webuy.auth.core.social.weixin.config;

import com.weweibuy.webuy.auth.core.config.properties.SecurityProperties;
import com.weweibuy.webuy.auth.core.config.properties.WeiXinProperties;
import com.weweibuy.webuy.auth.core.social.weixin.connection.WeiXinConnectionFactory;
import com.weweibuy.webuy.auth.core.view.WeiXinConnectionBindView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.social.config.annotation.ConnectionFactoryConfigurer;
import org.springframework.social.config.annotation.SocialConfigurerAdapter;
import org.springframework.social.connect.ConnectionFactory;
import org.springframework.web.servlet.View;

/**
 * @ClassName WeiWinConfig
 * @Description
 * @Author durenhao
 * @Date 2018/12/24 23:25
 **/
@Configuration
@ConditionalOnProperty(prefix = "webuy.security.social.weixin", name = "app-id")
public class WeiWinConfig extends SocialConfigurerAdapter {

    @Autowired
    private SecurityProperties securityProperties;

    @Override
    public void addConnectionFactories(ConnectionFactoryConfigurer configurer,
                                       Environment environment) {
        configurer.addConnectionFactory(createConnectionFactory());
    }

    public ConnectionFactory<?> createConnectionFactory() {
        WeiXinProperties weixin = securityProperties.getSocial().getWeixin();
        return new WeiXinConnectionFactory(weixin.getProviderId(), weixin.getAppId(),
                weixin.getAppSecurity());
    }

    @Bean("/connect/weixinConnected")
    @ConditionalOnMissingBean(name = "weixinConnectView")
    public View weixinConnectView(){
        return new WeiXinConnectionBindView();
    }
}
