package cn.edu.bupt.ipoc.onps.dao;

import java.util.List;

public interface UserDAO {
    List<String> selectRoleByUserId(String id);
    List<String> selectPermissionByUserId(String id);

}
