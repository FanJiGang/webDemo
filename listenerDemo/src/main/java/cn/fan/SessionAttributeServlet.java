package cn.fan;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class SessionAttributeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("post()方法被调用了...");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("get()方法被调用了...");
        response.setContentType("text/html;charset=utf-8");

        HttpSession session = request.getSession();
        session.setAttribute("session","我是session...");
        System.out.println("--------------设置了session属性-----------");
        Thread thread = Thread.currentThread();
        try {
            thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        session.setAttribute("session","我替换了session...");
        System.out.println("-------------替换了session属性-----------");
        try {
            thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        session.removeAttribute("session");
        System.out.println("-------------删除了session属性-----------");
        response.getWriter().println("<h1>返回了页面...</h1>");
    }
}
