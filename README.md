Servlets
  
  1. every class or Servlet that we create should extend HttpServlet and method should have parameters HttpServletRequest and HttpServletResponse.
  2. web.xml (deployment descriptor) is important which works for calling certain servlet for certain request from web
  3. To call one servlet from another servlet we need RequestDispatcher or SendRedirect.
	  i). RequestDispatcher - this is used when the servlet wants to comminucate with another servlet internally we use RequestDispatcher.
	  ii). SendRedirect - this is used when a request is send to the server and server want to redirect you to another server then we use SendRedirect.
		-> 1. session management, 2. url rewriting, 3. cookies
		Example : client is communicating with the server and for payment servlet notifies to client and requests again with that object to redirects to payment gatway. 
					In RequestRedirect if we want to send data to payment gatway we use session management to send data from one server to another server.
				
  4. ServletConfig and ServletContext
	  1. ServletContext -> this is used when we want to share the same value for all the other servlets.
	  2. ServletConfig -> this is used when different servlet requires different value. 
		Exmaple -> servletConfig and servletContext is used in case of storing the database userName and password or application.internal.dns.uri and things like that.
	
  5. Java Server Pages(JSP)
	  1. it is mainly used to send data in html formatter with html page structure.
	  2. eventhrough it runs as jsp internally it is jsp.
	  3. Jsp has 4 types of tags.
		a). directive tag <%@page %> (this is bascially used for writing imports).
		b). declarative tag <%! %>  (this is bascially used for writing the variable declarations inside the tag which are outside the service method in servlet).
		c). scriptlet tag  <% %> (for writing the logic which we typically write inside the service method in servlet).
		d). expression tag <%= %>   (used bascially to print output by just putting the result no need to write out.println() and all that).
		
		(a). JSP Directive tag - 3 types @page, @taglib, @include
		@page has some attributes to import, have session we can use @page.
		@include - here in this we can include jsp from one page and import to current page so that we can work with that page.
		@taglib - 
		
	6. JSTL - JSP standard tag library
