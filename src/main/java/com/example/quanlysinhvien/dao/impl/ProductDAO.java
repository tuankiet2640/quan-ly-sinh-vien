package com.example.quanlysinhvien.dao.impl;

import com.example.quanlysinhvien.dao.IProductDAO;
import com.example.quanlysinhvien.model.Product;
import com.example.quanlysinhvien.utils.JDBCConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO implements IProductDAO {

    private final String SELECT_ALL_PRODUCTS= "SELECT * FROM product";

    @Override
    public List<Product> getALlProducts() {
        List<Product> products = new ArrayList<>();

        try (Connection connection = JDBCConnection.getConnection()) {
            PreparedStatement ps = connection.prepareStatement(SELECT_ALL_PRODUCTS);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Product product= new Product();
                product.setProductId(rs.getInt("product_id"));
                product.setProductName(rs.getString("product_name"));
                product.setPrice(rs.getFloat("price"));
                product.setDescription(rs.getString("description"));
                product.setImageUrl(rs.getString("image_url"));

                products.add(product);
            }


        } catch(SQLException e){
            e.printStackTrace();
        }

        return products;
    }
}
