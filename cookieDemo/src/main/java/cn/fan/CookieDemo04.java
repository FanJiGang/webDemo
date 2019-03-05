package cn.fan;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CookieDemo04 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        String username = request.getParameter("username");
        String pwd = request.getParameter("pwd");

        if("zhangsan".equals(username) && "123".equals(pwd)){
            Cookie[] cookies = request.getCookies();
            if (cookies != null) {
                //不是第一次登录
                for (Cookie cookie : cookies) {
                    if ("last_time".equals(cookie.getName())){
                        response.getWriter().println("欢迎再次访问(上次登录时间是:"+cookie.getValue()+")");
                    }
                }
            } else {
                //第一次登录
                response.getWriter().println("欢迎登录:"+username);
            }
            Cookie last_user = new Cookie("last_user", username);
            String time = new SimpleDateFormat("YYYY-MM-DD HH:mm:ss").format(new Date());
            Cookie last_time = new Cookie("last_time", time);
            response.addCookie(last_time);
            response.addCookie(last_user);
        }else {
            response.getWriter().println("登录失败");
        }

    }
}
