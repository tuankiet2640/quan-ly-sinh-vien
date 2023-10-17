package com.example.quanlysinhvien.controller;

import com.example.quanlysinhvien.model.Product;
import com.example.quanlysinhvien.service.IProductService;
import com.example.quanlysinhvien.service.impl.ProductService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name="ProductController", value="/products")
public class ProductController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
       req.setCharacterEncoding("UTF-8");
        String action = req.getParameter("action");

        if(action==null){
            action = "";
        }

        switch (action){
            case "buy":
                int productId= Integer.parseInt(req.getParameter("productId"));
                addToCart(productId);
                break;
            default:
                listProduct(req,res);
        }
    }

    private void addToCart(int productId) {

    }

    private void listProduct(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        IProductService productService= new ProductService();
        List<Product> products = productService.getAllProducts();

        req.setAttribute("products",products);
        RequestDispatcher dispatcher= req.getRequestDispatcher("/WEB-INF/product.jsp");
        dispatcher.forward(req,res);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
