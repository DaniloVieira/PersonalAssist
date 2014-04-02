<%@page import="br.com.teste.model.bean.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="index.jsp"><- Back</a>
	<table>
		<thead>
			<tr>
				<td>Id</td>
				<td>Login</td>
			</tr>
		</thead>
		<tbody>
			<%
				List<User> users = (List<User>) request.getAttribute("users");
				for (User user : users) {
			%>
				<tr>
					<td><%=user.getId() %></td>
					<td><%=user.getLogin() %></td>
				</tr>
			<%
				}
			%>
		</tbody>
	</table>

</body>
</html>