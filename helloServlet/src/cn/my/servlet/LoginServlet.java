package cn.my.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("post()");
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("get()");
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String username = request.getParameter("username");
        String pwd = request.getParameter("pwd");
        ServletContext context = getServletContext();
        Object total = context.getAttribute("total");
        int count=0;
        if (total!=null) {
            count=(int)total;
        }
        if ("zhangsan".equalsIgnoreCase(username) && "123".equals(pwd)) {
            System.out.println("验证通过");
            System.out.println("共登录了:"+ ++count +"个用户");
            context.setAttribute("total",count);

//            response.setStatus(302);
//            response.setHeader("Location","login_success.html");
            response.sendRedirect("login_success.html");
        } else {
            System.out.println("用户名或密码错误");
        }
    }
}
