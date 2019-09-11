<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
	String topics[]=(String[])request.getAttribute("topics");
for(String t:topics){
%>

<h3><%=t%></h3>
<%
}

%>

<h3><%= request.getAttribute("topics") %></h3>
</body>
</html>