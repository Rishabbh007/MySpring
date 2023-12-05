<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	
	<%@page isELIgnored="false" %>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help page</title>
</head>
<body>

	<%
		/* String name = (String) request.getAttribute("name");
		Integer rollnumber = (Integer) request.getAttribute("rollnumber");

		LocalDateTime time = (LocalDateTime) request.getAttribute("time"); */
	%>

	<h1>This is our help page</h1>
	<h2>
		Hello My name is ${name}
	<%-- 	<%=name%> --%></h2>
	<h2>
		And my roll number is ${rollnumber}
		<%-- <%=rollnumber%>--%>
		</h2> 
	<h2>Date and time is ${time} <%-- <%=time %> --%></h2>
	
	<hr>
	
	<c:forEach var="item" items="${marks }">
	
	  <%-- <h1>${item }</h1> --%>
	  
	  <h1><c:out value="${item }"></c:out></h1>
	  
	</c:forEach>

</body>
</html>