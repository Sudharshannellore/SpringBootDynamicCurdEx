<%@page contentType="text/html; charset=ISO-8859-1" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<center>
<table border="1">
  <tr>
    <th>ID</th>
    <th>Name</th>
    <th>Email</th>
    <th>Edit</th>
    <th>Delete</th>
  </tr>
   <c:forEach var="user" items="${users}">
   <tr>
   <td>${user.userid}</td>
   <td>${user.username}</td>
   <td>${user.email}</td>
   <td>
     <a href="/edit/${user.userid}">Edit</a>
   </td>
   <td>
     <a href="/delete/${user.userid}">Delete</a>
   </td>
   </tr>
   </c:forEach>
</table>
</center>
