package com.Leon.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.filter.OncePerRequestFilter;

import com.Leon.bean.UtilBean;

public class SessionFilter extends OncePerRequestFilter {

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {

		// 不过滤的uri
		String[] notFilter = new String[] { "/login.jsp", "/index.jsp", "/front_index.jsp" };

		// 请求的uri
		String uri = request.getRequestURI();

		System.out.println(uri);

		// uri中包含background时才进行过滤
		if (uri.contains("web_back")) {
			System.out.println("-----------filter--------访问后台--------");
			
			// 是否过滤
			boolean doFilter = true;
			for (String s : notFilter)
				if (uri.indexOf(s) != -1) {
					// 如果uri中包含不过滤的uri，则不进行过滤
					doFilter = false;
					break;
				}
			if (doFilter) {
				System.out.println("-----------filter--------执行过滤--------");
				
				// 执行过滤
				// 从session中获取登录者标识
				UtilBean util = (UtilBean) request.getSession().getAttribute("util");
				if (util.getK() == 0) {
					System.out.println("------filter------admin未登录-------");
					// 若管理员未登录,则返回前台首页
					// 设置request和response的字符集，防止乱码
					request.setCharacterEncoding("UTF-8");
					response.setCharacterEncoding("UTF-8");
					PrintWriter out = response.getWriter();
					String indexPage = request.getContextPath() + "/front/fff";
					StringBuilder builder = new StringBuilder();
					builder.append("<script type=\"text/javascript\">");
					builder.append("alert('You are not authorized to access this page.');");
					builder.append("window.top.location.href='");
					builder.append(indexPage);
					builder.append("';");
					builder.append("</script>");
					out.print(builder.toString());
				} else {
					// 如果管理员已登陆，则继续
					filterChain.doFilter(request, response);
				}
			} else {
				// 如果不执行过滤，则继续
				filterChain.doFilter(request, response);
			}
		} else {
			// 如果uri中不包含background，则继续
			filterChain.doFilter(request, response);
		}

	}

}
