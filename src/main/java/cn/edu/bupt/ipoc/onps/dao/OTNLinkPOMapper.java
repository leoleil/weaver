package cn.edu.bupt.ipoc.onps.dao;

import cn.edu.bupt.ipoc.onps.model.po.OTNLinkPO;
import cn.edu.bupt.ipoc.onps.model.po.OTNLinkPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OTNLinkPOMapper {
    int countByExample(OTNLinkPOExample example);

    int deleteByExample(OTNLinkPOExample example);

    int deleteByPrimaryKey(String otnLinkId);

    int insert(OTNLinkPO record);

    int insertSelective(OTNLinkPO record);

    List<OTNLinkPO> selectByExample(OTNLinkPOExample example);

    OTNLinkPO selectByPrimaryKey(String otnLinkId);

    int updateByExampleSelective(@Param("record") OTNLinkPO record, @Param("example") OTNLinkPOExample example);

    int updateByExample(@Param("record") OTNLinkPO record, @Param("example") OTNLinkPOExample example);

    int updateByPrimaryKeySelective(OTNLinkPO record);

    int updateByPrimaryKey(OTNLinkPO record);
}