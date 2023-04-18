package com.example.DYmall.product.dto;

import com.example.DYmall.product.domain.Product;
import lombok.Data;

/**
 * Product 엔티티를 기반으로 클라이언트에 반환할 ProductResponse DTO 클래스.
 * Product 엔티티에서 필요한 필드들을 선택적으로 매핑하여 반환.
 *
 * @version 1.0
 * @Author seodong-geun
 * @since 2023/04/18
 */
@Data
public class ProductResponse {

    private Long id; // 상품 ID
    private String name; // 상품 이름
    private String description; // 상품 설명
    private int price; // 상품 가격
    private Integer stock; // 상품 재고
    private String category; // 상품 카테고리
    private String brand; // 상품 브랜드

    /**
     * Product 엔티티를 받아서 ProductResponse 객체를 생성.
     * 필요한 필드들을 선택적으로 매핑합니다.
     *
     * @param product Product 엔티티
     */
    public ProductResponse(Product product) {
        this.id = product.getId(); // 상품 ID 매핑
        this.name = product.getName(); // 상품 이름 매핑
        this.description = product.getDescription(); // 상품 설명 매핑
        this.price = product.getPrice(); // 상품 가격 매핑
        this.stock = product.getStock(); // 상품 재고 매핑
        this.category = product.getCategory(); // 상품 카테고리 매핑
        this.brand = product.getBrand(); // 상품 브랜드 매핑
    }
}
