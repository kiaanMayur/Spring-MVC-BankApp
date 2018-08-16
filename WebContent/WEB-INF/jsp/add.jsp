<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<style type="text/css">

	#main{
		text-align: center;
		/* padding: 0px; */
		
		background-color: gray;
			}
			
	#deco{
		margin-top:auto;
		margin-bottom:auto;
		margin-left: auto;
		margin-right: auto;
	
	}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div id="main" align="center">
		<form action="display">
		  
		  <table id="deco">
		  
			<tr><th height="30";>Account Holder Name : </th>
				<th><input type="text" name="holdername" required="required"></th> </tr><br/>
				
			<tr><th height="30";>Email :</th>
			<th><input type="email" name="email" autocomplete="off"></th></tr><br/>
			
			<tr><th height="30";>Date Of Birth :</th>
			<th><input type="date" name="dob" min="01/01/2000"></th></tr><br/>
			
			<tr><th height="30";>Phone :</th>
			<th><input type="number" name="phone" min="6666666666" required="required"></th></tr> <br/>
			
			<tr><th height="30";>Account Type :</th> 
			<th><select name="acctype">
				<option value="savings">Savings</option>		 
				<option value="current">Current</option>
			</select></th></tr><br/>
			
			<tr><th height="30";>Choose only if savings acc</th>
			<th><input type="radio" name="sal" value="salaried">Salaried
				<input type="radio" name="sal" value="notsalaried">Not Salaried</th></tr><br/>
			
			<tr><th height="50";>(If salaried) <br/>Enter the Account Balance :</th>
				<th><input type="number" value="salaried" name="saccbal"></th></tr><br/>
				
			<tr><th height="50";>(If not salaried) <br/>Enter the account balance(min Rs 5000) :</th>
			<th><input type="number" value="nonsalaried" name="nonsalbal" min="5000"></th></tr><b/r>
			 
			<tr><th height="50";>(If Current Account) <br/> Enter the Overdraft limit :</th>
			<th><input type="text" name="overdraft"></th></tr><br/> 
			
			<tr><th height="50";>Enter the Account Balance(Current Account Holder) :</th>
			 <th><input type="number" value="current" name="caccbal" min="10000"></th></tr><br/>
			
			
			<tr><th><input type="submit" value="submit"></th>
			
			<th><input type="reset" value="reset"></th></tr>
			
			  </table> 
			
			 
		</form> 
	</div>

</body>
</html>