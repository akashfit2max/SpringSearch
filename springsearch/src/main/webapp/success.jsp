<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored='false'%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Student name is ${student.name }</h1>
	<h1>Student password is ${student.password}</h1>
	<h1>
		courses :
		<p>
			<c:forEach items="${student.courses }" var="cr">
				<c:out value="course : ${cr }"></c:out>
			</c:forEach>
		</p>
	</h1>
	<h1>Student address is : ${student.address.street }</h1>
	<h1>Student city id : ${student.address.city }</h1>

</body>
</html>