package cn.my.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("post()");
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("get()");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        ServletContext context = getServletContext();
        Object total = context.getAttribute("total");
        response.getWriter().println("共有:"+total+"人访问本网页!");
    }
}
