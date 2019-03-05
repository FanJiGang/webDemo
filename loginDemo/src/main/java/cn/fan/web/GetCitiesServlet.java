package cn.fan.web;

import cn.fan.entity.CityBean;
import cn.fan.service.CityService;
import cn.fan.service.CityServiceImpl;
import com.thoughtworks.xstream.XStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class GetCitiesServlet extends HttpServlet {

    private static CityService service =new CityServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");

        int pid = Integer.parseInt(request.getParameter("pid"));
        List<CityBean> cities = service.findCities(pid);

        //使用xstream,转换一个对象为xml字符串
        XStream xStream = new XStream();
        xStream.useAttributeFor(CityBean.class,"cid"); //将cid设置为属性
        xStream.alias("city",CityBean.class); //设置标签名
        String s = xStream.toXML(cities);

        response.getWriter().println(s);
    }
}
