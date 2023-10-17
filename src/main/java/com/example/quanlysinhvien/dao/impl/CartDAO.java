package com.example.quanlysinhvien.dao.impl;

import com.example.quanlysinhvien.dao.ICartDAO;
import com.example.quanlysinhvien.model.Cart;
import com.example.quanlysinhvien.model.Product;
import com.example.quanlysinhvien.utils.JDBCConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CartDAO implements ICartDAO {
    private final String SELECT_ALL_CART= "SELECT*FROM shoppingcart";
    @Override
    public List<Cart> getAllCart() {
        List<Cart> carts = new ArrayList<>();

        try (Connection connection = JDBCConnection.getConnection()) {
            PreparedStatement ps = connection.prepareStatement(SELECT_ALL_CART);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Cart cart = new Cart();
                cart.setCartId(rs.getInt("cart_id"));

            }

        } catch(SQLException e){
            e.printStackTrace();
        }

        return carts;
    }
}
