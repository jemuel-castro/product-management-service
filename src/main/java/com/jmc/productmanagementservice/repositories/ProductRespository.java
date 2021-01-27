package com.jmc.productmanagementservice.repositories;

import com.jmc.productmanagementservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRespository extends JpaRepository<Product, Long> {

}
