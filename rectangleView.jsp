<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.*" %>
    <%@ page import="com.hcl.model.Rectangle" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Result</h1>
<% List<Rectangle> lstRectangles = (ArrayList<Rectangle>)request.getAttribute("lstRectangles1");%>

<table border="1">
<tr>
<th>Length</th>	<th>Breadth</th> <th>Area</th> <th>Perimeter</th> </tr>
<% for(Rectangle rectangle : lstRectangles) { %>

<tr>
<td> <%out.println(rectangle.getLength()); %></td>
<td><%out.println(rectangle.getBreadth()); %></td>
<td> <%out.println(rectangle.getArea()); %></td>
<td> <%out.println(rectangle.getPerimeter()); %></td>
</tr>
<%} %>

</table>
</body>
</html>