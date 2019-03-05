package cn.fan.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class C3P0utils {
    private static ComboPooledDataSource cpds =new ComboPooledDataSource();

    public static ComboPooledDataSource getDataSource(){
        return cpds;
    }

}
