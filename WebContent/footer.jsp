<%@ page import="java.util.*" %>
<%@page import="java.util.Calendar.*" %>
<%

// Initalize the current year

GregorianCalendar currentDate = new GregorianCalendar();

int currentYear = currentDate.get(Calendar.YEAR);


%>
<p>&copy; Copyright <%= currentYear %> Servlet Practise &amp; Home Learning
 All Rights Reserved</p>
 </body>
 </html>
