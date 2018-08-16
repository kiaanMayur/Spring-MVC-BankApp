<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>All Accounts</h1>
	
	<jstl:forEach items="${account}" var="acc">
		
		<div style="align:'center';">
			<table border="1">
			
			<tr>
			<td> Account Number : </td>
			<td> ${acc.accNo} </td>
			</tr>
			
			<tr>
			<td> Account Holder Name : </td>
			<td> ${acc.customer.customerName} </td>
			</tr>
			
			<tr>
			<td> Email : </td>
			<td> ${acc.customer.email} </td>
			</tr>
			
			<tr>
			<td> Date of Birth : </td>
			<td> ${acc.customer.dob} </td>
			</tr>
			
			<tr>
			<td> Phone : </td>
			<td> ${acc.customer.contact} </td>
			</tr>
			
			<tr>
			<td> Account Balance : </td>
			<td> ${acc.accountBalance }
			</tr>
			
			
			</table>
		</div>
		</jstl:forEach>
		
		<br/><a href="home">back</a>

</body>
</html>