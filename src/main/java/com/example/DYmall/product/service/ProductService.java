package com.example.DYmall.product.service;

import com.example.DYmall.product.domain.Product;
import com.example.DYmall.product.dto.ProductDto;


/**
 * @version 1.0
 * @Author seodong-geun
 * @since 2023/05/03
 */
public interface ProductService {

    /**
     * 상품 정보 수정 기능
     * @param productDto 상품 정보 DTO
     * @return 수정된 상품 ID
     */
    Long updateItem(ProductDto productDto);


    /**
     * 상품 정보 DTO 객체를 상품 엔티티 객체로 변환하는 기능
     * @param dto 상품 정보 DTO
     * @return 상품 엔티티
     */
    // Java 8부터는 디폴트 메소드 인터페이스에 작성 시 구현객체에서 바로 사용가능
    default Product dtoToEntity(ProductDto dto) {
        // Product의 객체를 builder로 생성 후 entity에 저장후 반환
        Product entity = Product.builder()
                .id(dto.getId())
                .name(dto.getName())
                .description(dto.getDescription())
                .price(dto.getPrice())
                .stock(dto.getStock())
                .category(dto.getCategory())
                .brand(dto.getBrand())
                .build();
        return entity;
    }
}

