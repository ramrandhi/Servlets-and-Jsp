package com.servlerts;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(value = "/add")
public class AddServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9150936195025751682L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		Integer i = Integer.parseInt(req.getParameter("num1"));
		Integer j = Integer.parseInt(req.getParameter("num2"));

		int k = i + j;
		// to print on console
//		PrintWriter out = res.getWriter();
//
//		out.println("result is " + k);
		
		// RequestDispatcher 
		
//		req.setAttribute("k", k);
//		
//		RequestDispatcher rd = req.getRequestDispatcher("sq");
//		rd.forward(req, res);
		
		
		
		// SendRedirect
		
		// 1). url rewriting
//		res.sendRedirect("sq?k="+k);
		
        // 2). HttpSession	
//		HttpSession session = req.getSession();
//		session.setAttribute("k", k);
		
		// 3). Cookie
		
		Cookie cookie = new Cookie("k", String.valueOf(k));
		res.addCookie(cookie);
		
		res.sendRedirect("sq");

	}

}