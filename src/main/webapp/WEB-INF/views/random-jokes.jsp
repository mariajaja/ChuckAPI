<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table>
		<tr>
			<th>ID</th>
			<th>Joke</th>
		</tr>
		<c:forEach var="joke" items="${ list }">
			<tr>
				<td>${ joke.id }</td>
				<td>${ joke.joke }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>