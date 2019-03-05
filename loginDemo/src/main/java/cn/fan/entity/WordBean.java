package cn.fan.entity;

import java.io.Serializable;
import java.util.Objects;

public class WordBean implements Serializable {
    private static final long serialVersionUID = -8724952240812544906L;

    private int id;
    private String word;

    public WordBean() {
    }

    public WordBean(int id, String word) {

        this.id = id;
        this.word = word;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WordBean wordBean = (WordBean) o;
        return id == wordBean.id;
    }

    @Override
    public int hashCode() {

        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "WordBean{" +
                "id=" + id +
                ", word='" + word + '\'' +
                '}';
    }
}
