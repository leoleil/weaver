package cn.edu.bupt.ipoc.onps.dao;

import cn.edu.bupt.ipoc.onps.model.po.FiberLinkPO;
import cn.edu.bupt.ipoc.onps.model.po.FiberLinkPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FiberLinkPOMapper {
    int countByExample(FiberLinkPOExample example);

    int deleteByExample(FiberLinkPOExample example);

    int deleteByPrimaryKey(String id);

    int insert(FiberLinkPO record);

    int insertSelective(FiberLinkPO record);

    List<FiberLinkPO> selectByExample(FiberLinkPOExample example);

    FiberLinkPO selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") FiberLinkPO record, @Param("example") FiberLinkPOExample example);

    int updateByExample(@Param("record") FiberLinkPO record, @Param("example") FiberLinkPOExample example);

    int updateByPrimaryKeySelective(FiberLinkPO record);

    int updateByPrimaryKey(FiberLinkPO record);
}