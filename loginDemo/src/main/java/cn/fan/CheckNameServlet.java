package cn.fan;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CheckNameServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        String username = request.getParameter("username");
        if (username == null || username.trim().length()==0) {
            response.getWriter().println("<span  style='color: red;'>用户名不能为空!</span>");
        } else if(CheckName.check(username)){
            response.getWriter().println("<span  style='color: green;'>用户名可用!</span>");
        } else {
            response.getWriter().println("<span  style='color: red;'>用户名已存在!</span>");
        }
    }
}
