package cn.edu.bupt.ipoc.onps.dao;

import cn.edu.bupt.ipoc.onps.model.po.OTUPO;
import cn.edu.bupt.ipoc.onps.model.po.OTUPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OTUPOMapper {
    int countByExample(OTUPOExample example);

    int deleteByExample(OTUPOExample example);

    int deleteByPrimaryKey(String otuId);

    int insert(OTUPO record);

    int insertSelective(OTUPO record);

    List<OTUPO> selectByExample(OTUPOExample example);

    OTUPO selectByPrimaryKey(String otuId);

    int updateByExampleSelective(@Param("record") OTUPO record, @Param("example") OTUPOExample example);

    int updateByExample(@Param("record") OTUPO record, @Param("example") OTUPOExample example);

    int updateByPrimaryKeySelective(OTUPO record);

    int updateByPrimaryKey(OTUPO record);
}