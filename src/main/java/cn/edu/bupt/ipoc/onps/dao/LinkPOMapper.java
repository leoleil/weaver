package cn.edu.bupt.ipoc.onps.dao;

import cn.edu.bupt.ipoc.onps.model.po.LinkPO;
import cn.edu.bupt.ipoc.onps.model.po.LinkPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LinkPOMapper {
    int countByExample(LinkPOExample example);

    int deleteByExample(LinkPOExample example);

    int deleteByPrimaryKey(String linkId);

    int insert(LinkPO record);

    int insertSelective(LinkPO record);

    List<LinkPO> selectByExample(LinkPOExample example);

    LinkPO selectByPrimaryKey(String linkId);

    int updateByExampleSelective(@Param("record") LinkPO record, @Param("example") LinkPOExample example);

    int updateByExample(@Param("record") LinkPO record, @Param("example") LinkPOExample example);

    int updateByPrimaryKeySelective(LinkPO record);

    int updateByPrimaryKey(LinkPO record);
}