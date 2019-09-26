package cn.edu.bupt.ipoc.onps.dao;

import cn.edu.bupt.ipoc.onps.model.po.NodePO;
import cn.edu.bupt.ipoc.onps.model.po.NodePOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NodePOMapper {
    int countByExample(NodePOExample example);

    int deleteByExample(NodePOExample example);

    int deleteByPrimaryKey(String nodeId);

    int insert(NodePO record);

    int insertSelective(NodePO record);

    List<NodePO> selectByExample(NodePOExample example);

    NodePO selectByPrimaryKey(String nodeId);

    int updateByExampleSelective(@Param("record") NodePO record, @Param("example") NodePOExample example);

    int updateByExample(@Param("record") NodePO record, @Param("example") NodePOExample example);

    int updateByPrimaryKeySelective(NodePO record);

    int updateByPrimaryKey(NodePO record);
}