<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%! 
		String url = "jdbc:mysql://localhost:3306/common";
		String name = "hcn";
		String password = "admin@123";
		String query = "select * from common.user_info;";
	%>

	<%
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection(url,name,password);
	Statement st = con.createStatement();
	ResultSet rt = st.executeQuery(query);
	rt.next();
	%>
	
	<%= rt.getString(1) %>
	<%= rt.getString(2) %>
	<%= rt.getString(3) %>
	<%= rt.getString(4) %>
	<%= rt.getString(5) %>
	<%= rt.getString(6) %>
	<%= rt.getString(7) %>
	<%= rt.getString(8) %>

</body>
</html>