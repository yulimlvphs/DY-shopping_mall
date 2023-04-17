package com.example.DYmall.product;

/**
 * @version 1.0
 * @Author seodong-geun
 * @since 2023/04/17
 */
public interface ProductService {

    // 상품 생성(이름, 설명, 가격, 재고, 카테고리, 브랜드)
    Product createProduct(String name, String description, int price, int stock, String category, String brand);
    // 상품 아이디로 상품 객체 가져오기
    Product getProduct(Long id);
    // 상품 정보 업데이트(상품 ID, 이름, 설명, 가격, 재고, 카테고리, 브랜드)
    void updateProduct(Long id, String name, String description, int price, int stock, String category, String brand);

    // 상품 ID로 상품 삭제
    void deleteProduct(Long id);
}
