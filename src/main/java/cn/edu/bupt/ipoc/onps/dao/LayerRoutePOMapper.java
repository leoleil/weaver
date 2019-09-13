package cn.edu.bupt.ipoc.onps.dao;

import cn.edu.bupt.ipoc.onps.model.po.LayerRoutePO;
import cn.edu.bupt.ipoc.onps.model.po.LayerRoutePOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LayerRoutePOMapper {
    int countByExample(LayerRoutePOExample example);

    int deleteByExample(LayerRoutePOExample example);

    int deleteByPrimaryKey(String id);

    int insert(LayerRoutePO record);

    int insertSelective(LayerRoutePO record);

    List<LayerRoutePO> selectByExample(LayerRoutePOExample example);

    LayerRoutePO selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") LayerRoutePO record, @Param("example") LayerRoutePOExample example);

    int updateByExample(@Param("record") LayerRoutePO record, @Param("example") LayerRoutePOExample example);

    int updateByPrimaryKeySelective(LayerRoutePO record);

    int updateByPrimaryKey(LayerRoutePO record);
}