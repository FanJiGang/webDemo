package cn.fan;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class MySessionListener implements HttpSessionListener{

    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        System.out.println("session被创建了...");
    }

    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        System.out.println("session被销毁了...");
    }
}
