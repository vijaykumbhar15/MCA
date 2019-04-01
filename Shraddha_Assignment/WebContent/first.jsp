<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<form action="FisrtAssignment" method="post">
		<div align="center">
		
		<center><h1>Assignment No 1</h1>
		
		<br>
		First Assignment
		<br>
		<br><br>Name : <input type="text" name="name" id="name"/>
		<br><br>Address : <input type="text" name="address" id="address"/>
		<br><br>Email : <input type="text" name="email" id="email"/>
		<br><br>Mobile No : <input type="text" name="mobileNo" id="mobileNo"/>
		<br><br>
		<input type="submit" value="Submit">
		
		<br><br><br><br><br><br>
		<table border="2">
		  <tr>
		    <th>Name</th>
		    <th>Address</th>
		    <th>Email</th>
		    <th>Mobile No</th>
		  </tr>
		  <tr>
		    <td><%=session.getAttribute("name") %></td>
		    <td><%=session.getAttribute("address")%></td>
		    <td><%=session.getAttribute("email")%></td>
		    <td><%=session.getAttribute("mobileNo")%></td>
		  </tr>
		</table>
		</div>
		
		<input type="button" onClick="window.location='fibonacci.jsp';"></input>
		
	</form>

</body>
</html>