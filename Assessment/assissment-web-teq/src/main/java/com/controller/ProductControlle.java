package com.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.IOException;
import java.sql.SQLException;

import com.bean.Product;
import com.dao.ProductDAO;
@MultipartConfig
public class ProductControlle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 String action = request.getParameter("action");
	        if ("add".equals(action)) {
	            String name = request.getParameter("name");
	            String category = request.getParameter("category");
	            String model = request.getParameter("model");
	            double price = Double.parseDouble(request.getParameter("price"));
	            String description = request.getParameter("description");

	            Part filePart = request.getPart("image");
	            String fileName = filePart.getSubmittedFileName();
	            String imagePath = "images/" + fileName;

	            // Save file to server
	            filePart.write(getServletContext().getRealPath("/") + imagePath);

	            Product product = new Product();
	            product.setName(name);
	            product.setCategory(category);
	            product.setModel(model);
	            product.setPrice(price);
	            product.setDescription(description);
	            product.setImage(imagePath);

	            ProductDAO productDAO = new ProductDAO(); // Create an instance
	            try {
	                productDAO.addProduct(product); // Use instance method
	                response.sendRedirect("viewProducts.jsp");
	            } catch (SQLException e) {
	                e.printStackTrace();
	                response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Database error");
	            }
	        }
	    }
	}