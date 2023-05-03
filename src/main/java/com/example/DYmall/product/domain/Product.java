package com.example.DYmall.product.domain;

import lombok.*;
import javax.persistence.*;

/**
 * @version 1.0
 * @Author seodong-geun
 * @since 2023/04/10
 */
@Entity // JPA 엔티티 클래스임을 나타냄
@Getter
@Builder
@NoArgsConstructor // 파라미터가 없는 기본 생성자를 자동으로 생성
@AllArgsConstructor // 모든 필드를 인자로 받는 생성자를 자동으로 생성
@ToString
@Table(name = "product")
public class Product extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 기본키 자동 생성
    private Long id; // 상품 테이블 기본키(id)

    @Column(length = 200, nullable = false)
    private String name; // 상품명

    @Column(length = 1500,nullable = false)
    private String description; // 상품설명

    @Column(nullable = false)
    private int price; // 상품가격

    @Column(nullable = false)
    private int stock; // 재고

    @Column(nullable = false)
    private String category; // 상품 카테고리

    @Column(nullable = false)
    private String brand; // 상품 브랜드

    // 생성자, getters, setters
}
