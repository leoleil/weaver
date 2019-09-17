package cn.edu.bupt.ipoc.onps.controller;

import cn.edu.bupt.ipoc.onps.utils.resultUtils.BaseResult;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping(value = "/user")
public class UserLoginController {

    @RequestMapping(value = "/login")
    @ResponseBody
    public BaseResult<Object> login(String userName, String password){
        //1.获取Subject
        Subject subject = SecurityUtils.getSubject();
        //先把上一个用户退出了（如果这个会话没结束的话）
        subject.logout();
        //2.封装用户数据
        UsernamePasswordToken token = new UsernamePasswordToken(userName,password);
        //3.执行登录操作
        try{
            subject.login(token);

            return BaseResult.createSuccessResult("success");
        }catch (UnknownAccountException e){
            //登录失败 用户名不存在
            System.err.println("用户名不存在");

            return BaseResult.createFailResult("用户名或者密码错误");
        }catch (IncorrectCredentialsException e){
            //登录失败 密码错误
            System.err.println("密码错误");
            return BaseResult.createFailResult("用户名或者密码错误");
        }
    }
    @RequestMapping(value = "/logout")
    @ResponseBody
    public BaseResult<String> logout(){
        //1.获取Subject
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        return BaseResult.createSuccessResult("登出成功");
    }

}
