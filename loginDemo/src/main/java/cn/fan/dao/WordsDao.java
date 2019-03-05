package cn.fan.dao;

import cn.fan.entity.WordBean;

import java.sql.SQLException;
import java.util.List;

public interface WordsDao {
    //根据关键字查询
    List<WordBean> findWords(String word) throws SQLException;
}
