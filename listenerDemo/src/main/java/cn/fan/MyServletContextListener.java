package cn.fan;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyServletContextListener implements ServletContextListener {
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("ServletContext初始化了...");
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("ServletContext销毁了...");
    }
}
