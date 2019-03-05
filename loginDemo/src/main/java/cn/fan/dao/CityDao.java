package cn.fan.dao;

import cn.fan.entity.CityBean;

import java.sql.SQLException;
import java.util.List;

/**
 * 对数据库city表的相关操作
 */
public interface CityDao {
    //根据省份查询对应城市
    List<CityBean> findCities(int pid) throws SQLException;
}
