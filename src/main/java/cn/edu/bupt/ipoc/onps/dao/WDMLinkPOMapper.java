package cn.edu.bupt.ipoc.onps.dao;

import cn.edu.bupt.ipoc.onps.model.po.WDMLinkPO;
import cn.edu.bupt.ipoc.onps.model.po.WDMLinkPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WDMLinkPOMapper {
    int countByExample(WDMLinkPOExample example);

    int deleteByExample(WDMLinkPOExample example);

    int deleteByPrimaryKey(String wdmLinkId);

    int insert(WDMLinkPO record);

    int insertSelective(WDMLinkPO record);

    List<WDMLinkPO> selectByExample(WDMLinkPOExample example);

    WDMLinkPO selectByPrimaryKey(String wdmLinkId);

    int updateByExampleSelective(@Param("record") WDMLinkPO record, @Param("example") WDMLinkPOExample example);

    int updateByExample(@Param("record") WDMLinkPO record, @Param("example") WDMLinkPOExample example);

    int updateByPrimaryKeySelective(WDMLinkPO record);

    int updateByPrimaryKey(WDMLinkPO record);
}