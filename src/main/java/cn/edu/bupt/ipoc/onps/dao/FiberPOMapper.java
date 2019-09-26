package cn.edu.bupt.ipoc.onps.dao;

import cn.edu.bupt.ipoc.onps.model.po.FiberPO;
import cn.edu.bupt.ipoc.onps.model.po.FiberPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FiberPOMapper {
    int countByExample(FiberPOExample example);

    int deleteByExample(FiberPOExample example);

    int deleteByPrimaryKey(String fiberId);

    int insert(FiberPO record);

    int insertSelective(FiberPO record);

    List<FiberPO> selectByExample(FiberPOExample example);

    FiberPO selectByPrimaryKey(String fiberId);

    int updateByExampleSelective(@Param("record") FiberPO record, @Param("example") FiberPOExample example);

    int updateByExample(@Param("record") FiberPO record, @Param("example") FiberPOExample example);

    int updateByPrimaryKeySelective(FiberPO record);

    int updateByPrimaryKey(FiberPO record);
}