package cn.fan.service;

import cn.fan.dao.CityDao;
import cn.fan.entity.CityBean;

import java.util.List;

public interface CityService {

    List<CityBean> findCities(int pid);
}
