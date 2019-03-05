package cn.fan;

import javax.management.ValueExp;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class CookieDemo03 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        Cookie cookie1 = new Cookie("username", URLEncoder.encode("张三","utf-8"));
        Cookie cookie2 = new Cookie("password", URLEncoder.encode("123456","utf-8"));
        Cookie cookie3 = new Cookie("sex", URLEncoder.encode("男","utf-8"));
        response.addCookie(cookie1);
        response.addCookie(cookie2);
        response.addCookie(cookie3);


        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                String name=URLDecoder.decode(cookie.getName(),"utf-8");
                String value = URLDecoder.decode(cookie.getValue(), "utf-8");
                System.out.println(name+"="+value);
                response.getWriter().println(name+"="+value);
            }
        }

    }
}
