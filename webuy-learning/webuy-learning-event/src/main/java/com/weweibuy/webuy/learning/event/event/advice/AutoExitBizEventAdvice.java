package com.weweibuy.webuy.learning.event.event.advice;

import com.weweibuy.webuy.learning.event.event.context.EventContext;
import com.weweibuy.webuy.learning.event.event.store.EventStore;
import com.weweibuy.webuy.learning.event.model.po.BizEvent;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

/**
 * @author durenhao
 * @date 2019/10/27 20:02
 **/
@Slf4j
@Component
public class AutoExitBizEventAdvice implements BizEventAdvice {


    @Override
    public Object process(EventContext context, Object event, ProceedingJoinPoint joinPoint, BizEventAdviceChain chain) throws Throwable {
        log.info("AutoExitBizEventAdvice  is running .... ");
        Object o = chain.doProcess(context, event, joinPoint);
        EventStore eventStore = context.getEventStore();
        EventContext.CurrentEvent currentEvent = context.getCurrentEvent();
        if (o instanceof BizEvent) {
            eventStore.exitEventAndAdd(currentEvent.getBizEvent(), (BizEvent) o);
        } else {
            eventStore.exitEvent(currentEvent.getBizEvent());
        }
        return o;
    }

    @Override
    public Integer getOrder() {
        return Integer.MAX_VALUE - 1;
    }
}
