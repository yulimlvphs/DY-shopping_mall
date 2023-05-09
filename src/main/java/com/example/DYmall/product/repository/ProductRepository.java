package com.example.DYmall.product.repository;

import com.example.DYmall.product.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @version 1.0
 * @Author seodong-geun
 * @since 2023/04/10
 */
public interface ProductRepository extends JpaRepository<Product, Long> {
}
