package com.weweibuy.webuy.product.service;

import com.weweibuy.webuy.common.dto.CommonJsonResponse;
import com.weweibuy.webuy.product.common.model.form.WebuyItemForm;
import com.weweibuy.webuy.product.common.model.po.WebuyItem;

/**
 * @ClassName ProductService
 * @Description
 * @Author durenhao
 * @Date 2019/2/6 19:30
 **/
public interface ProductService {

    WebuyItem getItemById(Long id);

    CommonJsonResponse addItem(WebuyItemForm item);

    CommonJsonResponse delItemById(Long id);

}
