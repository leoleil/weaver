package cn.edu.bupt.ipoc.onps.dao;

import cn.edu.bupt.ipoc.onps.model.po.TimeslotPO;
import cn.edu.bupt.ipoc.onps.model.po.TimeslotPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TimeslotPOMapper {
    int countByExample(TimeslotPOExample example);

    int deleteByExample(TimeslotPOExample example);

    int deleteByPrimaryKey(String timeslotId);

    int insert(TimeslotPO record);

    int insertSelective(TimeslotPO record);

    List<TimeslotPO> selectByExample(TimeslotPOExample example);

    TimeslotPO selectByPrimaryKey(String timeslotId);

    int updateByExampleSelective(@Param("record") TimeslotPO record, @Param("example") TimeslotPOExample example);

    int updateByExample(@Param("record") TimeslotPO record, @Param("example") TimeslotPOExample example);

    int updateByPrimaryKeySelective(TimeslotPO record);

    int updateByPrimaryKey(TimeslotPO record);
}