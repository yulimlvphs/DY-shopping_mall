package com.example.DYmall.product.domain;

import lombok.*;
import javax.persistence.*;

/**
 * @version 1.0
 * @Author seodong-geun
 * @since 2023/04/10
 */
@Entity // JPA 엔티티 클래스임을 나타냄
@Data
@Table(name = "product")
public class Product extends BaseEntity{

    @Id
    @Column(name = "product_id")
    @GeneratedValue(strategy = GenerationType.AUTO) // 기본키 자동 생성
    private Long id; // 상품코드

    @Column(length = 200, nullable = false)
    private String name; // 상품명

    @Column(nullable = false)
    private int price; // 상품가격

    @Column(length = 1500, nullable = false)
    private String description; // 상품설명

    @Column(nullable = false)
    private int stock; // 재고

}