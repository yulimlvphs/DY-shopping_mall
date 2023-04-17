package com.example.DYmall.product;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.util.Date;

import static javax.persistence.GenerationType.AUTO;

/**
 * @version 1.0
 * @Author seodong-geun
 * @since 2023/04/10
 */
@Entity // JPA 엔티티 클래스임을 나타냄
@Data // Getter/Setter, equals, hashCode, toString 등을 자동으로 생성
@NoArgsConstructor // 파라미터가 없는 기본 생성자를 자동으로 생성
@AllArgsConstructor // 모든 필드를 인자로 받는 생성자를 자동으로 생성
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = AUTO) // 자동으로 생성되는 값
    private Long id; // 상품 테이블 기본키(id)

    @Column(nullable = false)
    private String name; // 상품명

    @Column(nullable = false)
    private String description; // 상품설명

    @Column(nullable = false)
    private int price; // 상품가격

    @Column(nullable = false)
    private int stock; // 재고

    @Column(nullable = false)
    private String category; // 상품 카테고리

    @Column(nullable = false)
    private String brand; // 상품 브랜드

    @Column(nullable = false, updatable = false)
    private Date created; // 생성일자

    @Column(nullable = false)
    private Date updated; // 수정일자

    // Constructors, getters, and setters
}
