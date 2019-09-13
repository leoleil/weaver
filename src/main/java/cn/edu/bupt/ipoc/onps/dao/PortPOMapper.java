package cn.edu.bupt.ipoc.onps.dao;

import cn.edu.bupt.ipoc.onps.model.po.PortPO;
import cn.edu.bupt.ipoc.onps.model.po.PortPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PortPOMapper {
    int countByExample(PortPOExample example);

    int deleteByExample(PortPOExample example);

    int deleteByPrimaryKey(String id);

    int insert(PortPO record);

    int insertSelective(PortPO record);

    List<PortPO> selectByExample(PortPOExample example);

    PortPO selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PortPO record, @Param("example") PortPOExample example);

    int updateByExample(@Param("record") PortPO record, @Param("example") PortPOExample example);

    int updateByPrimaryKeySelective(PortPO record);

    int updateByPrimaryKey(PortPO record);
}