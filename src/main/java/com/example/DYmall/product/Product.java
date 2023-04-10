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
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private int price;

    @Column(nullable = false)
    private int stock;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private String manufacturer;

    @Column(nullable = false, updatable = false)
    private Date created;

    @Column(nullable = false)
    private Date updated;

    // Constructors, getters, and setters
}
