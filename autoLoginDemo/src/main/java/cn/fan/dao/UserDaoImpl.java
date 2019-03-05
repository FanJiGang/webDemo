package cn.fan.dao;

import cn.fan.entity.User;
import cn.fan.utils.C3P0Utils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

/**
 * 与用户表相关的数据库操作
 */
public class UserDaoImpl implements UserDao {

    //根据用户名查询用户信息
    @Override
    public User findByName(String username) throws SQLException {
        QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
        String dql="select * from t_user where user_name=?";
        return qr.query(dql,new BeanHandler<User>(User.class),username);
    }
}
