package cn.fan.service;

import cn.fan.dao.UserDao;
import cn.fan.dao.UserDaoImpl;
import cn.fan.entity.User;
import cn.fan.utils.C3P0Utils;
import cn.fan.utils.NoteResult;
import org.junit.Before;
import org.junit.Test;

import java.sql.SQLException;

public class UserTest {

    UserService service;

    @Before
    public void init(){
        service=new UserServiceImpl();
    }

    @Test
    public void testDataSources(){
        System.out.println(C3P0Utils.getDataSource());
    }
    @Test
    public void testFindByName() throws SQLException {
        UserDao  dao =new UserDaoImpl();
        User user = dao.findByName("张三");
        System.out.println("user = " + user);
    }

    @Test
    public void testLogin(){
        NoteResult<User> result = service.login("zhangsan", "123566");
        System.out.println(result);
    }
}
