package com.qingao.mgj.mapper;

import com.qingao.mgj.pojo.Store;
import com.qingao.mgj.pojo.StoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface StoreMapper {
    long countByExample(StoreExample example);

    int deleteByExample(StoreExample example);

    int deleteByPrimaryKey(Integer stid);

    int insert(Store record);

    int insertSelective(Store record);

    List<Store> selectByExampleWithRowbounds(StoreExample example, RowBounds rowBounds);

    List<Store> selectByExample(StoreExample example);

    Store selectByPrimaryKey(Integer stid);

    int updateByExampleSelective(@Param("record") Store record, @Param("example") StoreExample example);

    int updateByExample(@Param("record") Store record, @Param("example") StoreExample example);

    int updateByPrimaryKeySelective(Store record);

    int updateByPrimaryKey(Store record);
}