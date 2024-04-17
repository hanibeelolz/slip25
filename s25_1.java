<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
<form action="slip25.jsp" method="post">
Name : <input type="text" name="name">

Age : <input type="text" name="age">

<input type="submit" value="Check">
</form>
</body>
</html>

Slip25.jsp

<%@page language="java" import="java.util.*"%>

<%
String name = request.getParameter("name");
int age = Integer.parseInt(request.getParameter("age"));
if(age >=18)
{
out.println(name + "\nAllowed to vote");
}
else
{
out.println(name + "\nNot allowed to vote");
}
%>
