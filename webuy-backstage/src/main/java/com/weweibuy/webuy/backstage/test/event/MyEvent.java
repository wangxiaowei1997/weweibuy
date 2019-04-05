package com.weweibuy.webuy.backstage.test.event;

import lombok.Data;
import org.springframework.context.ApplicationEvent;

/**
 * @ClassName MyEvent
 * @Description
 * @Author durenhao
 * @Date 2019/3/16 21:04
 **/
@Data
public class MyEvent extends ApplicationEvent {

    private String name = "zhangsan";

    public MyEvent(Object source) {
        super(source);
    }
}
