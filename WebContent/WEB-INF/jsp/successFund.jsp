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

	<div>
	
		<jstl:if test="${empty fund }">
		Some error!!
		</jstl:if>
		
		<jstl:set var="i" value="0"></jstl:set>
		
		<jstl:if test="${not empty fund }">
		Successfully amount has been transfered from ${param.sourceAcc} to ${param.destinationAcc} and the amount is ${param.amount}.<br></br>
			Remaining balance in both the accounts are as follows :<br></br>
		<jstl:forEach items="${fund}" var="f">
			
			<jstl:if test="${i == '0'}">
			Source account : ${f.accountBalance} <br></br>
			</jstl:if>
			<br/>
			<jstl:if test="${i != 0}">
			destination amount : ${f.accountBalance} 
			</jstl:if>
			<jstl:set var="i" value="1"></jstl:set>
		</jstl:forEach>
		</jstl:if>
		<a href="home">back</a>
	</div>
</article>

</body>
</html>