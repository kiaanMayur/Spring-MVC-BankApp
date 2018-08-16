<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div>
	<body>
	
	<h1 align="center">Congratulations, your account has been successfully created!!!</h1>
	
	<table border="1">
		
		<tr>
			<th>Account number : </th> 
			<th>${account.accNo}</th> 
		</tr>
		<br></br>
		
		<tr>
			<th>Name : </th> 
			<th><%-- <%=request.getParameter("holdername") %> --%>
			${account.customer.customerName }</th> 
		</tr>
		</br></br>
		<tr>
			<th>Email : </th> 
			<th><%-- <%=request.getParameter("email") %> --%>
			${account.customer.email}</th> 
		</tr>
				</br></br>
		
		<tr>
			<th>Date of Birth : </th>
			<th><%-- <%=request.getParameter("dob") %> --%>
			${account.customer.dob }</th> 
		</tr>
				</br></br>
		
		<tr>
			<th>Phone : </th>
			<th><%-- <%=request.getParameter("phone") %> --%>
			${account.customer.contact}</th> 
		</tr>
		
		<%-- <tr>
			
			<jstl:if test="${request.getParameter("saccbal").equals("saccbal")}"> --%>
			<th>Account Balance : </th>
			<th>Rs. ${account.accountBalance }</th>
			<!-- </jstl:if> -->
		</tr> 
		
		
		<tr>
			<th>Account Type : </th>
			<th><%=request.getParameter("acctype") %></th>
		</tr>
		
	</table>
	
	<a href="home">Back</a>
</div>

</body>
</html>