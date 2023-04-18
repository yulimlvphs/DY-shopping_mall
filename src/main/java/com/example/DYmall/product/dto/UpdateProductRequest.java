package com.example.DYmall.product.dto;

/**
 * 상품 정보를 수정할 때 클라이언트로부터 받는 요청(Request) DTO 클래스
 * @version 1.0
 * @Author seodong-geun
 * @since 2023/04/18
 */
import lombok.Data;

import javax.validation.constraints.*;

@Data // Getter/Setter, equals, hashCode, toString 등을 자동으로 생성
public class UpdateProductRequest {

    @NotBlank(message = "상품 이름은 필수 입력 값입니다.")
    private String name;

    @NotBlank(message = "상품 설명은 필수 입력 값입니다.")
    private String description;

    @NotNull(message = "상품 가격은 필수 입력 값입니다.")
    @Positive(message = "상품 가격은 양수여야 합니다.")
    private int price;

    @NotNull(message = "상품 재고는 필수 입력 값입니다.")
    @Min(value = 0, message = "상품 재고는 0 이상이어야 합니다.")
    private Integer stock;

    @NotBlank(message = "상품 카테고리는 필수 입력 값입니다.")
    private String category;

    @NotBlank(message = "상품 브랜드는 필수 입력 값입니다.")
    private String brand;
}
