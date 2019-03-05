package cn.fan;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class ActivationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("post");
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("get");
        response.setContentType("text/html;charset=utf-8");
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if ("JSESSIONID".equals(cookie.getName())){
                    cookie.setMaxAge(60*60*3); //自行设置超时时间,单位是秒
                    response.addCookie(cookie);
                }
            }
        }
        HttpSession session = request.getSession();
        session.setMaxInactiveInterval(1000);
        Bean02 lisisi = new Bean02("lisisi");
        session.setAttribute("bean02",lisisi);
        response.getWriter().println("存session成功!");
    }
}
