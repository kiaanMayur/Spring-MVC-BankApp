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
<article>
	<div style="align:'center';">
		<jstl:if test="${empty Daccount}">
		Sorry wrong account number or amount is greater than balance</jstl:if>
		
		<jstl:if test="${not empty Daccount}">
		${param.Dmoney} rupees has be creditted to the account with account number ${Daccount.accNo}</br>
		Remaining balance ${Daccount.accountBalance}</jstl:if>
		
		<a href="home">back</a>
	</div>
</article>
</body>
</html>