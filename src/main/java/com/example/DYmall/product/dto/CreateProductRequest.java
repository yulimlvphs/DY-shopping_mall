package com.example.DYmall.product.dto;

import lombok.Data;

import javax.validation.constraints.*;
/**
 * 상품 등록 요청 DTO 클래스
 * @version 1.0
 * @Author seodong-geun
 * @since 2023/04/18
 */

@Data // 자동으로 getter, setter 생성
public class CreateProductRequest {

    @NotBlank(message = "상품 이름은 필수 입력 값입니다.")
    private String name;

    @NotBlank(message = "상품 설명은 필수 입력 값입니다.")
    private String description;

    @NotNull(message = "상품 가격은 필수 입력 값입니다.")
    @Positive(message = "상품 가격은 양수여야 합니다.")
    private int price;

    @NotNull(message = "상품 재고는 필수 입력 값입니다.")
    @Min(value = 0, message = "상품 재고는 0 이상이어야 합니다.")
    private int stock;

    @NotBlank(message = "상품 카테고리는 필수 입력 값입니다.")
    private String category;

    @NotBlank(message = "상품 브랜드는 필수 입력 값입니다.")
    private String brand;
}