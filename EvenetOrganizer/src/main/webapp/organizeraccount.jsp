<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
     
      <table>
      
      <c:forEach var="org" items="${orgDetails}">
      
      <c:set var="id" value="${org.id}"/>
      <c:set var="name" value="${org.name}"/>
      <c:set var="age" value="${org.age}"/>
      <c:set var="contact_no" value="${org.contact_no}"/>
      <c:set var="email" value="${org.email}"/>
      <c:set var="experience_year" value="${org.experience_year}"/>
      <c:set var="username" value="${org.username}"/>
      <c:set var="password" value="${org.password}"/>
      
      <tr>
		<td>Organizer ID</td>
		<td>${org.id}</td>
	  </tr>
	  
	  <tr>
		<td>Name</td>
		<td>${org.name}</td>
	  </tr>
	  
	  <tr>
		<td>Age</td>
		<td>${org.age}</td>
	  </tr>
	  
	  <tr>
		<td>Contact No</td>
		<td>${org.contact_no}</td>
	  </tr>
	  
	  <tr>
		<td>Email</td>
		<td>${org.email}</td>
	  </tr>
	  
	  <tr>
		<td>Experience Year</td>
		<td>${org.experience_year}</td>
	  </tr>
	  
	  <tr>
		<td>UserName</td>
		<td>${org.username}</td>
	  </tr>
	  
	  <tr>
		<td>Password</td>
		<td>${org.password}</td>
	  </tr>
     
      
      </c:forEach>
      
      </table>
      
      <c:url value="updateorganizer.jsp" var="orgupdate">
      
          <c:param name="id" value="${id}"/>
          <c:param name="name" value="${name}"/>
          <c:param name="age" value="${age}"/>
          <c:param name="contact_no" value="${contact_no}"/>
          <c:param name="email" value="${email}"/>
          <c:param name="experience_year" value="${experience_year}"/>
          <c:param name="uname" value="${username}"/>
          <c:param name="pass" value="${password}"/>
      
      </c:url>
      
      <a href="${orgupdate}">
      <input type="button" name="update" value="Update">
      </a>

</body>
</html>