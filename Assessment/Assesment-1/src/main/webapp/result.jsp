<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Operation Result</title>
</head>
<body>
<%
    String message = request.getParameter("message");
    if (message != null) {
%>
    <h2>Result:</h2>
    <p><%= message %></p>
<%
    } else {
%>
    <h2>No message to display.</h2>
<%
    }
%>
    <a href="index.jsp">Back to Main Page</a>
</body>
</html>
