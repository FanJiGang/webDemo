package cn.fan.web;

import cn.fan.entity.WordBean;
import cn.fan.service.WordsService;
import cn.fan.service.WordsServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class CheckWordServlet extends HttpServlet {
    private static WordsService service;
    static {
        service=new WordsServiceImpl();
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<WordBean> words = service.findWords(request.getParameter("word"));
        request.setAttribute("words",words);
        request.getRequestDispatcher("list.jsp").forward(request,response);
    }
}
