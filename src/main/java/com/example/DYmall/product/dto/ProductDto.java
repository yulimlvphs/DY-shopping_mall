package com.example.DYmall.product.dto;

import lombok.*;
import java.time.LocalDateTime;

/**
 * @version 1.0
 * @Author seodong-geun
 * @since 2023/05/03
 *  Product 엔티티와 상응하는 데이터 전송 객체
 */
@Getter // Getter 메소드 자동생성
@Setter // Setter 메소드 자동생성
public class ProductDto {
    private Long id;
    private String name;
    private Integer price;
    private String description;
    private Integer stock;
    private LocalDateTime regDate, modDate;
}


