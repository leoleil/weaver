package cn.edu.bupt.ipoc.onps.dao;

import cn.edu.bupt.ipoc.onps.model.po.PermisstionPO;
import cn.edu.bupt.ipoc.onps.model.po.PermisstionPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PermisstionPOMapper {
    int countByExample(PermisstionPOExample example);

    int deleteByExample(PermisstionPOExample example);

    int deleteByPrimaryKey(String id);

    int insert(PermisstionPO record);

    int insertSelective(PermisstionPO record);

    List<PermisstionPO> selectByExample(PermisstionPOExample example);

    PermisstionPO selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PermisstionPO record, @Param("example") PermisstionPOExample example);

    int updateByExample(@Param("record") PermisstionPO record, @Param("example") PermisstionPOExample example);

    int updateByPrimaryKeySelective(PermisstionPO record);

    int updateByPrimaryKey(PermisstionPO record);
}