package com.example.DYmall.repository;

import com.example.DYmall.product.domain.Product;
import com.example.DYmall.product.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.IntStream;

/**
 * @version 1.0
 * @Author seodong-geun
 * @since 2023/05/03
 */
@SpringBootTest // 테스트하기 위한 어노테이션
public class ProductRepostioryTests {

    @Autowired
    private ProductRepository productRepository;

    // (DB)상품 등록 테스트
    @Test
    public void insertProductDummies(){
        // 1부터 200까지의 숫자를 생성하고 forEach() 메서드로 각 숫자에 대한 람다식 수행.
        IntStream.rangeClosed(1,200). forEach(i -> {
            // Builder 패턴을 사용하여 Product 객체를 생성 후 DB에 저장
            Product product = Product.builder()
                    .name("[" + i + "]번째 상품이름")
                    .description("description..상품설명" + i)
                    .price(i * 10 + 100)
                    .stock(10)
                    .category("카테고리....")
                    .brand("브랜드....")
                    .build();
            System.out.println(productRepository.save(product));
        });
    }
}
