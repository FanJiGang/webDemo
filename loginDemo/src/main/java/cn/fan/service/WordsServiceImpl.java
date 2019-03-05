package cn.fan.service;

import cn.fan.dao.WordsDao;
import cn.fan.dao.WordsDaoImpl;
import cn.fan.entity.WordBean;

import java.sql.SQLException;
import java.util.List;

public class WordsServiceImpl implements WordsService {
    private static WordsDao dao;
    static {
        dao=new WordsDaoImpl();
    }
    @Override
    public List<WordBean> findWords(String word) {
        if (word==null || word.trim().length()==0){
            return null;
        }
        word="%"+word.trim()+"%";
        try {
            return dao.findWords(word);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
