package cn.edu.bupt.ipoc.onps.dao;

import cn.edu.bupt.ipoc.onps.model.po.Network;
import cn.edu.bupt.ipoc.onps.model.po.NetworkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NetworkMapper {
    int countByExample(NetworkExample example);

    int deleteByExample(NetworkExample example);

    int deleteByPrimaryKey(String id);

    int insert(Network record);

    int insertSelective(Network record);

    List<Network> selectByExample(NetworkExample example);

    Network selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Network record, @Param("example") NetworkExample example);

    int updateByExample(@Param("record") Network record, @Param("example") NetworkExample example);

    int updateByPrimaryKeySelective(Network record);

    int updateByPrimaryKey(Network record);
}