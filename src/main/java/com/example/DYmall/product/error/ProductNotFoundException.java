package com.example.DYmall.product.error;

/**
 * @version 1.0
 * @Author seodong-geun
 * @since 2023/04/18
 */
/**
 * 상품을 찾을 수 없을 때 발생하는 예외 클래스
 */
public class ProductNotFoundException extends RuntimeException {

    /**
     * 생성자
     * @param id 찾을 수 없는 상품의 id
     */
    public ProductNotFoundException(Long id) {
        super("Product not found with id: " + id);
    }
}