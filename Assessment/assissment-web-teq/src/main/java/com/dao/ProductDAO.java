package com.dao;

import com.bean.Product;
import com.util.DBUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {
    public void addProduct(Product product) throws SQLException {
        String query = "INSERT INTO products (name, category, model, price, description, image) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection con = DBUtil.createConnection();
             PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, product.getName());
            ps.setString(2, product.getCategory());
            ps.setString(3, product.getModel());
            ps.setDouble(4, product.getPrice());
            ps.setString(5, product.getDescription());
            ps.setString(6, product.getImage());
            ps.executeUpdate();
        }
    }

    public List<Product> getAllProducts() throws SQLException {
        List<Product> productList = new ArrayList<>();
        String query = "SELECT * FROM products";
        try (Connection con = DBUtil.createConnection();
             PreparedStatement ps = con.prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Product product = new Product();
                product.setId(rs.getInt("id"));
                product.setName(rs.getString("name"));
                product.setCategory(rs.getString("category"));
                product.setModel(rs.getString("model"));
                product.setPrice(rs.getDouble("price"));
                product.setDescription(rs.getString("description"));
                product.setImage(rs.getString("image"));
                productList.add(product);
            }
        }
        return productList;
    }

    public void deleteProduct(int id) throws SQLException {
        String query = "DELETE FROM products WHERE id = ?";
        try (Connection con = DBUtil.createConnection();
             PreparedStatement ps = con.prepareStatement(query)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        }
    }

    // Add edit and update methods as needed.
}
