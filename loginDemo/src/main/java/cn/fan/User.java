package cn.fan;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

public class User implements Serializable{
    private static final long serialVersionUID = 6024810859362074504L;

    private int uid;
    private String uname;
    private String password;
    private Timestamp createTime;
    private Timestamp modifyTime;

    public User() {
    }

    public User(int uid, String uname, String password, Timestamp createTime, Timestamp modifyTime) {

        this.uid = uid;
        this.uname = uname;
        this.password = password;
        this.createTime = createTime;
        this.modifyTime = modifyTime;
    }

    public int getUid() {

        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Timestamp modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return uid == user.uid;
    }

    @Override
    public int hashCode() {

        return Objects.hash(uid);
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", password='" + password + '\'' +
                ", createTime=" + createTime +
                ", modifyTime=" + modifyTime +
                '}';
    }
}
