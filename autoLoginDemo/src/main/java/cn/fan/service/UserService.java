package cn.fan.service;

import cn.fan.entity.User;
import cn.fan.utils.NoteResult;

/**
 * 与用户表相关的业务操作
 */
public interface UserService {

    //验证登录是否成功
    NoteResult<User> login(String username,String password);
}
