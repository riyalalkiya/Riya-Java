<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.dao.ProductDAO" %>
<%@ page import="com.bean.Product" %>
<%@ page import="java.util.List" %>
<%@ include file="header.jsp" %>
<html>
<head>
    <title>View Products</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<div class="container">
    <h2>Products</h2>
    <%
        ProductDAO productDAO = new ProductDAO();
        List<Product> products = productDAO.getAllProducts();
        if (products != null && !products.isEmpty()) {
            for (Product product : products) {
    %>
                <div class="card" style="margin: 10px;">
                    <img src="<%= product.getImage() %>" class="card-img-top" alt="<%= product.getName() %>">
                    <div class="card-body">
                        <h5 class="card-title"><%= product.getName() %></h5>
                        <p class="card-text"><%= product.getDescription() %></p>
                        <a href="editProduct.jsp?id=<%= product.getId() %>" class="btn btn-primary">Edit</a>
                        <a href="deleteProduct.jsp?id=<%= product.getId() %>" class="btn btn-danger">Delete</a>
                    </div>
                </div>
    <%
            }
        } else {
    %>
            <p>No products available.</p>
    <%
        }
    %>
</div>
</body>
</html>
