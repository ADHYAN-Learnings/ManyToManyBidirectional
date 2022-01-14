<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CoachingInstitute</title>
</head>
<body>
<h2>Data is accessing from Address side</h2>
 <a href="/address/saveNewDetail">Create</a>
  <table border="2">
    <thead>
     <tr>
     <th>Location</th>
      <th>Fees</th>
      <th>Salary</th>
      <th>Maintenance</th>
      <th>Head Of Finance Department</th>
     </tr>
    </thead>
    <tbody>
    <tr>
    <td>
    <c:forEach items="${address}" var="addr"> 
       ${addr.location} 
     </c:forEach>
      </td>
       <td>${address[0].coaching[0].salary }</td>
      <td>${address[0].coaching[0].fees }</td>
      <td>${address[0].coaching[0].maintenance }</td>
      <td>${address[0].coaching[0].head_of_financeDepartment }</td> 
      </tr>
	  
    </tbody>
  </table>
</body>
</html>