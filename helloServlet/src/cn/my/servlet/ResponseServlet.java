package cn.my.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.Charset;

public class ResponseServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("post()");
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("get()");
        //response01(request, response);
        response.setContentType("text/html;charset=utf-8");
        String username = request.getParameter("username");
        String pwd = request.getParameter("pwd");
        String msg="<h1>登录成功</h1><h3>"+username+":"+pwd+"</h3>";
        response.getOutputStream().write(msg.getBytes("utf-8"));

    }

    private void response01(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String pwd = request.getParameter("pwd");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().println("<h1>登录成功</h1>" + "<h3>"+username+":"+pwd+"</h3>");
    }
}
