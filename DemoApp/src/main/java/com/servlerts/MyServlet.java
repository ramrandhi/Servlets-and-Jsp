package com.servlerts;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	
	/*
	 * 
	 * ServletConfig and ServletContext
	 * 
	 */
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		PrintWriter out = res.getWriter();
		
		// ServletContext
		
//		ServletContext cxt = getServletContext();
//		String str = cxt.getInitParameter("name");
		
		// // ServletConfig
		ServletConfig cg = getServletConfig();
		String str = cg.getInitParameter("name");
		out.println(str);
		
	}

}