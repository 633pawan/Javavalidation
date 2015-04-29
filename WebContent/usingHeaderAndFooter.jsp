<%@ include file="/header.jsp/" %>
<%@ page import="com.abyssibex.User" %>
<%User user =(User) request.getAttribute("user"); %>
First Name = <% user.getFirstName(); %>
Last Name = <% user.getLastName(); %>
Email Address = <% user.getEmailAddress(); %>

<%@ include file="/footer.jsp" %>