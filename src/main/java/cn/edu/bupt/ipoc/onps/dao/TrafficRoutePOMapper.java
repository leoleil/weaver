package cn.edu.bupt.ipoc.onps.dao;

import cn.edu.bupt.ipoc.onps.model.po.TrafficRoutePO;
import cn.edu.bupt.ipoc.onps.model.po.TrafficRoutePOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TrafficRoutePOMapper {
    int countByExample(TrafficRoutePOExample example);

    int deleteByExample(TrafficRoutePOExample example);

    int deleteByPrimaryKey(String id);

    int insert(TrafficRoutePO record);

    int insertSelective(TrafficRoutePO record);

    List<TrafficRoutePO> selectByExample(TrafficRoutePOExample example);

    TrafficRoutePO selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TrafficRoutePO record, @Param("example") TrafficRoutePOExample example);

    int updateByExample(@Param("record") TrafficRoutePO record, @Param("example") TrafficRoutePOExample example);

    int updateByPrimaryKeySelective(TrafficRoutePO record);

    int updateByPrimaryKey(TrafficRoutePO record);
}