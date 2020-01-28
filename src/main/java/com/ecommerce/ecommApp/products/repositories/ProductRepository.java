package com.ecommerce.ecommApp.products.repositories;

import com.ecommerce.ecommApp.products.tables.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
