package cn.fan;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ClearServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie name1 = new Cookie("name1", "");
        Cookie name2 = new Cookie("name2", "");
        Cookie name3 = new Cookie("name3", "");
        name1.setMaxAge(0);
        name2.setMaxAge(0);
        name3.setMaxAge(0);
        response.addCookie(name1);
        response.addCookie(name2);
        response.addCookie(name3);
        response.sendRedirect("product_list.jsp");
    }
}
