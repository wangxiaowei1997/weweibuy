package com.weweibuy.webuy.learning.event.annotation;

import org.springframework.context.event.EventListener;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author durenhao
 * @date 2019/9/22 13:11
 **/
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@EventListener
public @interface EventListenerWarp {

    String condition() default "";

    BlockHandler blockHandler() default @BlockHandler();

    boolean autoDelete() default true;

    boolean autoSave() default true;
}
