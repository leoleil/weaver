package cn.edu.bupt.ipoc.onps.dao;

import cn.edu.bupt.ipoc.onps.model.po.WavelengthPO;
import cn.edu.bupt.ipoc.onps.model.po.WavelengthPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WavelengthPOMapper {
    int countByExample(WavelengthPOExample example);

    int deleteByExample(WavelengthPOExample example);

    int deleteByPrimaryKey(String id);

    int insert(WavelengthPO record);

    int insertSelective(WavelengthPO record);

    List<WavelengthPO> selectByExample(WavelengthPOExample example);

    WavelengthPO selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") WavelengthPO record, @Param("example") WavelengthPOExample example);

    int updateByExample(@Param("record") WavelengthPO record, @Param("example") WavelengthPOExample example);

    int updateByPrimaryKeySelective(WavelengthPO record);

    int updateByPrimaryKey(WavelengthPO record);
}