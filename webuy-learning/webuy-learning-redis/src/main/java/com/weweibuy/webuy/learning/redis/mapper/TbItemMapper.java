package com.weweibuy.webuy.learning.redis.mapper;


import com.weweibuy.webuy.learning.redis.po.TbItem;
import com.weweibuy.webuy.learning.redis.po.TbItemExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbItemMapper {
    long countByExample(TbItemExample example);

    int deleteByExample(TbItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbItem record);

    int insertSelective(TbItem record);

    TbItem selectOneByExample(TbItemExample example);

    List<TbItem> selectByExample(TbItemExample example);

    TbItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbItem record, @Param("example") TbItemExample example);

    int updateByExample(@Param("record") TbItem record, @Param("example") TbItemExample example);

    int updateByPrimaryKeySelective(TbItem record);

    int updateByPrimaryKey(TbItem record);
}