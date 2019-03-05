package cn.fan;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import java.io.Serializable;

public class Bean01 implements Serializable,HttpSessionBindingListener {

    private static final long serialVersionUID = -7613988053067814579L;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bean01{" +
                "name='" + name + '\'' +
                '}';
    }

    public void valueBound(HttpSessionBindingEvent httpSessionBindingEvent) {
        System.out.println("对象被绑定了...");
    }

    public void valueUnbound(HttpSessionBindingEvent httpSessionBindingEvent) {
        System.out.println("对象被解除绑定了...");
    }
}
