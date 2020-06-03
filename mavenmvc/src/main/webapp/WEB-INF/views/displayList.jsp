<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	import="com.sagar.spring.springmvc.dto.Employee, java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employees</title>
</head>
<body>

	<%
		List<Employee> employees = (List<Employee>) request.getAttribute("employees");
	for (Employee e : employees) {
		out.println("Name: " + e.getName());
		out.println("ID: " + e.getId());
		out.println("Salary:" + e.getSalary());
		System.out.println();
	}
	%>



</body>
</html>