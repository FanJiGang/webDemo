package cn.fan.service;

import cn.fan.dao.CityDao;
import cn.fan.dao.CityDaoImpl;
import cn.fan.entity.CityBean;

import java.sql.SQLException;
import java.util.List;

public class CityServiceImpl implements CityService {

    private static CityDao dao;
    static {
        dao=new CityDaoImpl();
    }

    @Override
    public List<CityBean> findCities(int pid) {
        try {
            return dao.findCities(pid);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
