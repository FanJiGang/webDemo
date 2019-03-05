package cn.fan.dao;

import cn.fan.entity.WordBean;
import cn.fan.utils.C3P0utils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class WordsDaoImpl implements WordsDao {
    @Override
    public List<WordBean> findWords(String word) throws SQLException {
        QueryRunner qr = new QueryRunner(C3P0utils.getDataSource());
        String dql="select * from words where word like ?";
        return qr.query(dql,new BeanListHandler<WordBean>(WordBean.class),word);
    }
}
