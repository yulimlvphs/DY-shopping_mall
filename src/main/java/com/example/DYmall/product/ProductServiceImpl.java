package com.example.DYmall.product;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.Date;
/**
 * @version 1.0
 * @Author seodong-geun
 * @since 2023/04/17
 */
@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // 상품 생성
    @Override
    @Transactional
    public Product createProduct(String name, String description, int price, int stock, String category, String brand) {
        Product product = new Product();
        product.setName(name);
        product.setDescription(description);
        product.setPrice(price);
        product.setStock(stock);
        product.setCategory(category);
        product.setBrand(brand);
        product.setCreated(new Date());
        product.setUpdated(new Date());
        return productRepository.save(product);
    }

    // 상품 조회
    @Override
    @Transactional(readOnly = true)
    public Product getProduct(Long id) {
        return productRepository.findById(id).orElseThrow(() -> new ProductNotFoundException(id));
    }

    // 상품 수정
    @Override
    @Transactional
    public void updateProduct(Long id, String name, String description, int price, int stock, String category, String brand) {
        Product product = getProduct(id);
        product.setName(name);
        product.setDescription(description);
        product.setPrice(price);
        product.setStock(stock);
        product.setCategory(category);
        product.setBrand(brand);
        product.setUpdated(new Date());
        productRepository.save(product);
    }

    // 상품 삭제
    @Override
    @Transactional
    public void deleteProduct(Long id) {
        Product product = getProduct(id);
        productRepository.delete(product);
    }
}
