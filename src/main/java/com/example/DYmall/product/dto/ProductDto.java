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
@NoArgsConstructor // 파라미터가 없는 기본 생성자 자동생성
@AllArgsConstructor // 모든 필드를 인자로 받는 생성자 자동생성
@Builder // 필드가 많아져도 객체 생성시 가독성이 좋아지는 빌터 패턴 자동생성
public class ProductDto {
    private Long id;
    private String name;
    private String description;
    private int price;
    private int stock;
    private String category;
    private String brand;
    private LocalDateTime regDate, modDate;
}


