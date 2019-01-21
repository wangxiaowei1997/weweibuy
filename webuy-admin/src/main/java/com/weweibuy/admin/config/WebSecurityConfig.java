//package com.weweibuy.admin.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.UserDetailsService;
//
///**
// * @ClassName WebSecurityConfig
// * @Description
// * @Author durenhao
// * @Date 2019/1/21 23:28
// **/
//@Configuration
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Autowired
//    private UserDetailsService userDetailsService;
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(userDetailsService);
//    }
//
//    @Override
//    public void configure(WebSecurity web) throws Exception {
//        //忽略css.jq.img等文件
//        web.ignoring().antMatchers("/**.html","/**.css", "/img/**", "/**.js","/third-party/**");
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//
//        http
//                .csrf().disable() //HTTP with Disable CSRF
//                .authorizeRequests() //Authorize Request Configuration
//                .antMatchers( "/login",
//                        "/api/**",
//                        "/**/heapdump",
//                        "/**/loggers",
//                        "/**/liquibase",
//                        "/**/logfile",
//                        "/**/flyway",
//                        "/**/auditevents",
//                        "/**/jolokia").permitAll() //放开"/api/**"：为了给被监控端免登录注册并解决Log与Logger冲突
//                .and()
//                .authorizeRequests()
//                .antMatchers("/**").hasRole("USER")
//                .antMatchers("/**").authenticated()
//                .and() //Login Form configuration for all others
//                .formLogin()
//                .loginPage("/login.html")
//                .loginProcessingUrl("/login").permitAll()
//                .defaultSuccessUrl("/")
//                .and() //Logout Form configuration
//                .logout()
//                .deleteCookies("remove")
//                .logoutSuccessUrl("/login.html").permitAll()
//                .and()
//                .httpBasic().disable();
//    }
//
//}
