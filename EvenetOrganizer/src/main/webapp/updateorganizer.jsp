<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

      <%
      
          String id = request.getParameter("id");
          String name = request.getParameter("name");
          String age = request.getParameter("age");
          String contact_no = request.getParameter("contact_no");
          String email = request.getParameter("email");
          String experience_year = request.getParameter("experience_year");
          String username = request.getParameter("uname");
          String password = request.getParameter("pass");
     
      %>


      <form action="update" method="post">
      
           Organizer ID <input type="text" name="orgid" value="<%= id%>" readonly><br><br>
           Name <input type="text" name="name" value="<%= name%>"><br><br>
           Age <input type="text" name="age" value="<%= age%>"><br><br>
           Contact No <input type="text" name="contact_no" value="<%= contact_no%>"><br><br>
           Email <input type="text" name="email" value="<%= email%>"><br><br>
           Experience Year <input type="text" name="experience_year" value="<%= experience_year%>"><br><br>
           UserName <input type="text" name="uname" value="<%= username%>"><br><br>
           Password <input type="password" name="pass" value="<%= password%>"><br><br>
           
           <input type="submit" name="submit" value="Update"><br><br>  
      
      </form>

</body>
</html>