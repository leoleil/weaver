package cn.edu.bupt.ipoc.onps.utils;

import cn.edu.bupt.ipoc.onps.dao.UserDAO;
import cn.edu.bupt.ipoc.onps.dao.UserPOMapper;
import cn.edu.bupt.ipoc.onps.model.po.UserHasRolePOExample;
import cn.edu.bupt.ipoc.onps.model.po.UserPO;
import cn.edu.bupt.ipoc.onps.model.po.UserPOExample;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import javax.annotation.Resource;
import java.util.List;

public class MyShiro extends AuthorizingRealm {
    private UserPO user;

    @Resource
    private UserPOMapper userPOMapper;
    @Resource
    private UserDAO userDAO;

    @Override
    public String getName() {
        return "myShrio";
    }

    /**
     * 执行授权逻辑
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("进入授权逻辑");
        UserPO user =(UserPO) principalCollection.getPrimaryPrincipal();
        this.user = user;
        if(user == null){
            return null;
        }
        UserHasRolePOExample userHasRolePOExample = new UserHasRolePOExample();
        userHasRolePOExample.createCriteria().andUserIdEqualTo(user.getId());
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        List<String> roleList = userDAO.selectRoleByUserId(user.getId());
        List<String> permissionList = userDAO.selectPermissionByUserId(user.getId());
        if(roleList != null){
            for (String role: roleList
            ) {
                info.addRole(role);
            }
        }
        if(permissionList != null){
            for (String permission: permissionList
            ) {
                info.addStringPermission(permission);
            }
        }
        return info;
    }

    /**
     * 执行认证逻辑
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.println("进入身份认证");
        //判断用户名
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        UserPOExample userPOExample = new UserPOExample();
        userPOExample.createCriteria().andNameEqualTo(token.getUsername());
        List<UserPO> userPOs = userPOMapper.selectByExample(userPOExample);
        if(userPOs == null || userPOs.size() == 0){
            return null;//用户不存在返回null
        }
        UserPO user = userPOs.get(0);
        //判断密码
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(user,user.getPassword(),getName());
        return info;
    }
    public UserPO getPrimaryPrincipal(){
        return user;
    }
}
