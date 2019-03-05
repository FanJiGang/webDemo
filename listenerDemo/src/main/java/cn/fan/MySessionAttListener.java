package cn.fan;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class MySessionAttListener implements HttpSessionAttributeListener {
    public void attributeAdded(HttpSessionBindingEvent httpSessionBindingEvent) {
        System.out.println("属性增加...");
    }

    public void attributeRemoved(HttpSessionBindingEvent httpSessionBindingEvent) {
        System.out.println("属性删除...");
    }

    public void attributeReplaced(HttpSessionBindingEvent httpSessionBindingEvent) {
        System.out.println("属性变更...");
    }
}
