<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Jsp Page</title>
</head>
<body style="background-color: pink; color: white; display: flex; justify-content: center; align-items: center; font-weight: bold; font-size: 55px">
	<%@page 
			import="java.util.List"
			import="java.util.Arrays"
	%>
	<%! 
		int M = 124;
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
	%>
	<%
	int i = Integer.parseInt(request.getParameter("num1"));
	int j = Integer.parseInt(request.getParameter("num2"));

	int k = i + j;

	out.println("result is : " + k);
	out.println();
	out.println("result from Declarative : " + M);
	out.println();
	out.println("result from Declarative list : " + list);
	out.println();
	%>
	
	<%= M %>

</body>
</html>