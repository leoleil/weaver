package cn.edu.bupt.ipoc.onps.dao;

import cn.edu.bupt.ipoc.onps.model.po.UserHasRolePO;
import cn.edu.bupt.ipoc.onps.model.po.UserHasRolePOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserHasRolePOMapper {
    int countByExample(UserHasRolePOExample example);

    int deleteByExample(UserHasRolePOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserHasRolePO record);

    int insertSelective(UserHasRolePO record);

    List<UserHasRolePO> selectByExample(UserHasRolePOExample example);

    UserHasRolePO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserHasRolePO record, @Param("example") UserHasRolePOExample example);

    int updateByExample(@Param("record") UserHasRolePO record, @Param("example") UserHasRolePOExample example);

    int updateByPrimaryKeySelective(UserHasRolePO record);

    int updateByPrimaryKey(UserHasRolePO record);
}