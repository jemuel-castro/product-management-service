package com.jmc.productmanagementservice.controllers;

import com.jmc.productmanagementservice.models.ProductModel;
import com.jmc.productmanagementservice.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/list")
    public ProductModel getProductList() {
        return productService.getProductList();
    }
}
