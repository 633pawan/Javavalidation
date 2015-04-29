<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
      <%@ page import="com.abyssibex.User" %>
      <%@ page import ="com.pakage.mvc.ServletOne" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<% User user = (User) request.getAttribute("user"); %>


   
    <h1> Thank You for joining the list</h1>
    <p> here is the information you entered</p>
       
       
      <table cellspacing="5" border="0">
             
                <tr>
                    <td align="right">First Name</td>
                    <td><% user.getFirstName(); %></td>
                </tr>               
                
                  <tr>
                    <td align="right">Last  Name</td>
                       <td><%= user.getLastName() %></td>
                </tr> 
                
                  <tr>
                    <td align="right">Email Address</td>
                         <td><%= user.getEmailAddress() %></td>
                </tr> 
   </table>
     <p> To enter other input information go back and enter. or  
     press return to proceed</p> 
     <form action="index.html" method="post">
     <input type="submit" value="return">
     </form>  
       
       
    </body>
</html>







</body>
</html>