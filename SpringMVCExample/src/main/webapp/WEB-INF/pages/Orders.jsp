<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
    <h1>Orders</h1>
	
    <h2>${orderName}</h2>
    <table>
     <c:forEach var="order" items="${orders}"> 
    	<tr>
   			<td><c:out value="${order.orderId}"/></td>
   		<td><c:out value="${order.orderName}"/></td>
   		<td><c:out value="${order.price}"/></td>
   		</tr>
	</c:forEach>
</table>

</body>
</html>