package com.demo.productmicroservice2.dao;

import com.demo.productmicroservice2.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ProductDao extends JpaRepository<Product, Integer> {
}
