package cn.fan;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class BindingServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("post()");
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("get()");
        response.setContentType("text/html;charset=utf-8");
        HttpSession session = request.getSession();
        session.setAttribute("Str","我是一串萌萌的字符...");
        System.out.println("----------------存入字符串---------------------");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Bean01 bean01 = new Bean01();
        bean01.setName("张三");
        System.out.println("-----------------创建好了javaBean-----------------");
        session.setAttribute("bean",bean01);
        System.out.println("----------------javaBean存入了session---------------");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        session.removeAttribute("bean");
        System.out.println("---------------将javaBean移除----------------------");
        response.getWriter().println("返回页面...");
    }
}
