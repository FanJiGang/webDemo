package cn.fan.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;

/**
 * 用于获取数据库连接池
 */
public class C3P0Utils {

    private static ComboPooledDataSource dataSource;

    public static DataSource getDataSource(){
        dataSource = new ComboPooledDataSource();
        return dataSource;
    }

}
