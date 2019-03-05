package cn.fan;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.beans.Encoder;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class Show extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        String name = request.getParameter("name");

        Cookie[] cookies = request.getCookies();
        Cookie cookie1=null;
        Cookie cookie2=null;
        Cookie cookie3=null;
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if ("name1".equals(cookie.getName())){
                    cookie1=cookie;
                }
                if("name2".equals(cookie.getName())){
                    cookie2=cookie;
                }
                if("name3".equals(cookie.getName())){
                    cookie3=cookie;
                }
            }
        }
        if(cookie1==null){
            cookie1=new Cookie("name1",URLEncoder.encode(name,"utf-8"));
            response.addCookie(cookie1);
        }else if(cookie2==null){
            cookie2=new Cookie("name2",URLEncoder.encode(name,"utf-8"));
            response.addCookie(cookie2);
        }else if(cookie3==null){
            cookie3=new Cookie("name3",URLEncoder.encode(name,"utf-8"));
            response.addCookie(cookie3);
        }else{
            cookie1.setValue(URLEncoder.encode(URLDecoder.decode(cookie2.getValue(),"utf-8"),"utf-8"));
            cookie2.setValue(URLEncoder.encode(URLDecoder.decode(cookie3.getValue(),"utf-8"),"utf-8"));
            cookie3.setValue(URLEncoder.encode(name,"utf-8"));
            response.addCookie(cookie1);
            response.addCookie(cookie2);
            response.addCookie(cookie3);
        }
        response.sendRedirect("show.jsp?name="+URLEncoder.encode(name,"utf-8"));
    }
}
