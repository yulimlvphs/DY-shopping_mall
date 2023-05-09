package com.example.DYmall.service;

import com.example.DYmall.product.domain.Product;
import com.example.DYmall.product.dto.ProductFormDto;
import com.example.DYmall.product.repository.ProductRepository;
import com.example.DYmall.product.service.ProductService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @version 1.0
 * @Author seodong-geun
 * @since 2023/05/03
 */
@SpringBootTest
public class ProductServiceTests {

    @Autowired
    private ProductService productService;
    @Autowired
    private ProductRepository productRepository;

    @Test
    @DisplayName("상품 등록 테스트")
    void createItem() {

        // given
        ProductFormDto productFormDto = new ProductFormDto();
        productFormDto.setName("테스트 상품 명");
        productFormDto.setDescription("테스트 상품 설명");
        productFormDto.setPrice(500);
        productFormDto.setStock(20);

        // when
        Long productID = productService.saveProduct(productFormDto);
        Product product = productRepository.findById(productID)
                .orElseThrow(EntityNotFoundException::new);

        // then
        assertEquals(productFormDto.getName(), product.getName());
        assertEquals(productFormDto.getDescription(), product.getDescription());
        assertEquals(productFormDto.getPrice(), product.getPrice());
        assertEquals(productFormDto.getStock(), product.getStock());

    }

}
