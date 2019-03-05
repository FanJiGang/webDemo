package cn.fan.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * 用户类,对应stus数据库中的t_user表
 */
public class User implements Serializable {

    private static final long serialVersionUID = 7868661463499752065L;

    private int user_id;
    private String user_name;
    private String user_password;
    private Timestamp user_createtime;
    private Timestamp user_modify_time;

    public User() {
    }

    public User(int user_id, String user_name, String user_password, Timestamp user_createtime, Timestamp user_modify_time) {

        this.user_id = user_id;
        this.user_name = user_name;
        this.user_password = user_password;
        this.user_createtime = user_createtime;
        this.user_modify_time = user_modify_time;
    }

    public int getUser_id() {

        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public Timestamp getUser_createtime() {
        return user_createtime;
    }

    public void setUser_createtime(Timestamp user_createtime) {
        this.user_createtime = user_createtime;
    }

    public Timestamp getUser_modify_time() {
        return user_modify_time;
    }

    public void setUser_modify_time(Timestamp user_modify_time) {
        this.user_modify_time = user_modify_time;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return user_id == user.user_id;
    }

    @Override
    public int hashCode() {

        return Objects.hash(user_id);
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", user_name='" + user_name + '\'' +
                ", user_password='" + user_password + '\'' +
                ", user_createtime=" + user_createtime +
                ", user_modify_time=" + user_modify_time +
                '}';
    }
}
