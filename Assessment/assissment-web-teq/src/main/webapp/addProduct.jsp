<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="header.jsp" %>
<html>
<head>
    <title>Add Product</title>
</head>
<body>
<div class="container">
    <h2>Add Product</h2>
    <form action="product" method="post" enctype="multipart/form-data">
        <input type="hidden" name="action" value="add">
        Product Name: <input type="text" name="name" required><br>
        Product Category: <input type="text" name="category" required><br>
        Product Model: <input type="text" name="model" required><br>
        Price: <input type="number" name="price" step="0.01" required><br>
        Product Description: <textarea name="description" required></textarea><br>
        Product Image: <input type="file" name="image" required><br>
        <input type="submit" value="Submit">
    </form>
</div>
</body>
</html>
