package cn.fan.service;

import cn.fan.entity.WordBean;

import java.util.List;

public interface WordsService {
    List<WordBean> findWords(String word);
}
