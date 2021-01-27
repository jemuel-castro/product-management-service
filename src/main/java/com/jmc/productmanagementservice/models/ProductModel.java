package com.jmc.productmanagementservice.models;

import com.jmc.productmanagementservice.entities.Product;

import java.util.List;

public class ProductModel {

    private List<Product> productList;

    public ProductModel() {
    }

    public ProductModel(List<Product> productList) {
        this.productList = productList;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
