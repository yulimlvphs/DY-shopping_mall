package com.example.DYmall.product.dto;

import com.example.DYmall.product.domain.Product;
import lombok.Getter;
import lombok.Setter;
import org.modelmapper.ModelMapper;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @version 1.1
 * @Author seodong-geun
 * @since 2023/05/09
 * 상품 정보를 담은 폼(form) 데이터를 담는 DTO 클래스
 */
@Getter
@Setter
public class ProductFormDto {

    // modelMapper 객체 생성
    // Java Bean을 이용하여 객체간의 매핑을 쉽게 처리할 수 있도록 도와주는 라이브러리
    private static ModelMapper modelMapper = new ModelMapper();
    private Long id;

    @NotBlank(message = "상품명은 필수 입력 값입니다.")
    private String name;

    @NotNull(message = "상품의 가격은 필수 입력 값입니다.")
    private Integer price;

    @NotBlank(message = "상품 설명은 필수 입력 값입니다.")
    private String description;

    @NotNull(message = "상품 재고는 필수 입력 값입니다.")
    private Integer stock;

    // ProductFormDto 객체를 Product 객체로 변환하여 반환
    public Product createProduct(){
        return modelMapper.map(this, Product.class);
    }

    // Product 객체를 ProductFormDto 객체로 변환하여 반환
    public static ProductFormDto of(Product product){
        return modelMapper.map(product, ProductFormDto.class);
    }
}
