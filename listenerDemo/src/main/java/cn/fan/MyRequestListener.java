package cn.fan;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class MyRequestListener implements ServletRequestListener {


    public void requestDestroyed(ServletRequestEvent servletRequestEvent) {
        System.out.println("request被销毁了...");
    }

    public void requestInitialized(ServletRequestEvent servletRequestEvent) {
        System.out.println("request初始化...");
    }
}
