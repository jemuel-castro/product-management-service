package com.jmc.productmanagementservice.services;

import com.jmc.productmanagementservice.entities.Product;
import com.jmc.productmanagementservice.models.ProductModel;
import com.jmc.productmanagementservice.repositories.ProductRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private ProductRespository productRespository;

    @Autowired
    public ProductService(ProductRespository productRespository) {
        this.productRespository = productRespository;
    }

    public ProductModel getProductList() {
        List<Product> productList = productRespository.findAll();
        return new ProductModel(productList);
    }
}
