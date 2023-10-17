package com.example.quanlysinhvien.service.impl;

import com.example.quanlysinhvien.dao.IProductDAO;
import com.example.quanlysinhvien.dao.impl.ProductDAO;
import com.example.quanlysinhvien.model.Product;
import com.example.quanlysinhvien.service.IProductService;

import java.util.List;

public class ProductService implements IProductService {
    IProductDAO productDAO= new ProductDAO();
    @Override
    public List<Product> getAllProducts() {
        return productDAO.getALlProducts();
    }
}
