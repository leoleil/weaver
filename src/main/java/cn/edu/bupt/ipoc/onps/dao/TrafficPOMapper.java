package cn.edu.bupt.ipoc.onps.dao;

import cn.edu.bupt.ipoc.onps.model.po.TrafficPO;
import cn.edu.bupt.ipoc.onps.model.po.TrafficPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TrafficPOMapper {
    int countByExample(TrafficPOExample example);

    int deleteByExample(TrafficPOExample example);

    int deleteByPrimaryKey(String id);

    int insert(TrafficPO record);

    int insertSelective(TrafficPO record);

    List<TrafficPO> selectByExample(TrafficPOExample example);

    TrafficPO selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TrafficPO record, @Param("example") TrafficPOExample example);

    int updateByExample(@Param("record") TrafficPO record, @Param("example") TrafficPOExample example);

    int updateByPrimaryKeySelective(TrafficPO record);

    int updateByPrimaryKey(TrafficPO record);
}