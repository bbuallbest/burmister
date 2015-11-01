package org.burmister.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author Kyrylo Berehovyi
 */
@WebFilter(urlPatterns = "/payman/*")
public class CustomLoggingFilter implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {}

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        String uri = ((HttpServletRequest)request).getRequestURI();
        System.out.println("Filter | url: " + uri);
        chain.doFilter(request, response);
    }

    public void destroy() {}
}
