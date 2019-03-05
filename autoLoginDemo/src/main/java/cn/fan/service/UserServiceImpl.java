package cn.fan.service;

import cn.fan.dao.UserDao;
import cn.fan.dao.UserDaoImpl;
import cn.fan.entity.User;
import cn.fan.utils.NoteResult;

import java.sql.SQLException;

/**
 * 与用户表相关的业务操作
 */
public class UserServiceImpl implements UserService {

    private static UserDao dao;
    static{
        dao=new UserDaoImpl();
    }

    /*
     * 验证登录是否成功
     * status-0: 验证通过,登录成功
     * status-1: 验证失败,用户名不存在
     * status-2: 验证失败,密码错误
     */
    @Override
    public NoteResult<User> login(String username, String password) {
        NoteResult<User> result = new NoteResult<>();
        try {
            User user = dao.findByName(username);
            if (user == null) {
                result.setStatus(1);
                result.setMsg("用户名不存在");
            } else if (user.getUser_password().equals(password)) {
                result.setStatus(0);
                result.setMsg("登录成功");
                result.setData(user);
            } else {
                result.setStatus(2);
                result.setMsg("密码错误");
            }
            return result;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("登录验证操作出现异常");
        }
    }
}
