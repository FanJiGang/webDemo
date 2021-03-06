package cn.my.servlet;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DestroyDemo extends HttpServlet {
    @Override
    public void init() throws ServletException {
        System.out.println("init()");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doget()");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("dopost()");
    }

    @Override
    public void destroy() {
        System.out.println("destroy()");
    }
}
