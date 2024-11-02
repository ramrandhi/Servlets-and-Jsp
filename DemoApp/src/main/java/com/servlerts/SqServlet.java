package com.servlerts;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(value = "/sq")
public class SqServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		//RequestDispatcher
		
//		int k = (int)req.getAttribute("k");
		
		// SendRedirect
		
		// 1). url rewriting
//		int k = Integer.parseInt(req.getParameter("k"));
		
		// 2). HttpSession
//		HttpSession session = req.getSession();
//		int k = (int)session.getAttribute("k");
		
		// 3). Cookie
		int k = 0;
		
		Cookie cookies[] = req.getCookies();
		for(Cookie c: cookies) {
			if(c.getName().equals("k")) {
				k = Integer.parseInt(c.getValue());
			}
		}
		
		k = k*k;
		
		PrintWriter out = res.getWriter();
		out.println("Square is : " + k);
	}

}
