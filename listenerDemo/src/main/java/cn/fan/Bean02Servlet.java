package cn.fan;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class Bean02Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("get");
        resp.setContentType("text/html;charset=utf-8");
        Cookie[] cookies = req.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if ("JSESSIONID".equals(cookie.getName())){
                    cookie.setMaxAge(60*60*1); //自行设置超时时间,单位是秒
                    resp.addCookie(cookie);
                }
            }
        }
        HttpSession session = req.getSession();
        Bean02 bean02 = (Bean02)session.getAttribute("bean02");
        System.out.println(" name " + bean02.getName());
        resp.getWriter().println("获取session成功");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
