package com.qingao.mgj.mapper;

import com.qingao.mgj.pojo.Areainfo;
import com.qingao.mgj.pojo.AreainfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface AreainfoMapper {
    long countByExample(AreainfoExample example);

    int deleteByExample(AreainfoExample example);

    int deleteByPrimaryKey(Integer aid);

    int insert(Areainfo record);

    int insertSelective(Areainfo record);

    List<Areainfo> selectByExampleWithRowbounds(AreainfoExample example, RowBounds rowBounds);

    List<Areainfo> selectByExample(AreainfoExample example);

    Areainfo selectByPrimaryKey(Integer aid);

    int updateByExampleSelective(@Param("record") Areainfo record, @Param("example") AreainfoExample example);

    int updateByExample(@Param("record") Areainfo record, @Param("example") AreainfoExample example);

    int updateByPrimaryKeySelective(Areainfo record);

    int updateByPrimaryKey(Areainfo record);
}