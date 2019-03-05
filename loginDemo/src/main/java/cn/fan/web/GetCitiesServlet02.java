package cn.fan.web;

import cn.fan.entity.CityBean;
import cn.fan.service.CityService;
import cn.fan.service.CityServiceImpl;
import com.thoughtworks.xstream.XStream;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class GetCitiesServlet02 extends HttpServlet {

    private static CityService service =new CityServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");

        int pid = Integer.parseInt(request.getParameter("pid"));
        List<CityBean> cities = service.findCities(pid);
        //使用json数据封装数据
        JSONArray jsonArr = JSONArray.fromObject(cities);
        String jsonStr = jsonArr.toString();
        response.getWriter().println(jsonStr);
    }
}
