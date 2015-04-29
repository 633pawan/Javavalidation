<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>
<a href="<%=response.encodeURL("checkUser?productCode=8600")%>">
The doors -people are stranger-Jim Morission</a><br>
<a href="<%= response.encodeURL("checkUser?productCode=pf001") %>">pink
floyd- Another Brick In the Wall</a><br>
<a href="<%= response.encodeURL("checkUser?productCode=pf002") %>">
Hey Jude-The beatles collection</a><br>
<a  href="<%= response.encodeURL("checkUser?productCode=jr001") %>">rock
you like a hurricane- Scorpio_The Band__</a>
</p>


</body>
</html>