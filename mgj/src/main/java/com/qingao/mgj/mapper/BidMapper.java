package com.qingao.mgj.mapper;

import com.qingao.mgj.pojo.Bid;
import com.qingao.mgj.pojo.BidExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface BidMapper {
    long countByExample(BidExample example);

    int deleteByExample(BidExample example);

    int deleteByPrimaryKey(Integer bid);

    int insert(Bid record);

    int insertSelective(Bid record);

    List<Bid> selectByExampleWithRowbounds(BidExample example, RowBounds rowBounds);

    List<Bid> selectByExample(BidExample example);

    Bid selectByPrimaryKey(Integer bid);

    int updateByExampleSelective(@Param("record") Bid record, @Param("example") BidExample example);

    int updateByExample(@Param("record") Bid record, @Param("example") BidExample example);

    int updateByPrimaryKeySelective(Bid record);

    int updateByPrimaryKey(Bid record);
}