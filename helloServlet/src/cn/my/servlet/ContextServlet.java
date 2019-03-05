package cn.my.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class ContextServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("context:doPost()");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("context:doGet()");
        /*Properties p=new Properties();
        p.load(ContextServlet.class.getClassLoader().getResourceAsStream("context.properties"));
        String name = p.getProperty("name");
        System.out.println("name = " + name);*/
       /* ServletContext context = getServletContext();
        String path = context.getRealPath("context.properties");
        System.out.println("path = " + path);
        Properties p=new Properties();
        p.load(new FileInputStream(path));
        String name = p.getProperty("name");
        System.out.println("name = " + name);*/
        ServletContext context = getServletContext();
        InputStream in = context.getResourceAsStream("context.properties");
        Properties p = new Properties();
        p.load(in);
        String name = p.getProperty("name");
        System.out.println("name = " + name);
    }
}
