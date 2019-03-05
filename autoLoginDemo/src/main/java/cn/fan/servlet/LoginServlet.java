package cn.fan.servlet;

import cn.fan.entity.User;
import cn.fan.service.UserService;
import cn.fan.service.UserServiceImpl;
import cn.fan.utils.NoteResult;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * 登录操作
 */
public class LoginServlet extends HttpServlet {

    private static UserService service;
    static {
        service =new UserServiceImpl();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username");
        String pwd = request.getParameter("pwd");
        String auto_login = request.getParameter("auto_login");

        NoteResult<User> result = service.login(username, pwd);

        if (result.getStatus()==0) {
            HttpSession session = request.getSession();
            Cookie cookie = new Cookie("JSESSIONID", session.getId());
            if ("on".equals(auto_login)) {
                cookie.setMaxAge(60*60*3);
            } else {
                cookie.setMaxAge(-1);
        }
            //设置该cookie对当前页面有效
            cookie.setPath(request.getContextPath());
            response.addCookie(cookie);
            session.setAttribute("result",result);
            response.sendRedirect("index.jsp");
        } else {
            response.getWriter().println("登录失败");
        }

    }
}
