<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	Login Success, Hello <% Object ob = request.getParameter("username");
    out.println(ob); %>!
	<div>
	<form method="post" action="/ServletExample/OrderServlet" style="dispaly:grid;">
	<label>Item name</label> <input type="text" name="itemname"/>
	<label>toppings</label> <input type="text" name="toppings"/>
	<label>Address</label> <input type="text" name="address"/>
	<input type="submit" value="Create Order"/>
	</form>
	</div>
	
</body>
</html>