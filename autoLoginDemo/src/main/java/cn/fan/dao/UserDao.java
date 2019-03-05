package cn.fan.dao;

import cn.fan.entity.User;

import java.sql.SQLException;

/**
 * 与用户表相关的数据库操作
 */
public interface UserDao {

    //根据用户名查询用户信息
    User findByName(String username) throws SQLException;
}
