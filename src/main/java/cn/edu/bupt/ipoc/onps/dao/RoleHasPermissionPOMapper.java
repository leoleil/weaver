package cn.edu.bupt.ipoc.onps.dao;

import cn.edu.bupt.ipoc.onps.model.po.RoleHasPermissionPO;
import cn.edu.bupt.ipoc.onps.model.po.RoleHasPermissionPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleHasPermissionPOMapper {
    int countByExample(RoleHasPermissionPOExample example);

    int deleteByExample(RoleHasPermissionPOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RoleHasPermissionPO record);

    int insertSelective(RoleHasPermissionPO record);

    List<RoleHasPermissionPO> selectByExample(RoleHasPermissionPOExample example);

    RoleHasPermissionPO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RoleHasPermissionPO record, @Param("example") RoleHasPermissionPOExample example);

    int updateByExample(@Param("record") RoleHasPermissionPO record, @Param("example") RoleHasPermissionPOExample example);

    int updateByPrimaryKeySelective(RoleHasPermissionPO record);

    int updateByPrimaryKey(RoleHasPermissionPO record);
}