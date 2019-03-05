package cn.fan;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;
import java.io.Serializable;

public class Bean02 implements Serializable,HttpSessionActivationListener {

    private String name;

    public Bean02() {
    }

    public Bean02(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bean02{" +
                "name='" + name + '\'' +
                '}';
    }

    public void sessionWillPassivate(HttpSessionEvent httpSessionEvent) {
        System.out.println("Bean02被钝化了...");
    }

    public void sessionDidActivate(HttpSessionEvent httpSessionEvent) {
        System.out.println("Bean02被活化了...");
    }
}
