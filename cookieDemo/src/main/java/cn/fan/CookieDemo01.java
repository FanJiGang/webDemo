package cn.fan;

import javax.servlet.http.Cookie;
import java.io.IOException;
import java.net.URLEncoder;

public class CookieDemo01 extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        //Cookie的简单使用
        Cookie cookie = new Cookie("message", URLEncoder.encode("cookie值","utf-8"));
        response.addCookie(cookie);
        response.getWriter().println("成功返回");
    }
}
