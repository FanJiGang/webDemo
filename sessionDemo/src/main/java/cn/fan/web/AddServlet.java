package cn.fan.web;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class AddServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        resp.setCharacterEncoding("utf-8");

        Cookie[] cookies = req.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if("JSESSIONID".equals(cookie.getName())){
                    cookie.setMaxAge(60*60*24*7);
                    resp.addCookie(cookie);
                }
            }
        }
        String name = req.getParameter("name");

        HttpSession session = req.getSession();
        Map<String,Integer> map = (Map<String, Integer>) session.getAttribute("cart");
        if (map == null) {
            map=new HashMap<String, Integer>();
            session.setAttribute("cart",map);
        }

        if(map.containsKey(name)){
            map.put(name,map.get(name)+1);
        }else{
            map.put(name,1);
        }
        resp.getWriter().println("<a href='product_list.jsp'>继续购物</a>" +
                " <a href='cart.jsp'>去购物车结算</a>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
