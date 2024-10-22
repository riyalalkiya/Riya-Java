<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Search Student</title>
</head>
<body>
    <h1>Search Student</h1>
    <form action="student" method="post">
        <input type="hidden" name="action" value="search">
        ID: <input type="text" name="id" required><br>
        <button type="submit">Search</button>
    </form>
    <a href="index.jsp">Back to Main</a>
</body>
</html>
