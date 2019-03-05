package cn.my.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

public class RequestServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //getParam01(request);
        //getParam02(request);
        Map<String, String[]> map = request.getParameterMap();
        Set<Map.Entry<String, String[]>> entries = map.entrySet();
        for (Map.Entry<String, String[]> entry : entries) {
            String key = entry.getKey();
            String[] values = entry.getValue();
            for (String value : values) {
                System.out.println(key + " = " + value);
            }
        }
    }

    private void getParam02(HttpServletRequest request) {
        Map<String, String[]> map = request.getParameterMap();
        Set<String> keys = map.keySet();
        for (String key : keys) {
            String[] values = map.get(key);
            for (String value : values) {
                System.out.println(key + ":" + value);
            }
        }
    }

    private void getParam01(HttpServletRequest request) {
        Enumeration<String> names = request.getParameterNames();
        while (names.hasMoreElements()){
            String key = names.nextElement();
            String value=request.getParameter(key);
            System.out.println(key+":"+value);
        }
    }
}
