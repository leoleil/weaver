package cn.edu.bupt.ipoc.onps.dao;

import cn.edu.bupt.ipoc.onps.model.po.SDHLinkPO;
import cn.edu.bupt.ipoc.onps.model.po.SDHLinkPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SDHLinkPOMapper {
    int countByExample(SDHLinkPOExample example);

    int deleteByExample(SDHLinkPOExample example);

    int deleteByPrimaryKey(String sdhId);

    int insert(SDHLinkPO record);

    int insertSelective(SDHLinkPO record);

    List<SDHLinkPO> selectByExample(SDHLinkPOExample example);

    SDHLinkPO selectByPrimaryKey(String sdhId);

    int updateByExampleSelective(@Param("record") SDHLinkPO record, @Param("example") SDHLinkPOExample example);

    int updateByExample(@Param("record") SDHLinkPO record, @Param("example") SDHLinkPOExample example);

    int updateByPrimaryKeySelective(SDHLinkPO record);

    int updateByPrimaryKey(SDHLinkPO record);
}