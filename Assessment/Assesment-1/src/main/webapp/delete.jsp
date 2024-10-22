<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete Student</title>
</head>
<body>
    <h1>Delete Student</h1>
    <form action="student" method="post">
        <input type="hidden" name="action" value="delete">
        ID: <input type="text" name="id" required><br>
        <button type="submit">Delete</button>
    </form>
    <a href="index.jsp">Back to Main</a>
</body>
</html>
