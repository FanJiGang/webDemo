package cn.fan.dao;

import cn.fan.entity.CityBean;
import cn.fan.utils.C3P0utils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class CityDaoImpl implements CityDao {
    @Override
    public List<CityBean> findCities(int pid) throws SQLException {
        QueryRunner qr = new QueryRunner(C3P0utils.getDataSource());
        String dql="select * from city where pid=?";
        return qr.query(dql,new BeanListHandler<CityBean>(CityBean.class),pid);
    }
}
