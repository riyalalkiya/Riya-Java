<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update Student</title>
</head>
<body>
    <h1>Update Student</h1>
    <form action="student" method="post">
        <input type="hidden" name="action" value="update">
        ID: <input type="text" name="id" required><br>
        First Name: <input type="text" name="fname" required><br>
        Last Name: <input type="text" name="lname" required><br>
        Email: <input type="email" name="email" required><br>
        Mobile: <input type="text" name="mobile" required><br>
        <button type="submit">Update</button>
    </form>
    <a href="index.jsp">Back to Main</a>
</body>
</html>
