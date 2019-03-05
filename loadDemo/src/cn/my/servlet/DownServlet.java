package cn.my.servlet;

import cn.my.util.DownLoadUtil;

import javax.servlet.ServletOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;

public class DownServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        System.out.println("post");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        System.out.println("get");
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String fileName = request.getParameter("fileName");
        String encode_fileName;
        if (request.getHeader("User-Agent").contains("Firefox")) {
            encode_fileName = DownLoadUtil.base64EncodeFileName(fileName);
        }else {
            encode_fileName = URLEncoder.encode(fileName, "utf-8");
        }
        response.setHeader("Content-Disposition","attachment;filename="+encode_fileName);
        InputStream in=new FileInputStream(getServletContext().getRealPath("download/"+fileName));
        ServletOutputStream out = response.getOutputStream();
        int len=0;
        byte[] buf=new byte[1024];
        while ((len=in.read(buf))!=-1) {
            out.write(buf,0,len);
        }
        in.close();
        out.close();
    }
}
