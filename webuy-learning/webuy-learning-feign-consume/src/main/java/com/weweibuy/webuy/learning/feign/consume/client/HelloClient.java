package com.weweibuy.webuy.learning.feign.consume.client;

import com.weweibuy.webuy.common.model.dto.CommonDataJsonResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author durenhao
 * @date 2019/12/24 21:42
 **/
@FeignClient(value = "learning-feign-provider")
public interface HelloClient {

    @GetMapping("/hello")
    CommonDataJsonResponse<String> hello();


    @PostMapping("/hello")
    CommonDataJsonResponse<String> helloPost(@RequestHeader(value = "token") String token,
                                             CommonDataJsonResponse commonJsonResponse,
                                         @RequestParam("sign") String sign);


}
