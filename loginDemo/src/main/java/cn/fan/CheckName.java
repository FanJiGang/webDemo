package cn.fan;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

public class CheckName {
    public static boolean check(String username){
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        QueryRunner qr = new QueryRunner(dataSource);
        String dql="select * from t_user where user_name=?";
        User user=null;
        try {
            user = qr.query(dql, new BeanHandler<User>(User.class), username);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user==null;

    }
}
