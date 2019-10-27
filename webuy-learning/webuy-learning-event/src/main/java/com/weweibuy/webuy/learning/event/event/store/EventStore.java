package com.weweibuy.webuy.learning.event.event.store;

import com.weweibuy.webuy.learning.event.model.po.BizEvent;

import java.util.List;

/**
 * @author durenhao
 * @date 2019/10/26 20:14
 **/
public interface EventStore {

    List<BizEvent> get(Object... args);

    Integer exitEvent(BizEvent bizEvent);

    void exitEventAndAdd(BizEvent bizEvent, BizEvent bizEvent1);

}