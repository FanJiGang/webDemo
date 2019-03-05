package cn.fan.entity;

import java.io.Serializable;
import java.util.Objects;

public class CityBean implements Serializable {
    private static final long serialVersionUID = -4690451387696154433L;
    private int cid;
    private String cname;
    private int pid;

    public CityBean() {
    }

    public CityBean(int cid, String cname, int pid) {

        this.cid = cid;
        this.cname = cname;
        this.pid = pid;
    }

    public int getCid() {

        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CityBean cityBean = (CityBean) o;
        return cid == cityBean.cid;
    }

    @Override
    public int hashCode() {

        return Objects.hash(cid);
    }

    @Override
    public String toString() {
        return "CityBean{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", pid=" + pid +
                '}';
    }
}
