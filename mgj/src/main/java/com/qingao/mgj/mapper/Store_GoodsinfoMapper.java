package com.qingao.mgj.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Select;

public interface Store_GoodsinfoMapper {
	
	String sql_goodsDetail="SELECT img.gimgid,goods.gdname,price.price "
			+ "FROM goodsinfo goods,goodsprice price,goodsimage img "
			+ "WHERE goods.gdid=price.gpid AND img.gdid=goods.gdid AND img.gimgid=#{gimgid}";
			 
	
	@Select("<script>"+sql_goodsDetail+"</script>")
	Map getGoodsinfo(Integer gimgid);
}
