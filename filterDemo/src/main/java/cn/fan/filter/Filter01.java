package cn.fan.filter;

import javax.servlet.*;
import java.io.IOException;

public class Filter01 implements Filter {
    public void destroy() {
        System.out.println("filter:destroy()");
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("filter:doFilter(begin)");
        chain.doFilter(req, resp);
        System.out.println("filter:doFilter(end)");
    }

    public void init(FilterConfig config) throws ServletException {
        System.out.println("filter:init()");
    }

}
